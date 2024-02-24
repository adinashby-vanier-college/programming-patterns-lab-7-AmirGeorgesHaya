/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.util.Comparator;

/**
 *
 * @author amirg
 */
public class SelectionSort<T extends Comparable<T>> {
    
            private Comparator<T> comparator = Comparator.naturalOrder();

            void sort(T arr[]){
                
                int n = arr.length;
                
                for(int i = 0; i< n-1; i++){
                    
                    int min_idx = i;
                    
                    
                    
                    for(int j = i+1; j <n ; j++){
                        if(arr[min_idx].compareTo(arr[j])>0){
                            T temp = arr[min_idx];
                            arr[min_idx] = arr[j];
                            arr[j] = temp;
                        }
                    }
                    
                }
                
                
                
            }

    void printArray(T arr[]){
        int n = arr.length;

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	
    }
    
    
    
    
}
