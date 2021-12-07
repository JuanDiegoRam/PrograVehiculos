package proyectotiendavehiculos;
import java.lang.Math;

import javax.swing.JOptionPane;

public class VentaCliente {

    public static String Cliente() {

        Clientes cliente = new Clientes();

        cliente.setNombre(JOptionPane.showInputDialog("Digite el Nombre del Cliente"));
        cliente.setApellido1(JOptionPane.showInputDialog("Digite el Primer Apellido del Cliente"));
        cliente.setApellido2(JOptionPane.showInputDialog("Digite el Segundo Apellido del Cliente"));
        cliente.setEmail(JOptionPane.showInputDialog("Digite el E-Mail del Cliente"));
        cliente.setDireccion(JOptionPane.showInputDialog("Digite la Dirección del Cliente"));
        cliente.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Digite el Número del Cliente")));
        
        int codigo = (int) Math.random();
        Facturas factura = new Facturas(codigo, cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(), cliente.getEmail(), cliente.getDireccion(), cliente.getTelefono());

        String infoCliente = "Código Factura: "+factura.codigo+"\nNombre del Cliente: " + factura.nombre+" "+factura.Apellido1+" "+factura.Apellido2
        +"\nCorreo Electrónico: "+ factura.Email+"\nDirección: "+factura.Direccion + "\nTeléfono: "+factura.telefono+"\n\n";
        /*JOptionPane.showMessageDialog(null, "Factura\n"+"Código Factura: "+factura.codigo+"\nNombre del Cliente: " + factura.nombre+" "+factura.Apellido1+" "+factura.Apellido2
        +"\nCorreo Electrónico: "+ factura.Email+"\nDirección: "+factura.Direccion + "\nTeléfono: "+factura.telefono+"\n\n");
        
        System.out.println("Factura\n"+"Código Factura: "+factura.codigo+"\nNombre del Cliente: " + factura.nombre+" "+factura.Apellido1+" "+factura.Apellido2
        +"\nCorreo Electrónico: "+ factura.Email+"\nDirección: "+factura.Direccion + "\nTeléfono: "+factura.telefono);*/
        
        return infoCliente;
    }
}
