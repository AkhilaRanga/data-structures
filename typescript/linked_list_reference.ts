class ListNode<T> {
    data: T;
    next: ListNode<T> | null;

    constructor(data: T, next: ListNode<T> | null = null) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList<T> {
  head: ListNode<T> | null = null;

  append(data: T): void {
    const newNode = new ListNode(data);

    if (!this.head) {
      this.head = newNode;
      return;
    }

    let current = this.head;
    while (current.next) {
      current = current.next;
    }
    current.next = newNode;
  }

  traverse(): void {
    let current = this.head;
    while (current) {
      console.log(current.data);
      current = current.next;
    }
  }
}

export function main() {
    const list = new LinkedList<number>();

    // Append
    list.append(1);
    list.append(7);
    list.append(3);

    // Traverse and print
    list.traverse();
}

main();