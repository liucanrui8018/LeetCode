import java.util.Stack;

/**
 * Created by 刘灿锐 on 5/2/2017.
 * 150. Evaluate Reverse Polish Notation
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        int a, b;
        Stack<Integer> S = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    S.add(S.pop() + S.pop());
                    break;
                case "/":
                    b = S.pop();
                    a = S.pop();
                    S.add(a / b);
                    break;
                case "*":
                    S.add(S.pop() * S.pop());
                    break;
                case "-":
                    b = S.pop();
                    a = S.pop();
                    S.add(a - b);
                    break;
                default:
                    S.add(Integer.parseInt(s));
                    break;
            }
        }
        return S.pop();
    }
}
