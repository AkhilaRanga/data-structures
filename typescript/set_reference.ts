export function main() {
    let s: Set<number> = new Set();

    // Add, Delete
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(1); // duplicate

    console.log(s);
    console.log(s.has(2));
    s.delete(1);
    console.log(s.size);

    for (let val of s) {
        console.log(val);
    }
}

main();