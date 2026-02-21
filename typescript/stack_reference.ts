export function main() {
    let stack: number[] = [];

    // Push
    stack.push(1);
    stack.push(2);

    // Peek, Pop
    console.log(stack[stack.length - 1]);
    console.log(stack.pop());
    console.log(stack.length === 0);
}

main();