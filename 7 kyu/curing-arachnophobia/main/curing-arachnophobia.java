public class Spiders
{
    public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
      StringBuilder spider = new StringBuilder();
      if(legSize == 1) {spider.append("^");}
      if(legSize == 2) {spider.append("/\\");}
      if(legSize == 3) {spider.append("/╲");}
      if(legSize == 4) {spider.append("╱╲");}
      if(bodySize == 1) {spider.append("(");}
      if(bodySize == 2) {spider.append("((");}
      if(bodySize == 3) {spider.append("(((");}
      for(double i = 0; i < ((Math.pow(2,bodySize))/2); i++){
        spider.append(eye);
      }
      spider.append(mouth);
      for(double i = 0; i < ((Math.pow(2,bodySize))/2); i++){
        spider.append(eye);
      }
      if(bodySize == 1) {spider.append(")");}
      if(bodySize == 2) {spider.append("))");}
      if(bodySize == 3) {spider.append(")))");}
      if(legSize == 1) {spider.append("^");}
      if(legSize == 2) {spider.append("/\\");}
      if(legSize == 3) {spider.append("╱\\");}
      if(legSize == 4) {spider.append("╱╲");}
      return spider.toString();
    }
}