import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer;	//배열 선언
        
        answer = Arrays.copyOfRange(numbers, num1, num2+1);	//특정 범위 배열 복사
        
        return answer;
    }
}