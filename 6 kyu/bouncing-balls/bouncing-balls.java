public class BouncingBall {
  
  public static int bouncingBall(double h, double bounce, double window) {
    
    int counter = -1;
    
    if(h > 1.5 && (bounce < 1 && bounce > 0)){
      for(; h>window; counter = counter+2){
        h*=bounce;
      }
      return counter;
    }else if(h < window && h > 0){
      return 1;
    }else{
      return -1;
    }
  }
}