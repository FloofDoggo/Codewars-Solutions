import java.util.*;

class ClosestWeight {
    public static int[][] closest(String strng) {
    
        List<String> valueList = new ArrayList<>(Arrays.asList(strng.split(" ")));
        List<Integer> computedList = new ArrayList<>();
        List<Integer[]> listOfArrays = new ArrayList<>();
        Integer[] values = {0,0};
        
        if(strng == null || strng == "") {
          return new int[0][];
        }
        
        for(int i = 0; i < valueList.size(); i++) {
          listOfArrays.add(new Integer[]{computeWeight(valueList.get(i)), i, Integer.parseInt(valueList.get(i))});//val może być taki sam
          computedList.add(computeWeight(valueList.get(i)));
        }
        
        Collections.sort(computedList);
        int subValue = Math.abs(computedList.get(0)-computedList.get(1));
        values = new Integer[]{computedList.get(0), computedList.get(1)};
        
        for(int i = 0; i < computedList.size()-1; i++){
          if(Math.abs(computedList.get(i)-computedList.get(i+1)) < subValue){
            subValue = Math.abs(computedList.get(i)-computedList.get(i+1));
            values = new Integer[]{computedList.get(i), computedList.get(i+1)}; //smallest difference between weights
          }
        }
        
        List<Integer[]> result = new ArrayList<>();  
        
        for(int i = 0; i < listOfArrays.size(); i++){
          System.out.println(listOfArrays.get(i)[0]+"    <>" + listOfArrays.get(i)[1]);
          if(listOfArrays.get(i)[0] == values[1] || listOfArrays.get(i)[0] == values[0]){
            result.add(listOfArrays.get(i));
          }
        }
        
        if(result.get(1)[0] < result.get(0)[0]){
          return new int[][]{{result.get(1)[0], result.get(1)[1], result.get(1)[2]}, {result.get(0)[0], result.get(0)[1], result.get(0)[2]}};
        }else{
          return new int[][]{{result.get(0)[0], result.get(0)[1], result.get(0)[2]}, {result.get(1)[0], result.get(1)[1], result.get(1)[2]}};
        }
    }
    
    public static int computeWeight(String str) {
      int weight = 0;
      char[] charList = str.toCharArray();
      for(char ch : charList){
        weight += Character.getNumericValue(ch);
      }
      return weight;
    }
}