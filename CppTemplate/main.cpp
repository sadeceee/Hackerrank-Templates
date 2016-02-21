#include <iostream>
#include <vector>

using namespace std;

#define repeat(i, a, b) for (int i=a; i<b; i++)
#define iterate(i, n) repeat(i, 0, n)
#define decline(i, a, b) for (int i=a-1; i>=b; i--)

typedef long long int ll;
typedef unsigned long long int ull;
typedef vector<int> vi;

const int MOD = 1e9+7;
bool period = false;

void run();
void solution() {

}

int main() {
    run();
    return 0;
}

void run() {
    clock_t begin_time = clock();
    int T=1;
    //scanf("%d", &T);
    while (T-->0)
        solution();
    if (period) cout << double(clock()-begin_time)/CLOCKS_PER_SEC << endl;
}