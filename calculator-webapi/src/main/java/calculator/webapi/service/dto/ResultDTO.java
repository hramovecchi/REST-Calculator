package calculator.webapi.service.dto;

public class ResultDTO{
	
	public ResultDTO(){
	}
	
	public ResultDTO(String result){
		this.setResult(result);
	}
	
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}