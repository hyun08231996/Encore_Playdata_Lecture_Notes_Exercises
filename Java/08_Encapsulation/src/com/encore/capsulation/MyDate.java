package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. 다른 클래스에서 직접적으로 접근할 수 없도록
 *    필드앞에 ---> private 지정한다.
 * 2. 클래스의 필드에 접근은 setter()/getter()로 한다.
 *    그리고 얘네들이 다른 클래스에서도 서로 접근할 수 있도록 public
 *    public void setXxx(o)
 *    public int getXxx(x)
 * 3. 
 *    setXxx(){
 *      //첫라인에서(필드 초기화 되기 직전!!!)에 타당한 값만 받을 수 있도록 로직을 제어한다
 *      
 *    setDay()
 *    ::
 *    1,3,5,7,8,10,12월 ---> 1 <= day <=31
 *    2월 ---> 1<=day <=28
 *    4,6,9,11월 ----> 1 <= day <=30
 *    switch, if
 *    
 *    ::
 *    0월 22일 입니다
 *    2월 0일 입니다. ---> 이렇게 나오면 안된다.
 *    
 */
public class MyDate {
	//private 지정하면 같은 클래스에서만 접근을 허용한다.
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		//제어문 1~12월에 해당하는 값만 처리...나머지 메세지...
		if(month>=1 && month<=12) {
			this.month = month;
		}
		else {//1~12사이의 값이 아닌 경우는...
			System.out.println("월을 잘못 입력하셨습니다");
			//프로그램을 바로 빠져나온다.
			System.exit(0);
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//1,3,5,7,8,10,12월 ---> 1 <= day <=31
		//2월 ---> 1<=day <=28
	    //4,6,9,11월 ----> 1 <= day <=30
		//월에 따라서 day가 달라진다...
		switch(month) {
			case 2:
				if(day>=1 && day<=28) {	
					this.day = day;}
				else{
					System.out.println("일을 잘못 입력하셨습니다");
					System.exit(0);}
			break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>=1 && day<=30) {
				this.day = day;}
				else{
					System.out.println("일를 잘못 입력하셨습니다");
					System.exit(0);;
				}
			break;
			
			default:
				if(day>=1 && day<=31) {
					this.day = day;
				}
				else{
					System.out.println("일를 잘못 입력하셨습니다");
					System.exit(0);;
				}
		}
		
	}
	
}
