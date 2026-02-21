class Node:
    def __init__(self, data):
        self.data = data
        self.next = None # Pointer to the next node, initialized to None

class LinkedList:
    def __init__(self):
        self.head = None # First node in the list

    def append(self, new_data):
        new_node = Node(new_data)
        if self.head is None:
            self.head = new_node
            return
        # Traverse to the end of the list
        last = self.head
        while last.next:
            last = last.next
        # Link the new node
        last.next = new_node

    def list_print(self):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" -> ")
            current_node = current_node.next
        print("None")

if __name__ == "__main__":
    my_list = LinkedList()
    my_list.append("Sun")
    my_list.append("Mon")
    my_list.append("Tue")
    my_list.append("Wed")
    print("Linked list:")
    my_list.list_print()