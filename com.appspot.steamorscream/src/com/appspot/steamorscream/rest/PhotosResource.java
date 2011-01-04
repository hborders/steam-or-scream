package com.appspot.steamorscream.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/photos")
public class PhotosResource {
	@Path("/random")
	@Consumes(value = { MediaType.WILDCARD })
	public Response random() {
		// return Response.temporaryRedirect(location);
		return null;
	}

}
