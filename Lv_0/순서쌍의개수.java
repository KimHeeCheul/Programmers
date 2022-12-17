class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1 ; i<=n ; i++){	//반복문 i는 1이고 n보다 적거나 같고
            if(n%i==0){				//n을 i로 나눈값의 나머지가 0일 때 
                answer++;			//+1 한 값을 리턴한다
            }   
        }
        return answer;
    }
}