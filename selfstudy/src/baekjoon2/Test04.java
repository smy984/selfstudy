package baekjoon2;

public class Test04 {
	public static void main(String[] args) {
//		흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다.
//		"Quadrant n"은 "제n사분면"이라는 뜻이다.
//		예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//		점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
//
//		첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
//
//		점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

		int x = 6;
		int y = -5;
		
		boolean one = x > 0 && y > 0;
		boolean two = x < 0 && y > 0;
		boolean three = x < 0 && y < 0;
		
		int answer = 0;

		if(one) {
//			System.out.println("1");
			answer = 1;
		}
		else if(two) {
//			System.out.println("2");
			answer = 2;
		}
		else if(three) {
//			System.out.println("3");
			answer = 3;
		}
		else {
//			System.out.println("4");
			answer = 4;
		}
		
		System.out.println(answer);
	}
}
