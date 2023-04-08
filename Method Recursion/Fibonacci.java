package sowmyamaam.recursion;
public class Fibonacci {

	static long a = 0, b = 1, c, i, count = 25;

    public static void main(String[] args) {
//        for (int i = 0; i <= count; i++) {
//        System.out.println(c);
//        c=a+b;
//        a=b;
//        b=c;
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