import heapq

def main():
    heap = [0, 1]
    heapq.heapify(heap)

    heapq.heappush(heap, 3)
    heapq.heappush(heap, 2)
    heapq.heappush(heap, 5)
    print(heap)
    heapq.heappop(heap)     # removes smallest
    print(heap)
    print(heap[0])                 # peek

    # max heap trick
    max_heap = []
    heapq.heappush(max_heap, -3)
    heapq.heappush(max_heap, -1)
    heapq.heappush(max_heap, -5)
    print(max_heap)
    -heapq.heappop(max_heap)
    print(max_heap)

if __name__ == "__main__":
    main()