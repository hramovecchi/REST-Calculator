package calculator.webapi.error;

public enum ErrorCode {
	
	NUMBERFORMATEXCEPTION(100, "Invalid parameters");
	
	private long errorCode;
	private String errorDescription;

	ErrorCode(long errorCode, String errorDescription) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public long getErrorCode() {
		return this.errorCode;
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	public ErrorCode getByErrorCode(long errorCode) {
		for (ErrorCode error : ErrorCode.values()) {
			if (error.errorCode == errorCode) {
				return error;
			}
		}
		return null;
	}
}
