import java.util.Arrays;

 public class Kata {
    public static double findUniq(double arr[]) {
      double[] values = arr;
      Arrays.sort(values);
      if(values[0] != values[1]) return values[0];
      else return values[arr.length-1];
    }
}