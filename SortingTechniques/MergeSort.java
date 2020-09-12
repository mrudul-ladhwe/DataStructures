/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class MergeSort {
    
    public static void mergeSortUtil(int[] arr, int start, int end){
        
        if(end - start < 2){
            return;
        }
        
        int mid = (start + end)/2;
        
        mergeSortUtil(arr, start, mid);
        mergeSortUtil(arr, mid, end);
        merge(arr, start, mid, end);
    }
    
    public static void merge(int[] arr, int s, int m, int e){
        
        if(arr[m -1] < arr[m]){
            return;
        }
        
        int i = s;
        int j = m;
        int tempIndex = 0;
        
        int[] temp = new int[e - s];
        
        while(i < m && j < e){
            if(arr[i] <= arr[j]){
                temp[tempIndex++] = arr[i++];
            }
            else{
                temp[tempIndex++] = arr[j++];
            }
        }
        
        System.arraycopy(arr, i, arr ,s+tempIndex, m -i);
        System.arraycopy(temp, 0, arr, s, tempIndex);
    }
            
    public static void main(String[] args){
        
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        
        mergeSortUtil(arr, 0, arr.length);
        
        for(int i = 0; i < arr.length; i++){
               System.out.println(arr[i]); 
        }
    }
    
}
