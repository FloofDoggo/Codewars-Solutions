import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
      
      HashMap opDir = new HashMap<String, String>();
      List<String> dirList = new ArrayList<>(Arrays.asList(arr));
      
      opDir.put("NORTH", "SOUTH");
      opDir.put("SOUTH", "NORTH");
      opDir.put("EAST", "WEST");
      opDir.put("WEST", "EAST");
      
      for(int i = 0; i < dirList.size()-1;){
        if(dirList.get(i+1).equals(opDir.get(dirList.get(i)))){
          dirList.remove(i);
          dirList.remove(i);
          i = 0;
        }else{
          i++;
        }
      }
      
      return dirList.toArray(new String[dirList.size()]);
    }
}