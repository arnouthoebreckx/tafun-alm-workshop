package be.ae.staticresources;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/environment")
public class EnvironmentResource {

    @ConfigProperty(name = "deploy.environment")
    String deployEnvironment;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String theanswertoeverything() {
        return deployEnvironment;
    }
}
