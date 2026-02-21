def main():
    d = {}

    d["A"] = 1
    d["B"] = 2
    d["C"] = 3

    print(d.get("A"))
    print(d.get("C", 0))
    print("B" in d)

    del d["A"]
    print(d)

    # iterate
    for key, value in d.items():
        print(key, value)

if __name__ == "__main__":
    main()