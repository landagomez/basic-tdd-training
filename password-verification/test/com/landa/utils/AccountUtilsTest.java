package com.landa.utils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AccountUtilsTest {

	@Test
	void passwordLengthGreaterThan4() {
		Assert.assertTrue(AccountUtils.strengthCheck("1QazxsW2.*"));
	}
	
	@Test
	void passwordContainsOneCapitalLetter() {
		Assert.assertTrue(AccountUtils.strengthCheck("1QazxsW2.*"));
	}
	
	@Test
	void passwordContains3ConsecutiveNumbersInLine() {
		Assert.assertTrue(AccountUtils.strengthCheck("A1231QazxsW2.*"));
	}
	
	@Test
	void passwordContains3ConsecutiveLowercaseLettersInLine() {
		Assert.assertTrue(AccountUtils.strengthCheck("Aabc1QazxsW2.*"));
	}

}
