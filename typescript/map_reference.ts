export function main() {
    let map: Map<string, number> = new Map();

    // Set, Get, Delete
    map.set("A", 1);
    map.set("B", 2);
    map.set("C", 3);

    console.log(map.get("A"));
    console.log(map.has("B"));
    map.delete("A");

    for (let [key, value] of map.entries()) {
        console.log(key, value);
    }

    // map method
    const numbers: number[] = [1, 2, 3, 4];
    const doubledNumbers: number[] = numbers.map(x => x * 2);
}

main();