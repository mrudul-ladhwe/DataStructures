/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class InsertionSort {
    
    public static void main(String[] args){
        
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        
        for(int firstSorted = 1; firstSorted < arr.length; firstSorted++){
            int newElement = arr[firstSorted];
            int i;
            for(i = firstSorted; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            
            arr[i] = newElement;
        }
        
        for(int i = 0; i < arr.length; i++){
               System.out.println(arr[i]); 
        }
    
    }
    
}
