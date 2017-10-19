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
public class A3Q1 {

    // swap method created 
    public void swap(int[] array, int p1, int p2) {
        //position one and two are swaped 
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    //selection sort method created 
    public void selectionSort(int[] array) {
        //goes through the array
        for (int position = 0; position < array.length; position++) {
            //int to store smallp of position 
            int smallP = position;
            //goes through the array 
            for (int i = position + 1; i < array.length; i++) {
                //have we found a smalle number
                //if so then swap
                if (array[i] < array[smallP]) {
                    smallP = i;
                }

            }
            //swap the position with the smallp 
            swap(array, position, smallP);
        }
    }

    //print method created 
    public void print(int[] array) {
        //goes through the array and prints the numbers with a comma
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // test creates 
        A3Q1 test = new A3Q1();
        //create a random array for trial
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            //make a random number
            numbers[i] = (int) (Math.random() * 101);
        }
        //print the numbers before the sort 
        test.print(numbers);
        //sort and then print the numbers 
        test.selectionSort(numbers);
        test.print(numbers);

    }
}
