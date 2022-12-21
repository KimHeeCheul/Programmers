class Solution {
	public int solution(int n) {
		int answer = 0;
		while (n != 0) {
			if (n <= 1000000) {
				answer += n % 10;
				n /= 10;
			}
		}
		return answer;
	}
}