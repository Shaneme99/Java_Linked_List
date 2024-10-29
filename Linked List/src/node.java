/*
Author: Shane Menzigian

Manual Implementation of a Single-Linked List class, with methods for:
printing, appending to tail, adding to head, popping from tail, removing from head,and finding current length of list.
 */
public class node {
    int head;
    node next;

    public node(int head) {
        this.head = head;
        this.next = null;
    }
    public void print(node head){
        System.out.print("[");
        while(head.next != null){
            System.out.print(head.head + ", ");
            head = head.next;
        }
        System.out.println(head.head + "]");
    }

    public void append(node head, int to_add){
        node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new node(to_add);
    }

    public node add(node head, int to_add){
        node addition = new node(to_add);
        addition.next = head;
        head = addition;
        return head;
    }

    public int pop(node head){
        node current = head;
        node prev = head;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        int to_remove = current.head;
        prev.next = null;
        return to_remove;
    }

    public node remove(node head) {
        head = head.next;
        return head;
    }

    public int length(node head){
        int count = 0;
        node current = head;
        while(current != null){
            count ++;
            current = current.next;
        }
        return count;
    }
}
