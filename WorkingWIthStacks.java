import java.util.Stack;

public class WorkingWIthStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(234);
        stack.push(21);
        System.out.println(stack.peek());// prints top most element
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}
