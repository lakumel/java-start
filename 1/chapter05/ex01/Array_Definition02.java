package chapter05.ex01;

import java.util.Arrays;

public class Array_Definition02 {
	public static void main(String[] args) {
		
		/*
		 배열의 선언 방법 3 가지 방법
		 */
		
		System.out.println("==1. 배열 선언과 동시에 값을 할당. ");
		// 주의 : 방의  크기를 지정하면 안됨 
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 } ;  
		
		//출력 (For)
		for ( int i = 0 ; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n \n");
		
		// 출력 ( Enhanced For )를 사용해서 출력 
		for (int c : arr1) {
			System.out.print(c + " ");
		}
		System.out.print("\n \n");
		
		System.out.println("=======2. 배열 선언 과 동시에 값 할당 ");
		
		int [] arr2 = {11,22,33,44,55,66,77};   
		
		//For 문으로 출력 
		for ( int i =0 ; i < arr2.length; i++) {
			System.out.print( arr2[i] + " ");
		}
		
		System.out.print("\n \n");
		
		//Enhanced For 문으로 출력 
		for ( int d : arr2) {
			System.out.print(d + " ");
		}
		
		System.out.print("\n \n");
		
		// Arrays.toString(배열변수) 로 출력 
		System.out.println(Arrays.toString(arr2));     // 배열 변수의 모든 값을 출력 
		
		
		
		
		
		
		
	}

}
