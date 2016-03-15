//
// Created by Tim Kilian on 27.02.16.
//

#ifndef CPPTEMPLATE_SORTING_H
#define CPPTEMPLATE_SORTING_H


class Sorting {
private:
    int* countingSort(int *arr, int k);
public:
    // Stable algorithms
    int* bubbleSort(int* arr);
    int* insertionSort(int* arr);
    int* countingSort(int* arr);
    int* mergeSort(int* arr);
    int* naturalMergeSort(int* arr);
    int* timSort(int* arr);

    // Instable algorithms
    int* quickSort(int* arr);
};


#endif //CPPTEMPLATE_SORTING_H
