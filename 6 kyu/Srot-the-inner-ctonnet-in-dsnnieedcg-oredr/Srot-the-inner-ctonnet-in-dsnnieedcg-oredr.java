import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

public class Kata{
  public static String sortTheInnerContent(String words){
    List<String> wordsList = Arrays.asList(words.split("\\s+"));
    List<String> sortedWords = new ArrayList<>();
    for(String x: wordsList){
      if(x.length() < 2){
        sortedWords.add(x);
      }else{
      sortedWords.add(x.charAt(0) + 
                      reverseOrder(x.substring(1,x.length()-1).chars()) + 
                      x.charAt(x.length()-1));
      }
    }

    return sortedWords.stream()
      .collect(Collectors.joining(" "));
  }
  
  public static String reverseOrder(IntStream stream){
    return stream
              .mapToObj(chars -> (char) chars)
              .sorted(Comparator.reverseOrder())
              .map(String::valueOf) 
              .collect(Collectors.joining());
  }
}