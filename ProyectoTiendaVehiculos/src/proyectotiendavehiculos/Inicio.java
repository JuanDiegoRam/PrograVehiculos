package proyectotiendavehiculos;

import javax.swing.JOptionPane;

public class Inicio {

    Vehiculos auto = new Vehiculos();

    public static void main(String[] args) {
        Menu();

    }

    public static void Menu() {
        String[] opciones = {"Vender", "Inventario", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una Opción", "Menú", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "");

        do {
            switch (opcion) {
                case 0:
                    Venta();
                    opcion = 5;
                    Menu();
                    break;

                case 1:
                    Inventario();
                    opcion = 5;
                    Menu();
                    break;

                case 2:
                    Salir();
                    opcion = 5;
                    break;

            }
        } while (opcion != 5);

    }

    public static void Venta() {
        Vehiculos auto = new Vehiculos();
        if (auto.cantLineas < 3) {
            auto.cantLineas = Venta.AgregarCarrito(auto.codProds, auto.nombres, auto.precios, auto.codProdCarrito, auto.cantCarrito, auto.subtCarrito, auto.cantLineas);
        } else {
            JOptionPane.showMessageDialog(null, "Carrito Lleno");
        }

        double sumaTotal = Carrito.mostrarCarrito(auto.codProds, auto.nombres, auto.precios, auto.codProdCarrito, auto.cantCarrito, auto.subtCarrito, auto.cantLineas);

        String[] elecciones = {"Sí", "No"};
        int eleccion = JOptionPane.showOptionDialog(null, "¿Desea Comprar?", "Menú", 0, JOptionPane.QUESTION_MESSAGE, null, elecciones, "");

        if (eleccion == 0) {
            String infoCliente = VentaCliente.Cliente();
            JOptionPane.showMessageDialog(null, "                  Factura\n\n"+infoCliente+"\n Total: $"+sumaTotal);
            
            JOptionPane.showMessageDialog(null, "Compra Realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Compra Cancelada");
        }
    }

    public static void Inventario() {
        Vehiculos auto = new Vehiculos();
        String autoCompra = Inventario.mostrarVehiculos(auto.codProds, auto.nombres, auto.precios, auto.cantidad);
        JOptionPane.showMessageDialog(null, "                  Inventario\n\n" + autoCompra);
    }

    public static void Salir() {
        JOptionPane.showMessageDialog(null, "Gracias por su Visita");
    }
}
