package com.phoenix.calci;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorVerifyTest {
	
	@Mock
	Calculator calculator;
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	public void addTest() {
		
		int result = calculator.add(10, 20);
		//result = calculator.add(30, 40);
		result = calculator.add(10, 20);
		
		Mockito.verify(calculator).add(10, 20);
		//Mockito.verify(calculator).add(30, 40);
		Mockito.verify(calculator).add(10, 20);
		//Mockito.verify(calculator).add(100,200);
		//Mockito.verify(calculator,Mockito.times(2)).add(10, 20);
		Mockito.verify(calculator,Mockito.atLeast(1)).add(10, 20);
		
	}

}
