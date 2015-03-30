package calculator.webapi.service.impl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import calculator.webapi.service.CalculatorService;
import calculator.webapi.service.dto.ResultDTO;

public class CalculatorServiceImplTest {
	
	private final static String ZERO = "0";
	
	private CalculatorService calculator;
	private String operand1;
	private String operand2;
	private String operand3;
	
	@Before
	public void prepareObjects(){
		calculator = new CalculatorServiceImpl();
		operand1 = "10";
		operand2 = "9";
		operand3 = "8";
	}
	
	@Test
	public void testDivitionByZero(){
		ResultDTO result = calculator.divide(operand1, ZERO);
		Assert.assertEquals(result.getResult(), "Infinity");
	}
	
	@Test
	public void testAddOperation(){
		ResultDTO result = calculator.add(operand1, operand2, operand3);

		double doubleResult = Double.valueOf(operand1);
		doubleResult += Double.valueOf(operand2);
		doubleResult += Double.valueOf(operand3);
		
		Assert.assertEquals(doubleResult, Double.valueOf(result.getResult()));
	}
	
	@Test
	public void testSubstractOperation(){
		ResultDTO result = calculator.subtract(operand1, operand2, operand3);

		double doubleResult = Double.valueOf(operand1);
		doubleResult -= Double.valueOf(operand2);
		doubleResult -= Double.valueOf(operand3);
		
		Assert.assertEquals(doubleResult, Double.valueOf(result.getResult()));
	}
	
	@Test
	public void testMultiplyOperation(){
		ResultDTO result = calculator.multiply(operand1, operand2, operand3);

		double doubleResult = Double.valueOf(operand1);
		doubleResult *= Double.valueOf(operand2);
		doubleResult *= Double.valueOf(operand3);
		
		Assert.assertEquals(doubleResult, Double.valueOf(result.getResult()));
	}
	
	@Test
	public void testDivideOperation(){
		ResultDTO result = calculator.divide(operand1, operand2);

		double doubleResult = Double.valueOf(operand1);
		doubleResult /= Double.valueOf(operand2);
		
		Assert.assertEquals(doubleResult, Double.valueOf(result.getResult()));
	}

}
