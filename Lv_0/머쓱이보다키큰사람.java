class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>height){//array의 i번째에 들어온 수가 키보다 크다면
                answer++;		//answer에 +1을 한다
            }
        }
        return answer;
    }
}