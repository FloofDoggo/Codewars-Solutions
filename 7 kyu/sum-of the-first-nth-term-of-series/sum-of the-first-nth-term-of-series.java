public class NthSeries {
  
  public static String seriesSum(int n) {
  
    float x = 1f;
    float devider = 4f;
    
    if(n == 1){
      return "1.00";
    }else if(n == 0){
      return "0.00";
    }
    else{
      for(int i = 1 ; i < n; devider+=3, i++){
        x += 1/(devider);
      }
    }
    return String.format("%.2f",x);
  }
}