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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test created to use the basic method of sorting 
        A3Q1 test = new A3Q1();
        //test created 
        A3Q4 test1 = new A3Q4();

        //array created with 100 spots 
        int[] array = new int[100];
        //fills the array with numbers from 0 to 100
        for (int i = 0; i < array.length; i++) {
            //make a random number either 0 or 1
            array[i] = (int) (Math.random() * 101);
        }
        //print out the orginal array and sort it using Q1
        System.out.println("ORGINAL ARRAY: ");
        test.print(array);
        //test the array through countsort 
        int[] finalA = test1.countSort(array);
        //space created between both arrays
        System.out.println("");
        //print out the final array by sorting it through selection sort 
        System.out.println("SORTTED ARRAY: ");
        test.print(finalA);

    }

    //countsort method created 
    public int[] countSort(int[] array) {
        //int to store the postion 
        int position = 0;
        //two arrays created 
        //to store 100 counts
        int[] count = new int[101];
        //to store the array 
        int[] answer = new int[array.length];
        //go through the array 
        for (int i = 0; i < array.length; i++) {
            //add one to the array at a current position 
            count[array[i]]++;
        }
        //go through the array 
        for (int i = 0; i < count.length; i++) {
            for (int k = 0; k < count[i]; k++) {
                //the answer of the position is equal to i 
                answer[position] = i;
                //add 1 to the position because array start at 0 
                position++;
            }
        }
        //return answer
        return answer;
    }
}
