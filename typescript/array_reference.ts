export function main() {
    let arr: number[] = [5, 2, 8, 1];
    // let arrGeneric: Array<number> = [1, 2, 3, 4, 5];
    console.log(arr.length);   // length

    arr.sort((a, b) => a - b); // sort ascending
    console.log(arr);

    for (const item of arr) {
        console.log(arr);
    }

    let copy = [...arr];       // copy
    let sum = arr.reduce((a,b) => a + b, 0);
    console.log(sum);

    // 2D array
    let matrix: number[][] = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ];
    for (const row of matrix) {
        for (const element of row) {
            console.log(element);
        }
    }
}

main();