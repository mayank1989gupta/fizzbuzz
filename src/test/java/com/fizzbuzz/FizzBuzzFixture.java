package com.fizzbuzz;

import static com.fizzbuzz.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.Test;

import com.fizzbuzz.FizzBuzz;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing
 * stories. You will notice the TimeConverter has no implementation ... (hint)
 */
public class FizzBuzzFixture {

	int limit = 6;
	FizzBuzz fizzBuzz=new FizzBuzz();

	@Test
	public void fizzBuzzAcceptanceTests() throws Exception {
		aBehaviouralTestRunner().usingStepsFrom(this).withStory("fizz-buzz.story").run();
	}

	@When("limit is $limit")
	public void whenLimitIs(int limit) {
		this.limit=limit;
	}

	@Then("FizzBuzz pattern is $pattern")
	public void thenFizzBuzzPatternIs(String expectedPattern) {
		String result=fizzBuzz.findFizzBuzzPattern(limit);
		Assert.assertEquals(expectedPattern, result);
	}

}
