package com.ArrayDemo;
import java.util.*;
public class SingleDimensionalArray {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.print("Enter the element on index "+i+" = ");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
