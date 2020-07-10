  public class Sum
  {
     public int GetSum(int a, int b)
     {
     
      int sum = 0;
      
        if(a>b){
          for(; b < a; b++){
            sum+=b;
          } 
          return sum+a;
        }else {
          for(; a < b; a++){
            sum+=a;
          }
          return sum+b;
        }
      }
  }