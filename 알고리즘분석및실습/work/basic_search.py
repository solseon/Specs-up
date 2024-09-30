def binary_search(A, key, low, high) :
    if (low > high):
        return -1

    middle = (low + high) // 2

    if (key == A[middle]) :
        return middle
    elif (key < A[middle]) :
        return binary_search(A, key, low, middle - 1)
    else :
        return binary_search(A, key, middle + 1, high)


array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(binary_search(array,3,0,9))   # binary_search(배열이름, key위치번호, 배열시작번호, 배열끝번호)
