/*
Vamos a crearnos un Servicio para exponer Mascotas
ApiMascotas
Tendremos una clase llamada Mascota (id, nombre, tipoanimal)
Queremos un Servicio que mostrará múltiples mascotas y también nos permitirá buscar mascota por ID.
 */
package services;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Mascota;
import repositories.RepositoryMascotas;

@Path("/mascotas")
public class ServiceMascotas {

    RepositoryMascotas repo;

    public ServiceMascotas() {
        this.repo = new RepositoryMascotas();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Mascota> getMascotas() {
        return this.repo.getMascotas();
    }

    /*@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Mascota getMascota(@PathParam("id") String id) {
        int idmascota = Integer.parseInt(id);
        return this.repo.buscarMascota(idmascota);
    }*/
}
