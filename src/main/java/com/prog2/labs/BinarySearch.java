/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author amirg
 */
public class BinarySearch<T extends Comparable<T>> {

	public static int binarySearch(Integer[] parameterOne, int parameterTwo) {
		int index = -1;
		int lowEnd = 0;
		int highEnd = parameterOne.length - 1;

		while (highEnd >= lowEnd) { // Difference of highEnd and lowEnd decreases as the search range narrows
			int middle = (lowEnd + highEnd) / 2;
			// checks if the middle of the lowEnd and the highEnd is the target
			if (middle == parameterTwo) {
				index = middle-1; // the target is found
                                index = parameterOne[index];
				break;
			} else if (middle < parameterTwo) {
				// changes the lowEnd to narrow the search range
				lowEnd = middle + 1;
			} else if (middle > parameterTwo) {
				// changes the highEnd to narrow the search range
				highEnd = middle - 1;
			}
		}

		
                return index;
	}
}