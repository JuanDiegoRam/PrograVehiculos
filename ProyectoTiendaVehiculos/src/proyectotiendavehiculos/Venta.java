package proyectotiendavehiculos;

import javax.swing.JOptionPane;

public class Venta {

    public static int AgregarCarrito(int[] codigo, String[] nombre, int[] precio, int[] codigoAutoLinea, int[] cantidadLinea, int[] subt, int cantidadLineas) {
        Vehiculos auto = new Vehiculos();
        String autoCompra = Inventario.mostrarVehiculos(auto.codProds, auto.nombres, auto.precios, auto.cantidad);
        int ingreso = Integer.parseInt(JOptionPane.showInputDialog( "                       Catálogo\n\n"+autoCompra + "\nIngrese el Auto Deseado"));

        int posicion = Carrito.buscarAuto(ingreso, codigo);
        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "El Auto No Existe");
            return cantidadLineas;
        }
        int iCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad Deseada"));

        codigoAutoLinea[cantidadLineas] = ingreso;
        cantidadLinea[cantidadLineas] = iCantidad;
        subt[cantidadLineas] = precio[posicion] * iCantidad;

        return (cantidadLineas + 1);
    }
}
