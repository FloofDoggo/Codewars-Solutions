import java.util.*;

public class DuplicateEncoder {
	static String encode(String word){
    
    String lowerCaseWord = word.toLowerCase();
    Map<Character, Integer> charCounter = new HashMap<>();
    
    for(int i = 0; i < lowerCaseWord.length(); i++){
      if(charCounter.containsKey(lowerCaseWord.charAt(i))){
        charCounter.put(lowerCaseWord.charAt(i), charCounter.get(lowerCaseWord.charAt(i))+1);
      }else{
        charCounter.put(lowerCaseWord.charAt(i), 1);
      }
    }
    
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < lowerCaseWord.length(); i++){
      if(charCounter.get(lowerCaseWord.charAt(i)) > 1){
        sb.append(")");
      }else{
        sb.append("(");
      }
    }
    return sb.toString();
  }
}