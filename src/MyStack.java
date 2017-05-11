import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 刘灿锐 on 5/11/2017.
 * 225. Implement Stack using Queues
 * Implement the following operations of a stack using queues.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * <p>
 * <p>
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

public class MyStack {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (!q1.isEmpty())
            q1.add(x);
        else
            q2.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public void pop() {
        if (q1.isEmpty()) {
            int size = q2.size();
            for (int i = 1; i < size; i++) {
                q1.add(q2.poll());
            }
            q2.poll();
        } else {
            int size = q1.size();
            for (int i = 1; i < size; i++) {
                q2.add(q1.poll());
            }
            q1.poll();
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        int res;
        if (q1.isEmpty()) {
            int size = q2.size();
            for (int i = 1; i < size; i++) {
                q1.add(q2.poll());
            }
            res = q2.poll();
            q1.add(res);
        } else {
            int size = q1.size();
            for (int i = 1; i < size; i++) {
                q2.add(q1.poll());
            }
            res = q1.poll();
            q2.add(res);
        }
        return res;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
