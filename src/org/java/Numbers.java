package org.java;

import java.util.Arrays;

public class Numbers {
	private int[] numbers;
	private int index = 0;

	public Numbers(int[] numbers) {
		setNumbers(numbers);
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getElementoSuccessivo() {
		int currentNumber = 0;
		if (this.index == this.numbers.length - 1) {
			currentNumber = this.numbers[this.index];
			this.index = 0;
		} else {
			currentNumber = this.numbers[this.index];
			this.index++;
		} 
		return currentNumber;
	}
	
	@Override
	public String toString() {
		return "Numeri: " + Arrays.toString(getNumbers());
	}
}
