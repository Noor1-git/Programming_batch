package sowmyamaam.day1;

public class Day1_20_03_2023 {
	
	/*
	 * 1. int x = 2, y = 5;
 
  int exp1 = (x * y / x);
  int exp2 = (x * (y / x));
 
  System.out.println(exp1);
  System.out.println(exp2);

2. int x = 10, y = 5;
 
 int exp1 = (y * (x / y + x / y));
 int exp2 = (y * x / y + y * x / y);
 
 System.out.println(exp1);
 System.out.println(exp2);

3. double exp1 = (3.0 * 2 / 4);
  int exp2 = (3 * -2 % 4);
 
  System.out.println(exp1);
  System.out.println(exp2);

4.  int x = 9, y = 12, z = 3;
 
  int exp1 = x - y/3 + z * 2 - 1; 
  int exp2 = (x - y)/3 + ((z * 2) - 1); 
 
  System.out.println(exp1);
  System.out.println(exp2);

5. int x = 9, y = 12;
  int a = 2, b = 4, c = 6;
 
   int exp = (3 + 4 * x)/5 - 10 * (y - 5) * (a + b + c)/x + 9 * (4/x + (9 + x)/y);
 
   System.out.println(exp);

6.  int x = 9, y = 12;
   int a = 2, b = 4, c = 6;
 
   int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
 
   System.out.println(exp);

7.  int x = 9, y = 12;
  int a = 2, b = 4;
 
  boolean exp = 4/3 * (x + 34) < 9 * (3 + y * (2 + a)) / (a + b*y);
  System.out.println(exp);

8.  int x = 2, y = 3;
  int a = 4, b = 5;
 
  boolean exp = 4/3 * (x + 34) < 9 * (3 + y * (2 + a)) / (a + b*y);
  System.out.println(exp);

9.  int x = 1, y = 2, z = 5; 
Sop(x == 1 || x > y || x > z)

Sop(x == y || y == 2 || z == 5)
 
Sop(x == y || y == z || z == x) 

10.   int x = 1, y = 2, z = 5; 
  System.out.println("x: " +(!((x + 2) == (1 + 2)))); 

  System.out.println("y: " +(!(y == z))); 
  System.out.println("z>x: " +(!(z > x))); 

  Sop(!(x == y) && ((y + 5) > z) && (!((z - 3) == 0)))

11.   int x = 20, y = 30, z = 50; 
    x += y; //  x = x + y 
    y -= x + z; 
    z *= x * y;
 System.out.println("x = " +x ); 
 System.out.println("y = " +y ); 
 System.out.println("z = " +z ); 

12.   int x = y = z = 10;
  System.out.println(x + " " + y + " " + z);

13.   int x, y, z;
   x = y = z = 2;
   x += y;
   y -= z;
   z /= (x + y);
 System.out.println(x + " " + y + " " + z);

14.    int x, y, z;
  1 = x;
  y = z = 2;
 
  int a = x + y + z;
  System.out.println(x + " " + y + " " + z);

15.   double x = 10.5;
   x /= 4 + 2.5 * 2.5;
   System.out.println(x);

16.    int a, b, c;
   a = b = c = 5;
 
    int exp = a + b++ + ++c; 
    System.out.println("exp = " +exp); 

17.    int a, b, exp = 10;
   a = b = 5;
   exp += ++a * b++;
   System.out.println("exp = " +exp); 

18.    int a, b, exp = 10;
    a = b = 5;
   exp *= ++a * 10 / b++ + --a;
   System.out.println("exp = " +exp);

19.     int x = 5, y = 2, exp = 10;
  exp %= x + ( x > 6 ? ++y : --y);
    
  System.out.println("exp = " +exp);


20.   int a = 4;	
   int x = a >= 5 ? 1+2 : 1*1;

21.    int x = 6;
  long y = 3;
 
long z = (x % 3 >= 1) ?  y++ :y-- ;
  
 System.out.print("Value of y: " +y);
	Sop(z) ;

22.  int x = 10 * (2 + (1 + 2 / 5));
   int y = x * 2;
   System.out.print(x + y < 10 ? "Hello" : "Java");

23.   int a = 20, b = 10;
  boolean c = true, d = false;
	a = c ? b++ : b--;
	c = !d;
	System.out.print((a+b)+" "+(c ? 5 : 10));

24.     int x = 11;
     x = x++ + ++x;
     Sopln(x);
25.  int a = 11, b = 22, c;
     c = a +b + a++ + b++ + ++a + ++b;
     Sopln(c);
26.  int a = 50;
     a = a++ + --a + ++a - a--;
     Sopln(a);
27.  int i = 1 , j = 2,k = 3;
     int m = i-- - j-- - k++ -j++;
     Sopln(i +" "+j+" "+k+" "+m);

28.  Write a program to check if a number 
  is greatest of two numbers.
29.  Write a program to check if a number 
  is smallest of two numbers.
30.  Write a program to check if a 
   number is positive or negative.
31.  Write a program to check if a number
  is even or odd.



32.  Write a program to calculate area of circle 
   when radius is given.
33. Write a program to calculate area of rectangle
   when length and breadth is given.
34. Write a program to calculate area of square 
   when side is given.
35. Write a program to calculate perimeter of 
   cirle.
36. Write a program to calculate perimeter of 
   square.
37. Write a program to calculate perimeter of 
   rectangle.


38. Assume rahul has 500 rs . The cost of 1 kg of apple
  is 77.65. Calculate how many kgs of apple Rahul
   can buy for 500 rs.
39. Assume Ram has 250 rs and the cost of 1 chocolate
  is 13.35 rs. find out the number of chocolates Ram 
  can buy.
40. int x = 10 ;
    x = ++x ;
    x = --x ;
    x = x++ ;
    x = x-- ;
	Sop(x) ;

41. int a = 50 ;
    a = a++ ;
    a = a-- ;
    a = ++a ;
    a = --a ;

    Sop(a) ;*/

}
