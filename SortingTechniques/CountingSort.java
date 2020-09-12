/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class CountingSort {
    
    public static void count(int[] arr, int min, int max){
        
        int[] countArr = new int[(max - min) + 1];
        
        for(int i = 0; i < arr.length; i++){
            countArr[arr[i] - min]++;
        }
        
        int j =0;
        for(int i = min; i <= max; i++){
            while(countArr[i - min] > 0){
                arr[j++] = i;
                countArr[i - min]--;      
            }
        }
        
    }
    
    public static void main(String[] args){
        
        int[] arr = {2,5,9,8,2,8,7,10,4,3};
        
        count(arr, 1, 10);
        
        for(int i = 0; i < arr.length; i++){
               System.out.println(arr[i]); 
        }
    }
    
}
