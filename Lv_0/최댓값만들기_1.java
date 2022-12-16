class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
      // || 과 && 헷갈리지 말것
        for(int i=0 ; i<numbers.length ; i++){		//첫번째 값에 대한 반복문을 돌리고
            for(int j=0 ; j<numbers.length ; j++){	//두번째 값에 대한 반복문을 돌리고
                if(i != j && numbers[i] * numbers[j] > answer){	// 또한 i값 과 j값이 같지 않을 경우	
                    answer = numbers[i] * numbers[j];	//값은 answer이다
                }
            }
        }
        
        return answer;
    }
}