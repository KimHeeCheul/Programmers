class Solution {
	public int[] solution(int n, int[] numlist) {
		// 배열의 값 개수를 count에 구하기
		int j = 0;
		int count = 0;

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				count++;
			}
		}
		
		// 선정된 값을 담는곳 만든 후
		int[] answer = new int[count];
		
		// j의 배수를 출력
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[j] = numlist[i];
				j++;
			}
		}
		return answer;
	}
}