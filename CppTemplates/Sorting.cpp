//
// Created by Tim Kilian on 27.02.16.
//

#include "Sorting.h"

int* Sorting::bubbleSort(int* arr) {
    for (int l = sizeof(arr)/sizeof(int); l>0 ; l++) {
        for (int i = 0; i < l; i++) {
            if (arr[i]>arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
    }
    return arr;
}

int* Sorting::insertionSort(int* arr) {
    for (int i = 1; i < sizeof(arr) / sizeof(int); i++) {
        int a = arr[i];
        int j = i;
        while (j>0 && arr[j-1]>a)
            arr[j] = arr[--j];
        arr[j] = a;
    }
    return arr;
}

int* Sorting::countingSort(int* ar) {
    return countingSort(ar, 100);
}

int* Sorting::countingSort(int* ar, int k) {
    int arr[k];
    int brr[sizeof(ar)/sizeof(int)];

    for (int i = 0; i < sizeof(arr)/sizeof(int); arr[i++]=0);
    for (int i = 0; i < sizeof(ar)/sizeof(int); arr[ar[i++]]++);
    for (int i = 0; i < sizeof(arr)/sizeof(int); arr[i] += arr[i++ -1]);
    for (int i = sizeof(arr)/sizeof(int)-1; i >= 0; brr[--arr[ar[i]]] = ar[i--]);

    return brr;
}

int *Sorting::mergeSort(int *arr) {
    return nullptr;
}

int *Sorting::naturalMergeSort(int *arr) {
    return nullptr;
}

int *Sorting::timSort(int *arr) {
    return nullptr;
}

int *Sorting::quickSort(int *arr) {
    return nullptr;
}
