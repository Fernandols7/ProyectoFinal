
package Modelo;

/**
 *
 * @author Fernando Lopez
 */
public class Proveedor {
    private int id;
    private String rtn;
    private String nombre;
    private String telefono;
    private String direccion;

    public Proveedor() {
    }

    public Proveedor(int id, String rtn, String nombre, String telefono, String direccion) {
        this.id = id;
        this.rtn = rtn;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    
}
