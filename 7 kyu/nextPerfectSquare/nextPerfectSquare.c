#include <math.h>
unsigned long long next_perfect_square(long long n) {
  
  long result = round(sqrtl(n));
  if (result <= sqrtl(n)){
    return pow(result+1, 2);
  }else{
    return pow(result, 2);
  }
}