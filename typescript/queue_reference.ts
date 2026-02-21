export function main() {
    let queue: number[] = [];

    // Enqueue
    queue.push(1);
    queue.push(2);

    // Dequeue, Peek
    console.log(queue.shift());
    console.log(queue[0]);
}

main();