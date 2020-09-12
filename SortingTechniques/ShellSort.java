/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class ShellSort {
    
    public static void main(String[] args){
        
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        
        for(int gap = arr.length/2; gap > 0; gap = gap /2){
            
            for(int i = gap; i < arr.length; i++){
                int newElement = arr[i];
                int j = i;

                while(j >= gap && arr[j-gap] > newElement){
                    arr[j] = arr[j-gap];
                    j = j - gap;
                }

                arr[j] = newElement;
            }
        
        }
        
        for(int i = 0; i < arr.length; i++){
               System.out.println(arr[i]); 
        }
    
    }
    
    
    
}
