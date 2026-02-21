from collections import deque

def main():
    dq = deque()

    dq.append(1)        # right
    dq.append(2)
    dq.appendleft(3)    # left
    dq.appendleft(4)
    print(dq)
    dq.pop()            # remove right
    dq.popleft()        # remove left
    print(dq)

    print(dq[0])        # peek left
    print(dq[-1])       # peek right


if __name__ == "__main__":
    main()