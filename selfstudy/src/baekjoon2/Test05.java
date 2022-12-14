package baekjoon2;

public class Test05 {
	public static void main(String[] args) {
//		첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//		입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
//		시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//		
//		첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)

		int h = 0;
		int m = 0;
		
		int hToM = h * 60;
		int total = hToM + m;
		if(total < 45) {
			total += 24 * 60;
		}
		int early = total - 45;
		
		int earlyH = early / 60;
		int earlyM = early % 60;
		
		System.out.println(earlyH + " : " + earlyM);
	}
}
