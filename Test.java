import java.util.Scanner;
public class Test {
    public static void main(String[] args) {     
      Scanner sc = new Scanner(System.in);
      String stroka;
      String[] rim = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};      
      System.out.println("ƒавай посчитаем");
      stroka = sc.nextLine();
      sc.close();      
      String str[] = stroka.split(" ");      
      int index1 = -1;
        for (int i = 0; i < rim.length; i++) {
          if (str[0].equals(rim[i])) {
            index1 = i;
          break;
          }            
        }
      int index2 = -1;
      for (int i = 0; i < rim.length; i++) {
        if (str[2].equals(rim[i])) {
          index2 = i;
            break;
          }            
      }
      if (index1 == -1 && index2 == -1){      
      int a = Integer.parseInt (str[0]);
      int b = Integer.parseInt (str[2]);
      int t1 = a + b;
      int t2 = a - b;
      int t3 = a * b;
      int t4 = a / b;
      String s = str[1];
      String s1 = "+";
      String s2 = "-";
      String s3 = "*";
      String s4 = "/";      
      
     
      
      if ( s.equals(s1)){
        System.out.println(t1);
      } else if ( s.equals(s2)){
        System.out.println(t2);
      } else if ( s.equals(s3)){
        System.out.println(t3);
      } else if ( s.equals(s4)){
        System.out.println(t4);
      }      
     } else if (index1 == -1 && index2 != -1){
         System.out.print("недопустимо");
       }
       else if (index1 != -1 && index2 == -1){
         System.out.print("недопустимо");
         }
     else if (index1 != -1 && index2 != -1){
     int a = index1;
     int b = index2;
     int t1 = a + b;
     int t2 = a - b;
     int t3 = a * b;
     int t4 = a / b;
     String s = str[1];
     String s1 = "+";
     String s2 = "-";
     String s3 = "*";
     String s4 = "/";      
      
     
      
      if ( s.equals(s1)){
        System.out.println(rim[t1]);
      } else if ( s.equals(s2)){
        System.out.println(rim[t2]);
      } else if ( s.equals(s3)){
        System.out.println(rim[t3]);
      } else if ( s.equals(s4)){
        System.out.println(rim[t4]);
        }
      
     }
   }  
}