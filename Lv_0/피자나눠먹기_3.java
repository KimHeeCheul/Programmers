class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice == 0){		//나머지 가 0일 경우
            answer = n/slice;	//나누어 떨어지게 하거나
        }else{
            answer = n/slice+1;	//조각수를 더하여 나머지가 0이 되게 한다
        }
        return answer;
    }
}