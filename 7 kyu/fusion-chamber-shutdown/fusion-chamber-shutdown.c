#include <math.h>
#include <stdlib.h>
void burner(int carbon, int hydrogen, int oxygen, int molecules[3]) {
  
  if(hydrogen/2 >= oxygen){
    molecules[0] = oxygen;
    hydrogen -= 2*oxygen;
    oxygen = 0;
  }else{
    molecules[0] = hydrogen/2;
    hydrogen = hydrogen%2;
    oxygen -= molecules[0];
  }
  printf("%d, %d, %d", carbon, hydrogen, oxygen);
  
  if(oxygen/2 >= carbon){
    molecules[1] = carbon;
    oxygen -= 2*carbon;
    carbon = 0;
  }else{
    molecules[1] = oxygen/2;
    oxygen = oxygen%2;
    carbon -= molecules[1];
  }
  
  if(hydrogen/4 >= carbon && carbon!=0){
    molecules[2] = carbon;
    hydrogen -= 4*carbon;
    carbon = 0;
  }else{
    molecules[2] = hydrogen/4;
    hydrogen = hydrogen%4;
    carbon -= molecules[2];
  }
  printf("\n %d, %d, %d", carbon, hydrogen, oxygen);

}