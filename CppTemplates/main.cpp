#include <iostream>
#include <vector>

using namespace std;

#define repeat(i, a, b) for (int i=a; i<b; i++)
#define iterate(i, n) repeat(i, 0, n)
#define decline(i, a, b) for (int i=a-1; i>=b; i--)

#define readChar(c) if (scanf("%c", &c)!=1) readError()
#define readCharArr(arr, n) iterate(i, n) readChar(arr[i])
#define readString(s) cin >> s;
#define readStringArr(arr, n) iterate(i, n) readString(arr[i])
#define readInt(i) if (scanf("%d", &i)!=1) readError()
#define readIntArr(arr, n) iterate(i, n) readInt(arr[i])
#define readLong(l) if (scanf("%ld", &l)!=1) readError()
#define readLongLong(l) if (scanf("%lld", &l)!=1) readError()
#define readFloat(f) if (scanf("%f", &f)!=1) readError()
#define readDouble(d) if(scanf("%lf", &d)!=1) readError()
#define readError() printf("failed to read\n")

#define debug(s) cout << s << "\n"
#define ASST(x, l, r) assert( x <= r && x >= l )

#define length(arr) sizeof(arr)/sizeof(arr[0])
#define printInt(n) printf("%d\n", n)
#define printArr(arr) iterate(i, length(arr)) cout << arr[i] << " "
#define printVec(v) iterate(i, v.size()) cout << v[i] << " "

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
//    readInt(T);
    while (T-->0)
        solution();
    if (period) printf("[%lf]", double(clock()-begin_time)/CLOCKS_PER_SEC);
}
