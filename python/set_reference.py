def main():
    s = set()

    s.add(1)
    s.add(2)
    s.add(4)
    s.add(1)     # no duplicates
    print(s)

    print(2 in s)
    s.remove(1)
    print(s)
    print("len", len(s))

    for val in s:
        print(val)

if __name__ == "__main__":
    main()