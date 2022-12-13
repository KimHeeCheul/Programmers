class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];  //배열 생성
        int odd = 0;    //홀수 값 선언 및 초기화
        int even = 0;   //짝수 값 선언 및 초기화
        
        for(int i=0 ; i<num_list.length ; i++){ //num_list 반복문
            if(num_list[i]%2==0){   //만약 num_list 나누기 2의 나머지 값이 0일떄
                even++;             //짝수값을 더하고
            }else{                  //아니면
                odd++;              //홀수값을 더한다
            }
        }
        answer[0] = even;           //결과 배열의 i값에 몫이 0일때는 짝수값이고
        answer[1] = odd;            //몫이 1일 경우 홀수값이다
        
        return answer;
    }
}