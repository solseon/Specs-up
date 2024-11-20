from heapSort import shepSort

def heapsort(data) :
    heap = []
    result = []
    for e in data:
        heappush(heap, e)

    for i in range(len(data)):
        result.append(heappop(heap))
    return result

def heapsort2(data):
    heap = []
    result = []
    for e in data:
        heappush(heap, -e)

    for i in range(len(data)):
        result.append(-heappop(head))
    return result

def heapsort3(data):
    heap = []
    for e in data:
        heappush(heap, e)

    for i in range(1, len(data)+1):
        data[-i] = heappop(heap)
    return data

print('** 오름차순 **')
new_data = heapsort([1,9,0,7,8,6,3,5])
print(new_data)

print('** 내림차순1 **')
new_data = heapsort2([1,9,0,7,8,6,3,5])
print(new_data)

print('** 내림차순2 **')
new_data = heapsort3([1,9,0,7,8,6,3,5])
print(new_data)