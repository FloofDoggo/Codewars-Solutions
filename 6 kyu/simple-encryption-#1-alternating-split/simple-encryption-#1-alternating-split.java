import java.util.ArrayList;

public class Kata {

  public static String encrypt(final String text, final int n) {
    
    ArrayList<Character> charList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    sb.append(text);
    
    if(text == "" || text == null){
      return text;
    }
    
    if(n <= 0){
      return text;
    }else{
    
      for(int i = 0; i < n; i++){
        for(int j = 0; j < text.length(); j++){
          if(j % 2 > 0) {
            charList.add(sb.charAt(j));
          }
        }
        for(int j = 0; j < text.length(); j++){
          if(j % 2 == 0) {
            charList.add(sb.charAt(j));
          }
        }
        
      sb.delete(0, sb.length());
      for(char element : charList){
        sb.append(element);
      }
      charList.clear();
      
      }
    }
    return sb.toString();   
  }
  
  public static String decrypt(final String encryptedText, final int n) {
  
    ArrayList<Character> evenList = new ArrayList<>();
    ArrayList<Character> oddList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    sb.append(encryptedText);
    
    if(encryptedText == "" || encryptedText == null){
      return encryptedText;
    }
    
    for(int j = 0; j < n; j++){
      for(int i = 0; i < encryptedText.length(); i++){
        if(encryptedText.length()/2 > i){
          evenList.add(sb.charAt(i));
        }else{
          oddList.add(sb.charAt(i));
        }
      }
      
      sb.delete(0, sb.length());
      for(int i = 0; i < encryptedText.length()+1/2; i++){
        if(i < oddList.size()){
          sb.append(oddList.get(i));
        }
        if(i < evenList.size()){
          sb.append(evenList.get(i));
        }
      }
      
      oddList.clear();
      evenList.clear();
    }
    return sb.toString();
  }
  
}