import java.util.LinkedList;
import java.util.Queue;

/**
 * 225
 * @author jgz
 * @Date 2020-03-01 09:34
 */
class ImplementStackUsingQueues {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.remove();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
