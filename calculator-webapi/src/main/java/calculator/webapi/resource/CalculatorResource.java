package calculator.webapi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import calculator.webapi.error.ErrorCode;
import calculator.webapi.service.CalculatorService;
import calculator.webapi.service.dto.ResultDTO;
import calculator.webapi.util.ResponseFactory;

/**
 * Resource to expose the calculator api.
 * 
 * @author hramovecchi@gmail.com
 */
@Component
@Path("/calculator")
public class CalculatorResource {

	private final static Logger logger = LoggerFactory.getLogger(CalculatorResource.class);
	
	@Autowired
	private CalculatorService calculator;
	
	@GET
	@Path("/add/{op1}/{op2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateAdd(@PathParam("op1") String op1,
			@PathParam("op2") String op2) {
		
		return calculateAdd(op1, op2, "");
	}
	
	@GET
	@Path("/add/{op1}/{op2}/{op3}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateAdd(@PathParam("op1") String op1,
			@PathParam("op2") String op2, @PathParam("op3") String op3) {
		
		logger.info("Invoked Resource GET /add");
		
		try {
			ResultDTO result = calculator.add(op1, op2, op3);
			return Response.ok(result).build();

		} catch (NumberFormatException e) {
			logger.error("Number Format Exception on Resource GET /add  - {}",e.getMessage());
			return ResponseFactory.badRequest(ErrorCode.NUMBERFORMATEXCEPTION);
		}
	}
	
	@GET
	@Path("/subtract/{op1}/{op2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateSubtract(@PathParam("op1") String op1,
			@PathParam("op2") String op2){
		
		return calculateSubtract(op1, op2, "");
	}
	
	@GET
	@Path("/subtract/{op1}/{op2}/{op3}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateSubtract(@PathParam("op1") String op1,
			@PathParam("op2") String op2, @PathParam("op3") String op3){
		
		logger.info("Invoked Resource GET /subtract");
		
		try {
			ResultDTO result = calculator.subtract(op1, op2, op3);
			return Response.ok(result).build();

		} catch (NumberFormatException e) {
			logger.error("Number Format Exception on Resource GET /subtract  - {}",e.getMessage());
			return ResponseFactory.badRequest(ErrorCode.NUMBERFORMATEXCEPTION);
		}
	}
	
	@GET
	@Path("/multiply/{op1}/{op2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateMultiply(@PathParam("op1") String op1,
			@PathParam("op2") String op2){
		
		return calculateMultiply(op1, op2, "");
	}
	
	@GET
	@Path("/multiply/{op1}/{op2}/{op3}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateMultiply(@PathParam("op1") String op1,
			@PathParam("op2") String op2, @PathParam("op3") String op3){
		
		logger.info("Invoked Resource GET /multiply");
		
		try {
			ResultDTO result = calculator.multiply(op1, op2, op3);
			return Response.ok(result).build();

		} catch (NumberFormatException e) {
			logger.error("Number Format Exception on Resource GET /multiply  - {}",e.getMessage());
			return ResponseFactory.badRequest(ErrorCode.NUMBERFORMATEXCEPTION);
		}
	}
	
	@GET
	@Path("/divide/{op1}/{op2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculateDivide(@PathParam("op1") String op1,
			@PathParam("op2") String op2){
		
		logger.info("Invoked Resource GET /divide");
		
		try {
			ResultDTO result = calculator.divide(op1, op2);
			return Response.ok(result).build();

		} catch (NumberFormatException e) {
			logger.error("Number Format Exception on Resource GET /divide  - {}",e.getMessage());
			return ResponseFactory.badRequest(ErrorCode.NUMBERFORMATEXCEPTION);
		}
	}
}
