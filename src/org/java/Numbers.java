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
			System.out.print("Questo è l'ultimo elemento. Il prossimo sarà di nuovo il primo: ");
			currentNumber = this.numbers[this.index];
			this.index = 0;
		} else {
			currentNumber = this.numbers[this.index];
			this.index++;
		} 
		return currentNumber;
	}
	
	public boolean hasAncoraElementi(){
		return !(this.index != this.numbers.length - 1);
		}
	
	@Override
	public String toString() {
		return "Numeri: " + Arrays.toString(getNumbers());
	}
}
