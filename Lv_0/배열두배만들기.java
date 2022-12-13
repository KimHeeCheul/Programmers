class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];	//배열 생성
        for(int i=0 ; i<numbers.length ; i++){	//생성한 배열을 넣어서 반복문 실행
            answer[i] = numbers[i]*2;			//두배의 수가 나와야 하기 때문에 numbers의 i배열에 *2
        }
        return answer;
    }
}