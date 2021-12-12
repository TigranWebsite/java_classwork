package week2;

public class Homeworks {
    public static void main(String[] args) {

        /*

    Widening Primitive Conversion (Implicit)
Write java program, which has byte type variable(Input variables from console)
Cast byte to short type, print both variables
Cast short to int type, print both variables
Cast int to long, print both variables
Cast long to float, print both variables
Cast float to double type, print both variables
Narrowing Primitive Conversion (Explicit)
 2. Write java program, which has double type variable(Input variable from console)
Cast double to float,print both variables
Cast float to long, print both variables
Cast long to int, print both variables
Cast int to short, print both results
Cast short to byte, print both results
(edited)





10:54
3 .Compute area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
4. What happens if concatenate string and another primitive type
concatenate integer + integer, print output
concatenate String + integer with other primitive types.
Example of output` 5 + 10 = 15 (edited)
10:56
5. Write a Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
6. Generate and print random integer number between 2 to 7(not using bound)
7. Input from console int a and int b, if a and b corresponds for following requirements print “Both a and b legal”, if any of them does not correspond print about it like this “a is legal b is illegal ''. or vice versa
a > 10 and b is not equal to 10
both a and b is positive
both a and b is negative
a > 10 b < 1 both of them are odd
a is a multiple of 5 OR b is a multiple of 5
a is not a multiple of 5 but b is a multiple of 5
8. Input int values a and b from console
if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
else print all even values between them
9. Given coordinates of two points in the coordinate plane.Write java program to check if the points lie in the same plane?(quarter)
Print In the same quarter , else print Not in the same quarter.
Input 4 coordinates from console, all 4 coordinates != 0.
10.  Given 3 real numbers a , b , c .FInd all decisions for
ax2 + bx + c = 0.Print all decisions, if there is not a decision ,print “Can't be”. (edited)
11:01
11. Write a java program to find maximum from a given 3 integer numbers using ternary operator.Input numbers from console.
12. Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2, etc.
13.The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
-if the average score >= 80%                 =>grade=A
-if the average score >= 60% and <80% => grade=B
-if the average score>=40% and < 60% =>grade=C
-else.   =>grade=F



14. Print all integer powers of two not exceeding N in ascending order.Input N from console. Example ` Input 50(You can not use Math.pow())
Output ` 1 2 4 8 16 32.
15. For a given natural N print the smallest integer k that`
Math.pow(2,k)≥N.(You can not use Math.pow())
Example` Input 7
Output 3
16. .Print all integer numbers from 1 to N, except that are multiple of 3(Input N from console)
17. Write a Java Program to Compute the Sum of Digits in a given Integer. (edited)

Anahit Martirosyan  11:42 AM
18. Write a java program to print all even numbers from a given range, from a to b. Input a and b from console.Example`
Input ` 2 Output ` 2 4
5
19.Print all numbers on the segment from a to b that give the remainder of c when divided by d. If such numbers do not exist, then you do not need to display anything.
Example ` Input` Output`
a 2 2 4
b 5
c 0
d 2
i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0
20.Integers a and b are entered. It is guaranteed that a does not exceed b.
Print all numbers on the segment from a to b that are exact squares. If there are no such numbers, then you do not need to display anything.
Example`
Input` 2 Output ` 4
8
21.Enters 2 integer numbers : x and d from console
Count and print one number - how many times the digit d occurs in the representation of a natural number x.
22. Given an integer number x
Print the number consisting of the digits of the given number x in reverse order. You do not need to output leading zeros.
23.Given an integer number x
Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
Example`
Input` 6 Output` 2
24.Given an integer number x
Print all natural divisors of the number x in ascending order (including 1 and the number itself).
Example` Input ` 32 Output ` 1 2 4 8 16 32
25. Given an integer x
Count the number of natural divisors of x (including 1 and the number itself; x≤2 ∗ 109).
26.Calculate the sum of the given 10 natural numbers.
Input integers from console
27. Convert a natural number from binary to decimal (no more than 10 digits in a binary number).
Example` Input ` 1001 Output` 9
111 Output` 7
28.Enter the number N, followed by N integers.
Count how many zeros, positive numbers, negative numbers among the given N numbers.
It is necessary to print first the number of zeros, then the number of positive and negative numbers.
29. "GNCHE-1" is a complex electronic device that issues every second the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high cost of electronic components, you have been instructed to develop an emulator for these devices.
The number of seconds (from 1 to 1,000,000) is given that the generator works after being turned on.
Example` Input` Output`
2 1 2
5 1 2 2 3 3
7 1 2 2 3 3 3 4
30. Write a Java program by using two for loops to produce the output shown below:
1.Input N natural number, print picture like below in size N*N
***********
***********
***********
***********
31.Write a program that prompts the user for the size (a non-negative integer in int); and prints the following checkerboard pattern.
# # # # # # # N * N
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #
32. Write a program that prompts user for the size (a positive integer in int); and prints the multiplication table as shown:
Enter the size: 10
* | 1 2 3 4 5 6 7 8 9 10
--------------------------------------------
1 | 1 2 3 4 5 6 7 8 9 10
2 | 2 4 6 8 10 12 14 16 18 20
3 | 3 6 9 12 15 18 21 24 27 30
4 | 4 8 12 16 20 24 28 32 36 40
5 | 5 10 15 20 25 30 35 40 45 50
6 | 6 12 18 24 30 36 42 48 54 60
7 | 7 14 21 28 35 42 49 56 63 70
8 | 8 16 24 32 40 48 56 64 72 80
9 | 9 18 27 36 45 54 63 72 81 90
10 | 10 20 30 40 50 60 70 80 90 100
33. Write 4 programs (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints each of the patterns as shown:
Enter the size: 4
* **** **** *
** *** *** **
*** ** ** ***
**** * * ****
a) b) c) d)

     */


    }

}
