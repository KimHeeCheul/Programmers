class Solution {
	public int solution(int n) {
		int answer = 2;
		// Math.pow(x,y)를 사용하여 결과를 계산하였다.
		// ex) Math.pow(5,3); 5의 3제곱
		for (int i = 1; i <= 1000; i++) {
			if (Math.pow(i, 2)==n) {
				return 1;
			}
		}
		return answer;
	}
}