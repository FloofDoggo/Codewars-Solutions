import java.util.Stack;

public class Calc {

  private static Stack<Double> stack = new Stack();
  private static StringBuilder sb = new StringBuilder();
  private static Double temp = 0d, x, y;

  public double evaluate(String exp) {
  
    if (exp.isEmpty()) {
      return 0;
    } else if (exp.length() < 4) {
      return Double.parseDouble(exp);
    }
  
    for (int i = 0; i < exp.length(); ++i) {
      char charachter = exp.charAt(i);
        if ((charachter == '+' || charachter == '-') || (charachter == '*' || charachter == '/')) {
          sb.setLength(0);
          operatorEquation(charachter);
        } else if (charachter == ' ' && sb.length() != 0) {
          stack.push(Double.parseDouble(sb.toString()));
          sb.setLength(0);
        } else {
          sb.append(charachter);
        }
      }
    return temp;
  }
  
      public static void operatorEquation(char c) {

        x = stack.pop();
        y = stack.pop();

        switch (c) {
            case '+':
                temp = y + x;
                break;
            case '-':
                temp = y - x;
                break;
            case '*':
                temp = x * y;
                break;
            case '/': {
                temp = y / x;
                break;
            }
        }
      stack.push(temp);
    }
}