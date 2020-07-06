public class Accumul {
    
    public static String accum(String s) {
     StringBuilder x = new StringBuilder();
     char c;
     for(int i = 0; i < s.length(); i++){
       c = s.charAt(i);
       for(int j = -1; j < i; j++){
         if(j == -1){  
           x.append(Character.toUpperCase(c));
          }else{
            x.append(Character.toLowerCase(c));
          } 
       }
       if(i < s.length()-1){
         x.append("-");
       }
     }
     return x.toString();
    }
}