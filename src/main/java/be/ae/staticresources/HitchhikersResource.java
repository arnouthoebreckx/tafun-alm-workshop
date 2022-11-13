package be.ae.staticresources;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/theanswertoeverything")
public class HitchhikersResource {

    @ConfigProperty(name = "supercomputer.answer")
    String theanswertoeverything;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String theanswertoeverything() {
        return theanswertoeverything;
    }
}