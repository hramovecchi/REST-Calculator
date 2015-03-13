package calculator.webapi.util;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import calculator.webapi.error.ErrorCode;
import calculator.webapi.error.ErrorDTO;

public final class ResponseFactory {
	
	/**
	 * Returns a {@link Status#BAD_REQUEST} response with a specific
	 * message for the {@link ErrorDTO} entity.
	 * 
	 * @param errorCode
	 *            the errorCode to set in the response entity
	 * @return {@link Status#BAD_REQUEST} response
	 */
	public static Response badRequest(ErrorCode errorCode) {
		return Response.status(Status.BAD_REQUEST)
				.entity(new ErrorDTO(ErrorCode.NUMBERFORMATEXCEPTION))
				.type(MediaType.APPLICATION_JSON).build();
	}
}
