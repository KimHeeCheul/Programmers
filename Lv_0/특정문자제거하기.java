class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter,"");	//replace를 사용하여 letter에 오는 값을 제거한다
        
        return answer;
    }
}