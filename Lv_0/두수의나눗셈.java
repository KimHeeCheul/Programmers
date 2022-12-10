class Solution {
	/*
	 * 입출력 예 #1
	 * num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
	 * 입출력 예 #2
	 * num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면
	 *  2333.3333... 이 되며, 정수 부분은 2333입니다. 
	 * 입출력 예 #3
	 *  num1이 1, num2가 16이므로 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며,
	 * 정수 부분은 62입니다.
	 */
    public int solution(int num1, int num2) {
    	//소수점이 나오기 때문에 double를 반드시 표기해줘야 한다
    	double result = (double)num1/num2*1000;
        //또한 return 할 때는 num가 int 이기에 int를 넣어줘야한다
        return (int)result;
    }
}