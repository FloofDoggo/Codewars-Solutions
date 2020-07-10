import java.util.Arrays;
import java.util.stream.IntStream;

public class DRoot {
  public static int digital_root(int n) {
    int sum = n;
    while(sum > 9){
      sum = splitInteger(Integer.toString(sum)).sum();
    }
    return sum;
  }
  
  public static IntStream splitInteger(String digits){
    int[] root = new int[digits.length()];
    for(int i = 0; i < digits.length(); i++){
      root[i] = Character.getNumericValue(digits.charAt(i));
    }
    return Arrays.stream(root);
  }
}