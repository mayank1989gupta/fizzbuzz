/**
 * 
 */
package com.fizzbuzz;

import com.fizzbuzz.constants.Constants;

/**
 * @author Mayank
 *
 */
public class FizzBuzz {
	

	/**
	 * Method to create the Fizz Buzz pattern for the given number.</br>
	 * Return the final String with the Fizz Buzz pattern.</br>
	 * 
	 * @param limit
	 * @return
	 */
	public String findFizzBuzzPattern(int limit) {
		StringBuilder result = new StringBuilder();
		if(limit > 0) {
			for(int i = 1; i <= limit; i++) {
				if(i > 1) {
					result
					.append(Constants.DELIMETER_COMMA)
					.append(Constants.BLANK_SPACE);
				}
				result.append(getString(i));//Appending the outcome.
			}
		}

		return result.toString();//Final result
	}

	/**
	 * Method to check and return the String to be appended to 
	 * create the final String.</br>
	 * The pattern comprises of the below:</br>
	 * 1. Number divisible by 3 represents Fizz.</br>
	 * 2. Number divisible by 5 represents Buzz.</br>
	 * 3. Number divisible by 15 represents Fizz Buzz.</br>
	 * 
	 *  Basis on the given number the outcome is decided and returned.</br>
	 * 
	 * @param number
	 * @return
	 */
	private static String getString(int number) {
		String data = null;
		if(number % 15 == 0) {
			data = Constants.FIZZ_BUZZ;//Fizz Buzz
		} else if(number % 3 == 0) {
			data = Constants.FIZZ;//Fizz
		} else if(number % 5 == 0) {
			data = Constants.BUZZ;//Buzz
		} else {
			data = String.valueOf(number);//number
		}
		return data;//outcome
	}

}
