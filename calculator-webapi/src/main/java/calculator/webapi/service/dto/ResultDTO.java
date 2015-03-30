package calculator.webapi.service.dto;

import java.io.Serializable;

/**
 * Result of the calculator operation.
 * 
 * @author hramovecchi@gmail.com
 *
 */
public class ResultDTO implements Serializable{
	
	private static final long serialVersionUID = -1751462145734181105L;
	private String result;
	
	public ResultDTO(String result){
		this.setResult(result);
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}