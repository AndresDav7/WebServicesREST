package com.restful.services;

import com.restful.session.UcmFacade;
import com.restful.entidades.Ucm;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("Ucm")
public class UcmRest {
        
    @EJB
    private UcmFacade UcmFacade;
    
    //Traer todos los Datos de la BDD
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Ucm>findAll(){
        return UcmFacade.findAll();
    }  
    
    //Traer un ID especifico
   @GET
   @Produces({MediaType.APPLICATION_JSON})
   @Path("{id}")   
   public Ucm findByID(@PathParam("id")Integer id){
       return UcmFacade.find(id);    
   }
   
   //Insertar 
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response create(Ucm Ucm) {
        UcmFacade.create(Ucm);   
        String message = "Insertado Correctamente !!";
        return Response.ok(message).build();
        
    }
    
    //Eliminar
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response remove(@PathParam("id") Integer id) {
        UcmFacade.remove(UcmFacade.find(id));
        String message = "Eliminado Correctamente !!";
        return Response.ok(message).build();
    }
    
    //ACTUALIZAR
    @PUT
    @Consumes ({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response edit(@PathParam("id")Integer id, Ucm Ucm) {
        if (UcmFacade.find(id) != null) {
            Ucm.setId(id);
            UcmFacade.edit(Ucm); 
        }
        String message = "Actualizado Correctamente !!";
        return Response.ok(message).build();
    }
    
   
}
