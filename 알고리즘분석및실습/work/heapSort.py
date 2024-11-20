def shepSort(arr):
    n = len(arr)
    print("i=", 0, arr)
    for i in range(n//2, -1, -1):
        heapify(arr, n, i)
        print("i=", i, arr)
    print()

    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)
        print("i=", i, arr)