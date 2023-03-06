package com.example;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;;
import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;

@Path("")
public class GreetingResource {
    public static final Logger LOGGER = Logger.getLogger(GreetingResource.class.getName());

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String upload(@RestForm("file")
    @PartType("text/csv") InputStream part,  @RestForm("test") String test, @RestForm("checked") boolean checked, @RestForm("choice") Choice choice) throws IOException {
        LOGGER.log(Level.INFO, "test: {0}", test);
        return test;
    }
}