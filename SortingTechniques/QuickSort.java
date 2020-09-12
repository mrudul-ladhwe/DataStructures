/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class QuickSort {
    
    public static void quickUtil(int[] arr, int start, int end){
        
        if(end - start < 2){
            return;
        }
       
        int pivot = partition(arr, start, end);
        quickUtil(arr, start, pivot);
        quickUtil(arr, pivot+1, end);
    }
    

    public static int partition(int[] arr, int st, int e){
        int p = arr[st];
        int i = st;
        int j = e;
        
        while(i < j){
            while(i < j && arr[--j] >= p);
            if(i < j){
                arr[i] = arr[j];
            }

            while(i < j && arr[++i] <= p);
            if(i < j){
                arr[j] = arr[i];
            }
        }
        
        arr[j] = p;
        return j;
        
    }
    
    public static void main(String[] args){
        
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        
        quickUtil(arr, 0, arr.length);
        
        for(int i = 0; i < arr.length; i++){
               System.out.println(arr[i]); 
        }
    }
    
}
