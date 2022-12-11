class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        //for문을 돌려서 배열에 담긴 합을 구한 후
        for (int i=0 ; i<numbers.length ; i++){
            answer += numbers[i];
        }
        //배열의 합을 개수로 나눔
        answer /= numbers.length;
        return answer;
    }
}