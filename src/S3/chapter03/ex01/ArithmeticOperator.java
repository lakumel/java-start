package S3.chapter03.ex01;

public class ArithmeticOperator {
	public static void main(String[] args) {
	/*
	   산술 연산자 : +, -, *, / , % (나머지 값 만출력) 
	   증감 연산자 :  ++ ( 1씩증가 ) , -- (1씩감소)      <== 변수 앞에, 변수 뒤에    
	 */
	//1. 산술 연산자 
		int a = 5; 
		int b = 10; 
		System.out.println( 2 + 3);  // 정수 : 5 
		System.out.println( a + b);  // 정수 : 15
		
		System.out.println( 2 + (double)3);    // 실수 : 5.0    , 2 자동으로 double 타입으로 업케스팅 
		
		System.out.println(8%5);     // 8을 5로 나누어서 나머지 값만 출력 , if, for 2의 배수, 3의 배수 
		System.out.println(8/5);     // int : 목 만 출력 
		System.out.println(8/5.0);   // double : 1.6 
		System.out.println((int) (8/5.0));   //목 만 출력 :  1
		
	// 2. 증감연산자 : ++, -- 
		int val1 = 3; 
		val1++; 
		System.out.println(val1);   // 4 
		
		val1--; 
		System.out.println(val1);   // 3
		
		int val2 = 3; 
		++val2 ; 
		System.out.println(val2);  // 4
		--val2 ; 
		System.out.println(val2);  // 3 
		
		System.out.println("===========================");
		
		int val3 = 3; 
		int val4 = val3++; 
		System.out.println(val4);     //3
		//증감연산자는 val3의 현재 값을 val4에 먼저 대입을 한 다음 val3값을 증가시킨다 그래서 3이라는 값이 나온다.

		
		int val5 = 3; 
		int val6 = ++val5 ; 
		System.out.println(val6);    //4
		
		System.out.println("============================");
		// <중요>  
		
		int val7 = 3; 
		int val8 = 4; 
		int val9 = 2 + val7-- + ++val8 ;    // 2 + 3 + 5  
		
		System.out.println("val7 : " + val7);   //2 
		System.out.println(val9);   // 10  
		System.out.println("==================================");
		
		int val10 = 30; 
		int val11 = 40; 
		int val12 = 50; 
		
		int val13 = 7 + --val10 + ++val11 + val12--; 	// 7 + 29 + 41 + 50 
		System.out.println(val12);  //49 
		System.out.println(val13);   //127 
		

		
		
		
		
	}
}
