/*
Vamos a crearnos un Servicio para exponer Mascotas
ApiMascotas
Tendremos una clase llamada Mascota (id, nombre, tipoanimal)
Queremos un Servicio que mostrará múltiples mascotas y también nos permitirá buscar mascota por ID.
 */
package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mascota {

    public int idmascota;
    public String nombre;
    public String tipoanimal;

    public Mascota(int idmascota, String nombre, String tipoanimal) {
        this.idmascota = idmascota;
        this.nombre = nombre;
        this.tipoanimal = tipoanimal;
    }

    public Mascota() {
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoanimal() {
        return tipoanimal;
    }

    public void setTipoanimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

}
