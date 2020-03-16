package queuey;

import java.util.LinkedList;
import java.util.Stack;

public class queuey {
    LinkedList queue;

    // Making a queue instance
    public queuey() {
        queue = new LinkedList();
    }

    // Is our queue empty?
    public boolean isEmpty() {
      return queue.isEmpty();
    };

    //How big is our queue?
    public int size() {
        return queue.size();
    }

    // Add an item to our queue
    public void enqueue(int n) {
        queue.addLast(n);
    }

    // Remove an item from the queue
    public int dequeue() {
        return (int) queue.remove(0);
    }

    //Peek at the first item
    public int peek() {
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + "!");



//        queuey numberQueue = new queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("First out: " + numberQueue.dequeue());
//        System.out.println("Peek at Second item: " + numberQueue.peek());
//        System.out.println("Second out: " + numberQueue.dequeue());
//        System.out.println("Third out: " + numberQueue.dequeue());

    }
}
