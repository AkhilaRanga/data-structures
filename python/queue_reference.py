from collections import deque

def main():
    queue = deque()

    queue.append(1)
    queue.append(2)
    queue.append(3)
    queue.popleft()   # dequeue
    print(queue)

    print(queue[0])          # peek
    print(len(queue) == 0)

if __name__ == "__main__":
    main()