package baekjoon1;

public class Test13 {
	public static void main(String[] args) {
//		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//		
//		
//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//		
//		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		int a = 472;
		int b = 385;
		
		System.out.println("    " + a);
		System.out.println("  X " + b);
		System.out.println("-------");
		
		int a1 = a / 100;
		int a2 = (a / 10) % 10;
		int a3 = a % 10;
		
		int b1 = b / 100;
		int b2 = (b / 10) % 10;
		int b3 = b % 10;
		
		System.out.println("   " + a * b3);
		System.out.println("  " + a * b2);
		System.out.println(" " + a * b1);
		System.out.println("-------");
		System.out.println(" " + a * b); 
	}
}
