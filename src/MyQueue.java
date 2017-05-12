import java.util.Stack;

/**
 * Created by 刘灿锐 on 5/12/2017.
 * 232. Implement Queue using Stacks
 * Implement the following operations of a queue using stacks.
 * <p>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * <p>
 * <p>
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class MyQueue {

    Stack<Integer> queue = new Stack<>();

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while(!queue.empty()){
            temp.push(queue.pop());
        }
        queue.push(x);
        while(!temp.empty()){
            queue.push(temp.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return queue.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return queue.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return queue.empty();
    }
}
