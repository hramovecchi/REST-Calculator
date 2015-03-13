package calculator.webapi.service;

import calculator.webapi.service.dto.ResultDTO;

public interface CalculatorService {	

	ResultDTO add(String operand1, String operand2, String operand3);

	ResultDTO substract(String operand1, String operand2, String operand3);

	ResultDTO multiply(String operand1, String operand2, String operand3);

	ResultDTO divide(String operand1, String operand2);

}
