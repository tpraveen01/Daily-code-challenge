import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExamples {
    // public static void main(String[] args) {
    // Stack<Integer> stack = new Stack<>();
    // System.out.print(stack.push(23) + " ");
    // System.out.print(stack.push(34) + " ");
    // System.out.println(stack.push(45) + " ");
    // System.out.println(stack.pop());
    // }

    // public static void main(String[] args) {
    // Queue<Integer> queue = new LinkedList<>();
    // System.out.print(queue.add(23) + " ");
    // System.out.print(queue.add(34) + " ");
    // System.out.println(queue.add(45) + " ");
    // System.out.println(queue.remove());
    // }

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(23);
        queue.addLast(34);
        queue.addFirst(45);
        System.out.println(queue.remove());
    }
}
