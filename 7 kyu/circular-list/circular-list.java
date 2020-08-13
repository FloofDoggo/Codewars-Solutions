public class Dinglemouse {

  static char[][] arr = {{'a','b','c','d','e','1','2','3'},
                    {'f','g','h','i','j','4','5','6'},
                    {'k', 'l', 'm', 'n','o','7','8','9'},
                    {'p', 'q', 'r', 's', 't', '.', '@', '0'},
                    {'u', 'v', 'w', 'x', 'y', 'z', '_', '/'}};
  static int[] currPos = {0, 0};

  public static int tvRemote(final String word) {
    currPos[0] = 0;
    currPos[1] = 0;
    int clicks = 0;
    for(int i = 0; i < word.length(); i++){
      clicks += findPos(word.charAt(i));
    }
    return clicks;
  }
  
  public static int findPos(char c){
    for(int y = 0; y < 6; y++){
      for(int x = 0; x < 8; x++){
        if(arr[y][x] == c){
          int res = Math.abs(currPos[0] - x) + Math.abs(currPos[1] - y) + 1;
          currPos[0] = x;
          currPos[1] = y;
          return res;
        } 
      }
    }
    return 0;
  } 
}