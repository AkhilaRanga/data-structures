export class Deque<T> {
    private items: T[] = [];

    addFirst(item: T) { this.items.unshift(item); }
    addLast(item: T) { this.items.push(item); }

    removeFirst(): T | undefined { return this.items.shift(); }
    removeLast(): T | undefined { return this.items.pop(); }

    peekFirst(): T | undefined { return this.items[0]; }
    peekLast(): T | undefined { return this.items[this.items.length - 1]; }

    isEmpty(): boolean { return this.items.length === 0; }
}

function main() {
    let dq = new Deque<number>();
    dq.addFirst(1);
    dq.addLast(2);
    console.log(dq.removeFirst());
    console.log(dq.removeLast());
}

main();