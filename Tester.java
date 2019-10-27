import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {





        /*sample: create a linearSearch class

        Make a class called "Linear Search" that does a linear search through an inputted array and returns the value if it exists,
        otherwise it returns -1. State the Time Complexity of the class at the end.


         */

            int[] a = new int[100];
            for(int i = 0; i < a.length; i++){
                a[i] = i;
            }
            LinearSearch linear = new LinearSearch();
            System.out.println(linear.LinearSearch(a, 85));
        System.out.println(linear.LinearSearch(a, 200));
        System.out.println("The time complexity of linear search is: O(n)");


        /*  1:  FizzBuzz but with a catch:
                Make a fizzBuzz java class, using ONLY a do while loop and ternary operators (NO if statements, for loops, etc.),
                that also counts up from -n all the way to -1
                For example if input = -100, then fizzBuzz should start from -100 and count all the way to -1

                If n is divisible by 3 and 5 print out "FizzBuzz"
                If it is divisible only by 3 print out "Fizz"
                else if it is divisible by only 5 print out "Buzz"

                If you do not know how to initiate a do while loop, you can use the link provided below:

                https://www.w3schools.com/java/java_while_loop.asp

                Instantiate the fizzBuzz class into this Tester class and give it an input of -110
                It should print out all the numbers from -110 all the way to -1 and should do the fizzBuzz logic as well

                Example:

                fizzBuzz output = new fizzBuzz(-110);

                System.out.println(output);


                Make sure to print out a statement showing it's time complexity after

         */


        /*  2:  Create a class called "findAllCharOccurrences" that asks the user for a string input, and
                a character input, and then uses regex to find all occurrences of a
                character in that string. It should then create and output a variable that shows the number of occurrences
                of that word in the string.

                You must ONLY use regex to find all of the occurrences of the character in a string, and it should not be case
                sensitive. Furthermore the output should be exactly as shown in the examples below:

                For example:

                Please input a string: hello

                Ok, now please input a character: l

                Output:

                The number of occurrences of 'l' in string 'hello' is: 2


                Another example:

                Please input a string: hello

                Ok, now please input a character: L

                Output:

                The number of occurrences of 'L' in string 'hello' is: 2


             ** HINT: Use Java's Scanner class to get and store user inputs **


               Make sure to print out a statement showing the class's time complexity after as well

         */


        /*  3:  Create a class called "reversingAndAddingMatrices" that takes a int matrice (2D array) as an input, reverses all the
                numbers in the sub arrays in the matrice, and then reverses the sub arrays themselves. After that you must create a
                method inside that class called "matriceAddition" that adds the values inside the sub arrays
                of the two matrices, and then outputs the final result.

                If you are confused you can see the sample below for additional clarity:


                Step1 - A sample matrice is inputted into the class:

                   inputtedMatrice = [ [1,2,3], [4,5,6], [7,0,9] ]


               Step2- Both of the values inside the sub arrays in the matrice and the sub arrays themselves are reversed:

                   inputtedMatriceReversed = [ [9,0,7], [6,5,4], [3,2,1] ]


               Step3: Using the matriceAddition method, the values inside the sub arrays of the
               reversed matrice and the original inputted matrice are added together like so:

               finalMatrice = inputtedMatrice + inputtedMatriceReversed

              = [ [1,2,3], [4,5,6] , [7,0,9] ] + [ [9,0,7], [6,5,4], [3,2,1] ]

              = [ [1 + 9, 2 + 0, 3 + 7], [4 + 6, 5 + 5, 6 + 4], [7 + 3, 0 + 2, 9 + 1]  ]

              THE FINAL OUTPUT:

             [ [10,2,10], [10,10,10], [10,2,10] ]


             You must output the final result into this Tester class by instantiating the reversingAndAddingMatrices class,
             then calling and printing out the result of the 'matriceAddition' method inside the class.
             Make sure to print out a statement showing the class's time and space complexity after as well


         */



        /*  4:  Create a naive implementation of a map (dictionary)
                data structure and call the class "Map". It must use a KeyAndValuePair class
                that you will have to also code yourself. The Map class
                should have a put method that puts in a KeyAndValuePair class into it.

                DISCLAIMER: You are NOT allowed to use any built in Java collection methods such as: ArrayList, Map, set, etc.
                            you must implement both classes from scratch using only arrays


                 After you are finished you should try putting in a couple of KeyAndValuePair classes into the map inside this
                 "Tester" class and then finding the values by using their keys.

                 For example:

                 KeyAndValuePair entry1 = new KeyAndValuePair(1, "C");
                 KeyAndValuePair entry2 = new KeyAndValuePair(2, "A");

                 map.put(entry1)
                 map.put(entry2)

                 now the map array will have KeyAndValuePair objects inside:

                 map = [entry1, entry2]


                 Now you must access the values of each entry inside the array by creating and using a method
                 called getValue:

                 map.getValue(1)
                 map.getValue(2)


                 Output:

                   "C"
                   "A"



                Make sure to print out a statement showing the class's time and space complexity after as well

         */


        /*

            5:  Create a java implementation of a doubly linked list in a class called "doublyLinkedList". Inside, the class you must
                also create a QuickSort method. Once, you are finished add at least 5 values to the doublyLinkedList inside this Tester
                class, and then use the QuickSort method inside your class to sort this linked list.

                You must not use the built in Java LinkedList Collections framework, you have to create it from scratch


                Once you are finished, output the final sorted result as well as the doubly linked list, and the quick sort method's
                time and space complexities.

         */


        /*
            6:  Create a class called 'EulersNumber', you must code the approximate equivalent of e^x RECURSIVELY

                e^x =  (1 + x + x^2)/ (2! + x^3) / (3! + x^4) /.... (n! + x^n)


                Instantiate the class into this Tester Class and output the result, as well as the time and space complexity


         */



        /*
            7:  Create a java implementation of a definite integral in a class called "SolveDefiniteIntegral"
                Use it to solve the following simple definite integral:

                lower bound (a) is : 3
                upper bound (b) is: 4
                and the equation is: (x^2 + x - 2)dx

                  4
                ∫   (x^2 + x - 2) dx
                  3

                If that seems confusing, check out the following link given that shows you the exact definite integral, and a
                step by step process on how to solve it, as well as the final result:

                https://www.symbolab.com/solver/definite-integral-calculator/%5Cint_%7B3%7D%5E%7B4%7D%5Cleft(x%5E%7B2%7D%20%2B%20x%20-2%5Cright)%20dx


                Here is another helpful link (it is a popular way to program a definite integral):

                https://www.intmath.com/integration/6-simpsons-rule.php


                The final output should be the value of 83/6 which is equal to (13.83333) and rounded to two decimal places

                You must also output the time and space complexity after
         */



        /*
            8:  Using Taylor series, it is possible to write the approximation of this trig function:

                    n
            cosx =  ∑  ( (-1)^n /  (2n)! ) * x^2n
                    i=1

            Create a java recursive implementation of this Taylor series, called 'TaylorCosine', instantiate it into the tester's class,
            and output the final result, rounded to 3 decimal places:


            The implementation must be RECURSIVE

            Some helpful sample outputs:

            cos(24.67800° ) =  0.90866855998
            =   0.909

            cos (0°) = 1.00

            cos (-90°) =  0.00

            cos (45°) =  √(2) / 2  which is approximately:  2.828


            Output the time and space complexity of the class after



         */







    }
}
