class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];	//배열 생성
        answer[0] = money / 5500;   //아메리카노의 잔 수
        answer[1] = money % 5500;   //남은 돈
        
        return answer;  //담아서 리턴
    }
}