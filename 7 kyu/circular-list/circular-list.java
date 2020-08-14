import java.util.*;

public class CircularList<T> {
  
  private Integer actualInd;
  private List<T> eleList;

    public CircularList(final T... elements) {
      if(elements.length <= 0){
        throw new NullPointerException("Exception");
      }else{
        eleList = new ArrayList<>();
        for(int i = 0; i < elements.length; i++){
          eleList.add(elements[i]);
        }
      }
    }

    T next() {
      if(actualInd == null){
        actualInd = 0;
        return eleList.get(0);
      }else{
        actualInd = (actualInd + 1) % eleList.size();
        return eleList.get(actualInd);
      }
    }

    T prev() {
      if(actualInd == null){
        actualInd = 0;
      }
      if(actualInd == 0){
        actualInd = eleList.size()-1;
      }else{
        actualInd--;
      }
      return eleList.get(actualInd);
    }
}
