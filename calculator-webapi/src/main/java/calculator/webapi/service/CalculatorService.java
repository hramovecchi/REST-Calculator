package calculator.webapi.service;

import calculator.webapi.service.dto.ResultDTO;

/**
 * Calculator Service, the calculator to execute mathematical operations.
 * 
 * @author hramovecchi@gmail.com
 * 
 */

public interface CalculatorService {	

	/**
	 * Add operation up to three operands
	 * 
	 * @param operand1
	 * @param operand2
	 * @param operand3
	 * @return a {@link ResultDTO}} with the result value.
	 */
	ResultDTO add(String operand1, String operand2, String operand3);

	/**
	 * Subtract operation up to three operands
	 * 
	 * @param operand1
	 * @param operand2
	 * @param operand3
	 * @return a {@link ResultDTO}} with the result value.
	 */
	ResultDTO subtract(String operand1, String operand2, String operand3);

	/**
	 * Multiply operation up to three operands
	 * 
	 * @param operand1
	 * @param operand2
	 * @param operand3
	 * @return a {@link ResultDTO}} with the result value.
	 */
	ResultDTO multiply(String operand1, String operand2, String operand3);

	/**
	 * Divide operation up to two operands
	 * 
	 * @param operand1
	 * @param operand2
	 * @return a {@link ResultDTO}} with the result value.
	 */
	ResultDTO divide(String operand1, String operand2);

}
