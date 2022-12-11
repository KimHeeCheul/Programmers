class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == n){	//array의 i번째에 들어온 수와 n이 같다면
                answer++;		//answer +1을 한다
            }
        }
        return answer;
    }
}