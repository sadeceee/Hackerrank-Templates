cmake_minimum_required(VERSION 3.3)
project(CppTemplate)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp Sorting.cpp Sorting.h Arithmetic.cpp Arithmetic.h)
add_executable(CppTemplate ${SOURCE_FILES})