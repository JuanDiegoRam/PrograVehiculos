package proyectotiendavehiculos;

import javax.swing.JOptionPane;

public class Carrito {

    public static Double mostrarCarrito(int[] codigo, String[] nombre, int[] precio, int[] codigoAutoLinea, int[] cantidadLinea, int[] subt, int cantidadLineas) {
        int i = 0, suma = 0;
        double total = 0;
        while (i < cantidadLineas) {
            int h = buscarAuto(codigoAutoLinea[i], codigo);
            JOptionPane.showMessageDialog(null, "                  Carrito\n\n" + "Código: " + codigo[i] + "\nModelo: " + nombre[h] + "\nPrecio: $" + precio[h] + "\nCantidad: " + cantidadLinea[i] + "\nSubtotal: $" + subt[i]);
            
            suma += subt[i];
            i++;
        }
        total = suma + (suma * 0.13);
        return total;
    }

    public static int buscarAuto(int codBuscar, int[] auto) {
        int posicion = -1;
        for (int i = 0; i < 3; i++) {
            if (codBuscar == auto[i]) {
                posicion = 1;
            }
        }
        return posicion;
    }
}
