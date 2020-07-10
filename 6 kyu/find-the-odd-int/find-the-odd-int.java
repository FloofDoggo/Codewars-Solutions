import java.util.*;

public class FindOdd {
  public static int findIt(int[] a) {
    Set<Integer> setIndividuals = new HashSet<>();
    Arrays.stream(a).forEach(x -> setIndividuals.add(x));
    
    for(int setElement : setIndividuals){
      if((Arrays.stream(a).filter(x -> x == setElement).count()) % 2 != 0){
        return setElement;
      }
    }
    return 0;
  }
}