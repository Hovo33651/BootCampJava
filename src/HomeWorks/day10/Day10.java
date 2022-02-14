package HomeWorks.day10;

import java.util.Random;
import java.util.Scanner;

public class Day10 {
    Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        Day10 d = new Day10();
//exeWhile1(1,10);
//exeWhile2(1,20);
// exeWhile3(30);
//smallestDivisor(37);
// allINTpowers(30);
// desendingInt(20);
        //7  multiplyDesending(20);
        // d.exactPower();
        //9 power(32);
        // 10 charEquivalent(32, 122);
        //  multiplyOfThree(20);
        //12
        //13 milage(20);
        //14
        //15
        //16 d.randMaxOrMin(25);
        //17 System.out.println(sumOfDigits(252));
    }

    /**
     * 1.Print all integer numbers from 1 to 10.
     * 2.Print all even integer numbers from 1 to 20.
     * 3.Print all exact squares of natural numbers that are not
     * exceeding a given positive integer N. Input N from console.
     */
/*
    public static void exeWhile1(int i, int j) {

        while (i < j) {
            i++;
            System.out.println(i);
        }
    }
    public static void exeWhile2(int i, int j) {

        while (i < j) {
            i++;
            if(i%2==0){
            System.out.println(i + " is even");
        }
    }}


    public static void exeWhile3(int j) {
        int i = 1;

        while (i < j) {
            int k = i * i;
            if (k < j) {
                i++;
                System.out.println(k);
            } else System.out.println("invalid input");
        }
    }*/

    /**
     * Given an integer number, greater than 2.Find and print the
     * smallest natural divisor other than 1 for a given number.Input
     * number from console.Example ` Input` 15
     * Output ` 3
     */
/*
    public  static  void smallestDivisor(int num) {
        int i = 1;
        if (num > 2) {
            while (i <= num) {
                i++;
                if (num % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
    }else System.out.println("invalid number");}
*/

    /**
     * 5.Print all integer powers of two not exceeding N in ascending
     * order.Input N from console. Example ` Input 50(You can not use
     * Math.pow())
     * Output ` 1 2 4 8 16 32
     */
/*
    public static void allINTpowers(int num) {
        int b = 1;

        while (b <= num) {
            b = b << 1;
            if (b < num) {
                System.out.println(b);
            }
        }
    }*/

    /**
     * 6.For a given integer number N,print all integers in descending
     * order.
     */
/*
    public  static void desendingInt(int num){
        int a=0;
while(a<num){
    a++;
    System.out.println(num-a);

}
    }*/


/**
 * 7.For a given integer number N,print all integers that are multiple of
 * 2 in descending order.
 */
/*
public static void multiplyDesending(int num){
    int a=0;
    while(a<num){
        a++;
        if(a%2==0){
            System.out.println(num-a);
        }
    }}
*/


/**
 *8Input N natural number till N would be the exact power of 2.If N is
 * the exact power of 2 .
 * - Print N
 * - Print count of input integers
 * - break loop
 *
 */
/*
int count=1;
public void exactPower(){
    System.out.println("num");
    int b=scanner.nextInt();

    int n=b;
        while (n != 1)
        {
            if (n % 2 != 0){
                count++; exactPower();}
          else   n = n / 2;
        }
    System.out.println(b +" "+count);
    }
    */

    /**
     * 9.For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.(You can not use Math.pow())
     * Example` Input 7
     * Output 3
     */
/*

    public static void power(int x) {
        int i = 2;
        int count = 0;
        while(x>=i){
            i=i<<1;
            count++;
        }
                System.out.println(count);
            }

*/


    /**
     *10.Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
/*
    public static void charEquivalent(int i, int n){


        while(i <= n)
        { if(i%10==2){

            System.out.println("\n");}
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
            i++;
        }
    }
*/
/**
 * 11.Print all integer numbers from 1 to N, except that are multiple of
 * 3(Input N from console)
 * System.out.println(i);
 * }
 */
/*
public static  void multiplyOfThree(int n){

    int i=0;
    while(i<n){
        i++;
        if(i%3==0){
            continue;
        }else System.out.println(i);
    }
*/


    /**
     * 12.Given integer number A &gt; 1,define what is the Fibonacci number
     * is A, i.e print such number n that φn=A.If A is not a Fibonacci
     * number print -1. Example
     * Input 8
     * Output 6
     * Input 10
     * Output -1
     */



    /**
     * 13.On the first day, the athlete ran x kilometers,and then every day
     * he increased the mileage by 10% from the previous value,Given the
     * number y, determine the number of the day for which the athlete&#39;s
     * mileage will be at least y kilometers.
     * Example` Input 10 Output 9
     * System.out.println(i);
     */


/*

    public static void milage(double k) {
        double i = 10;
        int count = 0;
        while (i < k) {
            i = i + (i * 10 / 100);
            count++;

        }
        System.out.println(count);
    }
*/
    /**
     * 14.The deposit in the bank is x dollars. It increases annually by p
     * percent, after which the fractional part of cents is discarded.
     * Determine how many years the contribution(ներդրում) will be at
     * least y dollars.(Input x , p , y from console)
     */


    /**
     * 15.The sequence consists of different natural numbers and ends
     * with the number 0. Determine the value of the second largest
     * element in this sequence.
     * (A sequence of natural numbers is introduced, ending with the number 0 (the
     * number 0 itself is not included in the sequence, but serves as a sign of its
     * termination)).
     */

    /**
     * 16.Write a program that generates a random number and asks the user
     * to guess what the number is. If the user’s guess is higher than the
     * random number, the program should display Too high, try again. If the
     * user’s guess is lower than the random number, the program should
     * display Too low, try again. If you find the number print Yes, you
     * guessed the number.The program should use a loop that repeats
     * until the user correctly guesses the random number.
     */
/*
    public  void  randMaxOrMin(int num) {
        System.out.println(num);
        int answer;

        answer = rand.nextInt(100);
        System.out.println(answer);
        while (num < answer) {
            System.out.println("Too high, try again");
            break;
        }


        while (num > answer) {
            System.out.println("Too low, try again");
            break;
        }
    }
*/


    /**
     * 17. Write a Java Program to Compute the Sum of Digits in a given
     * Integer.
     */
/*
    public static int sumOfDigits(int num) {
        int i = 0;
        int sum = 0;
        while (num > 0) {
            i = num % 10;
            sum = sum + i;
            num = num/ 10;
        }
        return sum;
    }*/
}











