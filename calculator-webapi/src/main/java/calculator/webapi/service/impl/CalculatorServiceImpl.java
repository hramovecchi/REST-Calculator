package calculator.webapi.service.impl;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import calculator.webapi.service.CalculatorService;
import calculator.webapi.service.dto.ResultDTO;

@Component
public class CalculatorServiceImpl implements CalculatorService {
	
	private final static Logger logger = LoggerFactory.getLogger(CalculatorServiceImpl.class);
	
	@Override
	@Cacheable(value="calculatorCache", key = "#root.methodName + #operand1 + '-' + #operand2 + '-' + #operand3")
	public ResultDTO add(String operand1, String operand2, String operand3) throws NumberFormatException{
		
		logger.info("Calculator Service operation: add");
		
		operand3 = StringUtils.isNotBlank(operand3) ? operand3 : "0";
	
		double result = Double.valueOf(operand1).doubleValue() + Double.valueOf(operand2).doubleValue() 
					+ Double.valueOf(operand3).doubleValue();
		
		return new ResultDTO(String.valueOf(result));
	}
	
	@Override
	@Cacheable(value="calculatorCache", key = "#root.methodName + #operand1 + '-' + #operand2 + '-' + #operand3")
	public ResultDTO substract(String operand1, String operand2, String operand3) throws NumberFormatException{
		
		logger.info("Calculator Service operation: substract");
		
		operand3 = StringUtils.isNotBlank(operand3) ? operand3 : "0";
		
		double result = Double.valueOf(operand1).doubleValue() - Double.valueOf(operand2).doubleValue() 
					- Double.valueOf(operand3).doubleValue();
		
		return new ResultDTO(String.valueOf(result));
	}
	
	@Override
	@Cacheable(value="calculatorCache", key = "#root.methodName + #operand1 + '-' + #operand2 + '-' + #operand3")
	public ResultDTO multiply(String operand1, String operand2, String operand3) throws NumberFormatException{
		
		logger.info("Calculator Service operation: multiply");
		
		operand3 = StringUtils.isNotBlank(operand3) ? operand3 : "1";
		
		double result = Double.valueOf(operand1).doubleValue() * Double.valueOf(operand2).doubleValue() 
					* Double.valueOf(operand3).doubleValue();
		
		return new ResultDTO(String.valueOf(result));
	}
	
	@Override
	@Cacheable(value="calculatorCache", key = "#root.methodName + #operand1 + '-' + #operand2")
	public ResultDTO divide(String operand1, String operand2) throws NumberFormatException{
		
		logger.info("Calculator Service operation: divide");
		
		double result = Double.valueOf(operand1).doubleValue() / Double.valueOf(operand2).doubleValue();

		return new ResultDTO(String.valueOf(result));
	}
}
