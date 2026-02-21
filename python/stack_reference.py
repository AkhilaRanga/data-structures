def main():
    stack = []

    stack.append(1)
    stack.append(2)
    stack.append(3)
    stack.pop()
    print(stack)

    print(stack[-1])       # peek
    print(len(stack) == 0)

if __name__ == "__main__":
    main()