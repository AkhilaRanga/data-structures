def main():
    arr = [5, 2, 8, 1]

    # Length
    print(len(arr))

    # Sort (in-place)
    arr.sort()
    print(arr)

    # Sorted (returns new list)
    new_arr = sorted(arr)

    # Sum
    print(sum(arr))

    # Copy
    copy1 = arr[:]          
    copy2 = arr.copy()
    
    # Append, Pop
    arr.append(1)
    arr.pop()

    # Looping
    for item in arr:
        print("Item:", item)
    
    for i in range(len(arr)):
        print(f"Index: {i}, Value: {arr[i]}")

    # 2D array
    grid = [[0]*4 for _ in range(3)]
    print(len(grid))      # rows
    print(len(grid[0]))   # cols

if __name__ == "__main__":
    main()