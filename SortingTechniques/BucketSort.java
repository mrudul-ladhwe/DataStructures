/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */

import java.util.*;

public class BucketSort {
    
    public void bucket(int[] input){
        List<Integer>[] buckets = new List[10];
        
        for(int i=0; i< buckets.length; i++){
            buckets[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i< input.length; i++){
            buckets[hashFunc(input[i])].add(input[i]);
        }
        
        for(List b: buckets){
            Collections.sort(b);
        }
        
        int j=0;
        for(int i=0; i< buckets.length; i++){
            for(int val:buckets[i]){
                input[j++] = val;
            }
        }
    }
    
    public int hashFunc(int value){
        return value/ (int)10 % 10;
    }
    
    public static void main(String[] args){
        int[] arr = {54, 46, 83, 66, 95, 92, 43};
        
        BucketSort bs = new BucketSort();
        
        bs.bucket(arr);
        
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
