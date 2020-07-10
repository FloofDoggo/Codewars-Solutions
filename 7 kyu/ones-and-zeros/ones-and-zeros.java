import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    
      int size = binary.size();
      int decimal = 0;
      List<Integer> x = new ArrayList<Integer>();

      for(int k = size; 0 < k; k--){ 
        x.add(binary.get(k-1)); 
      }
      
      for(int j = 0; j < x.size(); j++){
        if(x.get(j)==1){
          decimal+=Math.pow(2,j);
        }
      }
	  
    return decimal;
    }
}