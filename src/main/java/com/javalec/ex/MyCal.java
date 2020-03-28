package com.javalec.ex;

public class MyCal {
	private Cal calculator;
	private int firstNum;
	private int secondNum;

	public Cal getCalculator() {
		return calculator;
	}

	public void setCalculator(Cal calculator) {
		this.calculator = calculator;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add1() {
		calculator.add(firstNum, secondNum);
		
	}
	public void sub1() {
		calculator.sub(firstNum, secondNum);
		
	}
	public void mul1() {
		calculator.mul(firstNum, secondNum);
		
	}
	public void div1() {
		calculator.div(firstNum, secondNum);
		
	}
	

}
