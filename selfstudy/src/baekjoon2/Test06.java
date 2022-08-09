package baekjoon2;

public class Test06 {
	public static void main(String[] args) {
//		첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
//		두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
//		
//		첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
//		디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

		int h = 23, m = 48;
		int cook = 25;
		
		int hToM = h * 60;
		int total = hToM + m;
		if(total > 24 * 60 - cook) {
			total -= 24 * 60;
		}
		
		int end = total + cook;
		int endH = end / 60;
		int endM = end % 60;
		
		System.out.println(endH + " : " + endM);
	}
}
