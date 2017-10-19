/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.pkg4u;

/**
 *
 * @author niralikantaria
 */
public class A3Q3 {

    //Method created to count all the ones in the array
    public int countOnes(int[] array) {
        //int created to store the number of ones
        int num = 0;
        //go through the array
        for (int pos = 0; pos < array.length; pos++) {
            //if there is a one in the array
            if (array[pos] == 1) {
                //then add it to the integer created
                num = num + 1;
            }
        }
        //return the final number 
        return num;
    }

    public static void main(String[] args) {
        //test method created to sort from question 1
        A3Q1 test = new A3Q1();
        //test created for this assignment
        A3Q3 test1 = new A3Q3();
        //array created to store 10 numbers
        int[] numbers = new int[10];
        //generate 0 and 1 into the array randomly
        for (int i = 0; i < numbers.length; i++) {
            //make a random number either 0 or 1
            numbers[i] = (int) (Math.random() * 2);
        }
        //print out the orginal array
        System.out.println("ARRAY: ");
        test.print(numbers);
        //space created 
        System.out.println("");
        //print out the number of 1's in the array
        System.out.println("There are: " + test1.countOnes(numbers) + " ones in the array.");
    }

}
