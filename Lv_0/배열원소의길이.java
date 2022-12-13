class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];	//배열 생성
        for(int i=0 ; i<strlist.length ; i++){	//배열 반복문 실행
            answer[i] = strlist[i].length();	//배열의 문자열 길이를 알기 위해서 ()사용
        }
        return answer;
    }
}