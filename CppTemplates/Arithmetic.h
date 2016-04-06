//
// Created by Tim Kilian on 29.02.16.
//

#ifndef CPPTEMPLATE_ARITHMETIC_H
#define CPPTEMPLATE_ARITHMETIC_H

#include <iostream>
#include <vector>

using namespace std;

typedef unsigned int digit;
typedef vector<digit> integer;

class Arithmetic {
private:
    // base-10
    digit B = 10;
    digit X = 542351;

    void fullAdder(digit a, digit b, digit c, digit& s, digit& carry);
    void digitMult(digit a, digit b, digit& s, digit& carry);
    digit getDigit(const integer& a, int i);
    digit randDigit();
    // School-method helper
    void mult(const integer& a, const digit& b, integer& atimesb);
    void addAt(integer& p, const integer& atimesbj, int j);
    // Karatsuba-algorithm helper
    integer add(const integer& a, const integer& b);
    void sub(integer& a, const integer& b);
    void split(const integer& a, integer& a1, integer& a0);
public:
    void randInteger(integer& a);
    // School-method
    integer mult(const integer& a, const integer& b);
    // Karatsuba-algorithm
    integer karatsuba(const integer& a, const integer& b, int n0);
};


#endif //CPPTEMPLATE_ARITHMETIC_H
