import java.util.*;
import java.lang.Math;

public class DeadFish {
    public static int[] parse(String data) {
        List<Integer> listOfInt = new ArrayList<>();
        char[] charArray = data.toCharArray();
        int value = 0;
        
        System.out.println("String: " + data);
        
        for(char ch: charArray){
          if(ch == 'o'){
            listOfInt.add(value);
          }else{
            value = equation(ch, value);
            System.out.println("Value: " + value);
          }
        }
        
        int[] solution = new int[listOfInt.size()];
        for(int i = 0; i < listOfInt.size(); i++){
          solution[i] = listOfInt.get(i);
        }
        
        return solution;
    }
    
    public static int equation(Character eq, int val){
      switch(eq){
        case 'i': return ++val;
        case 'd': return --val;
        case 's': return (int) Math.pow((double) val, 2d);
        default: return val;
      }
    }
}