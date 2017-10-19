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
public class A3Q5 {

    //insertionSort method created to sort words 
    public void insertionSort(String[] array) {
        //start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            //store position
            int position = i;
            //go through the array and arrange the words 
            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                //if the position is incorrect change swap the psotions 
                swap(array, position, position + 1);
                position--;
            }
        }
    }

    //swap method created 
    public void swap(String[] array, int p1, int p2) {
        //swaps p1 with p2 
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test created 
        A3Q5 test = new A3Q5();
        //an array created random words 
        String[] array = {"coin", "science", "chemistry", "functions", "apple"};
        //print out the words 
        System.out.println("WORDS BEFORE: ");
        test.print(array);
        //print out the words after the sortting 
        System.out.println("WORDS AFTER: ");
        test.insertionSort(array);
        test.print(array);
    }

    //print method created 
    private void print(String[] array) {
        //goes through the array
        for (int i = 0; i < array.length; i++) {
            //prints out the array with a comma
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

}
