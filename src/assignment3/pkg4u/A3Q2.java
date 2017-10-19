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
public class A3Q2 {

    //method created to find the lowest missing number 
    public int smallestMissingNumber(int[] array) {
        //base case 
        // if the pnumber in position 0 is not 0 then return 0.  
        for (int i = 0; i < array.length; i++) {
            if (array[0] != 0) {
                return 0;
            }
        }
        //create a int to store the number of ones
        int number = 0;
        //goes through the array
        for (int i = 0; i < array.length; i++) {
            number = array[i] + 1;
            //if there is a 1 then it is added to the int created 
            if (array[i + 1] != number) {
                return array[i] + 1;
            }
        }
        //turn the final number 
        //subtract by 1 beacuse the array starts at 0
        return -1;
    }

    public static void main(String[] args) {
        //test created 
        A3Q2 test = new A3Q2();
        //array of 10 numbers 
        int[] num = new int[10];
        //a lis of 10 numbers in their position in the array 
        num[0] = 0;
        num[1] = 1;
        num[2] = 2;
        num[3] = 3;
        num[4] = 5;
        num[5] = 6;
        num[6] = 8;
        num[7] = 10;
        num[8] = 11;
        num[9] = 13;
        //print out the array created above 
        System.out.println("ARRAY: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        //test the method and print out the lowest missing number 
        System.out.println("The lowest missing number in the array is: " + test.smallestMissingNumber(num));
    }
}
