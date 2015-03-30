package calculator.webapi.error;

/**
 * Simple DTO for error responses.
 * 
 * @author hramovecchi@gmail.com
 *
 */
public class ErrorDTO {
	private long errorCode;
	private String errorDescription;

	public ErrorDTO(ErrorCode code) {
		this.errorCode = code.getErrorCode();
		this.errorDescription = code.getErrorDescription();
	}

	public long getErrorCode() {
		return errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}
}
