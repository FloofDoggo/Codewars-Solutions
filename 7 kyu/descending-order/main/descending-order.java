import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
  
   List<Integer> listOfInt = new ArrayList<>();
   StringBuilder solution = new StringBuilder();
   int parameter = num;
   
   if(num == 0){
     return 0;
   }
   
   while(parameter > 0){
     listOfInt.add(parameter%10);
     parameter  = parameter/10;
   }
   
   Collections.sort(listOfInt);
   for(int digit : listOfInt){
     solution.append(digit);
   }
   
   solution.reverse();
   return Integer.parseInt(solution.toString());
  }
}