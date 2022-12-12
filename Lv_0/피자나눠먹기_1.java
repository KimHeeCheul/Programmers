class Solution {
	public int solution(int n) {
		int answer = 0;
		if (n%7 == 0) {			//나머지가 0일 때
			return n/7;			//사람당 먹은 피자 조각 수를 반환  
		} else if (n%7 != 0) {	//나머지가 0이 아닐경우
			return n/7 + 1;		//모든 사람이 한조각 씩 먹을 수 있도록 +1을 하여 반환한다 
		}
		return answer;
	}
}