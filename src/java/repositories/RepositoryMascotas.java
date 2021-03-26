/*
Vamos a crearnos un Servicio para exponer Mascotas
ApiMascotas
Tendremos una clase llamada Mascota (id, nombre, tipoanimal)
Queremos un Servicio que mostrará múltiples mascotas y también nos permitirá buscar mascota por ID.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import models.Mascota;

public class RepositoryMascotas {

    public List<Mascota> mascotas;

    public RepositoryMascotas() {
        this.mascotas = new ArrayList<>();
        Mascota m = new Mascota(1, "firulais", "perro");
        this.mascotas.add(m);
        m = new Mascota(2, "felix", "gato");
        this.mascotas.add(m);
        m = new Mascota(3, "pajaro loco", "pajaro carpintero");
        this.mascotas.add(m);
        m = new Mascota(4, "bugs bunny", "conejo");
        this.mascotas.add(m);
        m = new Mascota(5, "lucas", "pato");
        this.mascotas.add(m);
    }

    public List<Mascota> getMascotas() {
        return this.mascotas;
    }

    public Mascota buscarMascota(int idmascota) {
        for (Mascota m : this.mascotas) {
            if (m.getIdmascota() == idmascota) {
                return m;
            }
        }
        return null;
    }
}
