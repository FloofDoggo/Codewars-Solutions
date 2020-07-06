public class JadenCase {

  public String toJadenCase(String phrase) {
	  
  if(phrase == null) return null;
  
  StringBuilder newString = new StringBuilder(phrase);
  
  if(phrase.length()>0){
    newString.setCharAt(0,Character.toUpperCase(newString.charAt(0)));
    for(int i = 1; i < phrase.length(); i++)
      if(phrase.charAt(i) == ' ') newString.setCharAt(i+1,Character.toUpperCase(newString.charAt(i+1)));
    return newString.toString(); 
  }else return null;
  }
}