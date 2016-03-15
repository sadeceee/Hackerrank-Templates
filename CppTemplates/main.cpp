#include <iostream>
#include <vector>

using namespace std;

#define repeat(i, a, b) for (int i=a; i<b; i++)
#define iterate(i, n) repeat(i, 0, n)
#define decline(i, a, b) for (int i=a-1; i>=b; i--)

#define readChar(n) if (scanf("%c", &n)!=1) readError()
#define readCharArr(arr, n) iterate(i, n) readChar(arr[i])
#define readString(n) if (scanf("%s", &n)!=1) readError()
#define readStringArr(arr, n) iterate(i, n) readString(arr[i])
#define readInt(n) if (scanf("%d", &n)!=1) readError()
#define readIntArr(arr, n) iterate(i, n) readInt(arr[i])
#define readLong(n) if (scanf("%ld", &n)!=1) readError()
#define readLongLong(n) if (scanf("%lld", &n)!=1) readError()
#define readFloat(n) if (scanf("%f", &n)!=1) readError()
#define readDouble(n) if(scanf("%lf", &n)!=1) readError()
#define readError() printf("failed to read\n")

#define length(arr) sizeof(arr)/sizeof(arr[0])
#define printArr(arr) iterate(i, length(arr)) cout << arr[i] << " "

typedef long long int ll;
typedef unsigned long long int ull;
typedef vector<int> vi;

const int MOD = 1e9+7;
bool period = true;

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
    if (period) printf("[%lf]", double(clock()-begin_time)/CLOCKS_PER_SEC);
}