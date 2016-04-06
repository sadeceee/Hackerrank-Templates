//
// Created by Tim Kilian on 29.02.16.
// M. Dietzfelbinger, K. Mehlhorn, P. Sanders: Algorithmen und Datenstrukturen, Die Grundwerkzeuge, Springer Vieweg, 2014, S.15-18
//

#include <assert.h>
#include "Arithmetic.h"

void Arithmetic::fullAdder(digit a, digit b, digit c, digit &s, digit &carry) {
    digit sum = a + b + c;
    carry = sum / B;
    s = sum - carry * B;
}

void Arithmetic::digitMult(digit a, digit b, digit &s, digit &carry) {
    digit prod = a * b;
    carry = prod / B;
    s = prod - carry * B;
}

digit Arithmetic::getDigit(const integer &a, int i) {
    return (i < a.size()) ? a[i] : 0;
}

digit Arithmetic::randDigit() {
    X = 443143 * X + 6412431;
    return X % B;
}

void Arithmetic::randInteger(integer &a) {
    digit n = a.size();
    for (int i=0; i<n; i++) a[i] = randDigit();
}

/**
 * School method
 * O(n²)
 */
void Arithmetic::mult(const integer &a, const digit &b, integer &atimesb) {
    digit n = a.size();
    assert(atimesb.size() == n+1);
    digit carry = 0, c, d, cprev = 0;
    for (int i = 0; i < n; i++) {
        digitMult(a[i], b, d, c);
        fullAdder(d, cprev, carry, atimesb[i], carry);
        cprev = 0;
    }
    d = 0;
    fullAdder(d, cprev, carry, atimesb[n], carry);
    assert(carry == 0);
}

void Arithmetic::addAt(integer &p, const integer &atimesbj, int j) {
    digit carry = 0;
    for (int i = j, n = p.size(); i < n; i++)
        fullAdder(p[i], getDigit(atimesbj, i-j), carry, p[i], carry);
    assert(carry == 0);
}

integer Arithmetic::mult(const integer &a, const integer &b) {
    int n = a.size();
    int m = b.size();
    integer p(n+m, 0);
    integer atimesbj(n+1);
    for (int j = 0; j < m; j++) {
        mult(a, b[j], atimesbj);
        addAt(p, atimesbj, j);
    }
    return p;
}

/**
 * Karatsuba-algorithm
 * O(n^log2(3))
 */
integer Arithmetic::add(const integer &a, const integer &b) {
    int n = max(a.size(), b.size());
    integer s(n+1);
    digit carry = 0;
    for (int i = 0; i < n; i++)
        fullAdder(getDigit(a, i), getDigit(b, i), carry, s[i], carry);
    s[n] = carry;
    return s;
}

/**
 * @require: a >= b
 */
void Arithmetic::sub(integer &a, const integer &b) {
    digit carry = 0;
    for (int i = 0, n = a.size(); i < n; i++) {
        if (a[i] >= (getDigit(b, i) + carry)) {
            a[i] = a[i] - getDigit(b, i) - carry;
            carry = 0;
        }
        else {
            a[i] = a[i] + B - getDigit(b, i) - carry;
            carry = 1;
        }
    }
    assert(carry == 0);
}

void Arithmetic::split(const integer &a, integer &a1, integer &a0) {
    int n = a.size();
    int k = n/2;
    for (int i = 0; i < k; i++) a0[i] = a[i];
    for (int i = 0; i < n - k; i++) a1[i] = a[k+i];
}

integer Arithmetic::karatsuba(const integer &a, const integer &b, int n0) {
    int n = a.size();
    int m = b.size();
    assert(n == m);
    assert(n0 >= 4);
    integer p(2*n);

    if (n < n0) return mult(a, b);

    int k = n/2;
    integer a0(k), a1(n-k), b0(k), b1(n-k);
    split(a, a1, a0); split(b, b1, b0);

    integer p2 = karatsuba(a1, b1, n0),
            p1 = karatsuba(add(a1, a0), add(b1, b0), n0),
            p0 = karatsuba(a0, b0, n0);

    for (int i = 0; i < 2 * k; i++) p[i] = p0[i];
    for (int i = 2*k; i < n+m; i++) p[i] = p2[i-2*k];

    sub(p1, p0);
    sub(p1, p2);
    addAt(p, p1, k);
    return p;
}
