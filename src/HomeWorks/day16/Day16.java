package HomeWorks.day16;

import java.time.LocalTime;
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    /**
     * 3.A natural number N is given (entered from the keyboard). Calculate two to the power of N
     * Display the calculated value (1 &lt;= N &lt;= 15).
     */

    public static int thePowerToNumber(int num) {
        if (num >= 1 && num <= 15) {
            return 2 << num - 1;
        }
        return -1;

    }

    /**
     * 4.Given number n. N minutes have passed since the beginning of the day. Determine how many
     * hours and minutes the digital clock will show at this moment. The program should print two
     * numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59). Note that
     * the number n can be more than the number of minutes in a day.
     *  
     * Example` 150 2 30
     * 1441 0 1
     */


    public static void passedTime(int n) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        int hour = n / 60;
        int min = n % 60;
        if (hour >= 24) {
            hour = hour % 24;
        }
        System.out.println("hours: " + hour + "\n" + "min: " + min);

    }

/**
 * 5.How many times will the body of the loop be executed?
 * - - for (int i = 2; i &lt;= 15; i ++)
 * {...} //14
 * - - for (int i = 10; i &lt;= 100; i = i+7)
 * {...}//13
 * - - for (float i = 1.5; i &lt;= 10.3; i = i+0.4)
 * {...}//23
 *
 */

    /**
     * Write a java program to determine whether the number is prime or not.
     */

    public static void numIsPrime(int n) {
        boolean isPrime = true;
        int i, m, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(isPrime);
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(!isPrime);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(isPrime);
            }

        }
    }

    /**
     * 6.You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A
     * to B, the record of which is a palindrome.
     * Example` 1600 1661
     * 2100 1771
     * 1881
     * 1991
     * 2002
     */

    public static void palindrome(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int value = num;
        int n = 0;
        while (value != 0) {
            n = n * 10 + value % 10;
            value /= 10;
        }

        return num == n;
    }

    /**
     * 7. A three-letter word is given. The word consists only of Latin letters, small and large. Print the
     * same word, where the first letter is capitalized, the rest are small.
     *  
     * Example` dog Dog
     * CAT Cat
     * Lip Lip
     */

    public static String capitalFirstLet(String word) {
        if (word != null) {

            word = word.toLowerCase();
            return word = new String()
                    .concat(word.substring(0, 1).toUpperCase())
                    .concat(word.substring(1));

        }
        return " ";
    }

    /**
     * 8.Enter the number N and draw an NxN checkerboard where the top left is white. Designate white
     * margins O, black margins X. Use a for loop.
     */
    public static void checkboard(int n) {
        boolean odd = false;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (y % 2 == 0) {
                    if (x % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("X");
                    }
                }

                if (y % 2 != 0) {
                    if (x % 2 == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }


    /**
     * 9.The first term and the denominator of the geometric progression are given (real numbers b1 and
     * q, q! = 0). An integer n is also given. Print the n-th term of a geometric progression. Don&#39;t use the
     * pow function, use a for loop. Print the answer with precision exactly two characters after the
     * period.
     *  
     * Example` Input ` 2 2 32.0
     * 5
     * 3.2 1.5 10.80
     * 4
     */

    public static double geometricProgression(double startNum,
                                              double k,
                                              double period) {
        double prog = startNum * (Math.pow(k, period - 1));

        return prog;
    }


    /**
     * 10.A natural number&gt; = 2 is specified. Expand it into prime factors.
     * Example` Input` 120 2*2*2*3*5
     */


    public static void primeFactors(int val) {
        while (val % 2 == 0) {
            System.out.print(2 + " ");
            val /= 2;
            System.out.print("* ");
        }

        for (int i = 3; i <= Math.sqrt(val); i += 2) {
            while (val % i == 0) {
                System.out.print(i + " ");
                val /= i;
                System.out.print("* ");
            }
        }
        if (val > 2)
            System.out.print(val);

    }


    /**
     * *11.Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with the
     * multiplication table A [i] [j] = i * j and display it. In this case, you cannot use nested loops, the entire
     * filling of the array must be done in one cycle.
     * Example` Input` 3 3
     * Output` 0 0 0
     * 0 1 2
     * 0 2 4
     */

    public static void multiplicationTable(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = i * j;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 12.Given numbers n and m. Create an array A [n] [m] and fill it as shown in the example.
     * Input` 4 10
     * Output`
     *  
     * 0 1 3 6 10 14 18 22 26 30
     * 2 4 7 11 15 19 23 27 31 34
     * 5 8 12 16 20 24 28 32 35 37
     * 9 13 17 21 25 29 33 36 38 39
     */





        /**
         * 13.Given numbers n and m. Create an array A [n] [m] and fill it with a snake (see example).
         *
         * Example` Input 4 10
         * Output `
         * 0 1 2 3 4 5 6 7 8 9
         * 19 18 17 16 15 14 13 12 11 10
         * 20 21 22 23 24 25 26 27 28 29
         * 39 38 37 36 35 34 33 32 31 30
         */

        public static void snake(int n, int m) {
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < m; j++) {
                        array[i][j] = i * 10 + j;
                    }
                } else {
                    for (int j = 0; j < m; j++) {

                        array[i][j] = i * 10 + m - 1 - j;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }



        /**
         * 14.Write a java program to rotate 2D matrix
         * - - Give an opportunity to push 1 for transporting matrix by 90 degrees
         * - - Give an opportunity to push 2 for transporting matrix by 180 degrees
         * - - In other case print illegal choice
         */


    }

