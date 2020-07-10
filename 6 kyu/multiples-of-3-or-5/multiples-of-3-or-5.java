import java.util.stream.IntStream;

public class Solution {

  public int solution(int number) {
    return IntStream.range(0, number).filter(x -> x%3 == 0 || x%5 == 0).sum();
  }
}