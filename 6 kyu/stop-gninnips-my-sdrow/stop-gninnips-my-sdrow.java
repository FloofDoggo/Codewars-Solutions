public class SpinWords {

  public String spinWords(String sentence) {
    StringBuilder x = new StringBuilder(sentence);
    StringBuilder y = new StringBuilder();
    StringBuilder z = new StringBuilder();
    for(int i = 0; i < sentence.length(); i++){
      if(x.charAt(i) == ' ' ){
        z.append(reverseAlgo(y) + " ");
        y.delete(0,y.length());
      }else if(i == sentence.length()-1){
        y.append(x.charAt(i));
        z.append(reverseAlgo(y));
      }else{
        y.append(x.charAt(i));
      }
    }
  return z.toString();
  }
  
  public StringBuilder reverseAlgo(StringBuilder sentence){
    if(sentence.length() > 4){ 
      return sentence.reverse();
    }else{ 
      return sentence;
    }  
  }
}