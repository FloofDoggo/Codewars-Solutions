import java.util.stream.*;
import java.util.*;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {

    List<Character> directions = Arrays.asList('n','s','w','e');
    HashMap<Character, Long> opDir = new HashMap<>();
      
    opDir.put('n', 0l);
    opDir.put('s', 0l);
    opDir.put('w', 0l);
    opDir.put('e', 0l);
    
    for(Character dirChar: directions){
      opDir.replace(dirChar, IntStream.range(0, walk.length)
                        .mapToObj(i -> walk[i])
                        .filter(tempChar -> tempChar == dirChar)
                        .count());
    }
    
    return walk.length == 10
                  ? (opDir.get('n') == opDir.get('s')
                  && opDir.get('e') == opDir.get('w')
                  ? true
                  : false)
                  : false;
  }
}