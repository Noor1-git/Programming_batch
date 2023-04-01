package sowmyamaam.day4;

public class Fibonacci {

    static long a = 0, b = 1, c, i, count = 50;

    public static void main(String[] args) {

//        for (int i = 0; i <= count; i++) {
//
//        c=a+b;
//        a=b;
//        b=c;
//        System.out.println(c);
//
//        }
         fibonacci(count);
    }

     private static void fibonacci(long count2) {
         c = a + b;
         a = b;
         b = c;
         i++;
         System.out.println(c);
         if (count2 < i) {
             return;
         }
         fibonacci(count2);
     }
}
