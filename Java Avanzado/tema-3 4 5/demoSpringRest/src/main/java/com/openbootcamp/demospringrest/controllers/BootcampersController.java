package com.openbootcamp.demospringrest.controllers;

import com.openbootcamp.demospringrest.models.Bootcamper;
import com.openbootcamp.demospringrest.services.BootcamperService;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@RestController
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno", Math.random()));
        this.bootcamperService.add(new Bootcamper("dos", Math.random()));
        this.bootcamperService.add(new Bootcamper("tres", Math.random()));
        this.bootcamperService.add(new Bootcamper("cuatro", Math.random()));
        this.bootcamperService.add(new Bootcamper("cinco", Math.random()));

    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }

    @DELETE
    @Path("/bootcampers/{nombre}")
    public Response borrarUno(@PathParam("nombre") String nombre) {
        bootcamperService.delete(nombre);
        return Response.status(202).build();
    }

    @PUT
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response actualizarUno(@PathParam("nombre") String nombre, Bootcamper newBootcamper) {
        bootcamperService.update(nombre, newBootcamper);
        return Response.status(200).build();
    }
}
