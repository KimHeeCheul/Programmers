class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ar = my_string.toCharArray();	//문자열을 char 배열로 변환
        char[] reverse = new char[ar.length];	//반대로 만들어질 새로운 배열 생성
        for(int i=0; i<ar.length;i++) {			//변환한 char에 대한 반복문 실행
        	reverse[i] = ar[ar.length-1-i];		//반대로 만들어질 배열에 만들어진 문자열을 반대로 배치한다
        }
        answer = new String(reverse);			//새로 만들어진 문자열을 answer에 대입한다
        return answer;
    }
}