package proyectotiendavehiculos;

public class Facturas {

    int codigo;
    String nombre;
    String Apellido1;
    String Apellido2;
    String Email;
    String Direccion;
    int telefono;

    public Facturas(int codigo, String nombre, String Apellido1, String Apellido2, String Email, String Direccion, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Email = Email;
        this.Direccion = Direccion;
        this.telefono = telefono;
    }
}
