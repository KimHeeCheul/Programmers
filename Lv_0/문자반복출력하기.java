class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] ar = my_string.toCharArray();//담을 배열 생성
        
        for(int i=0 ; i<ar.length ; i++){	//담을 객체의 길이보다 작은 값인 i에
            for(int j=0 ; j<n ; j++){		//문자를 n번 만큼 돌린 후
                answer += ar[i];			//answer에 ar에 담은 값들을 추가한다
            }
        }
        return answer;
    }
}