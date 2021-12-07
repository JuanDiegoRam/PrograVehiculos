package proyectotiendavehiculos;

import javax.swing.JOptionPane;

public class Inventario {

    public static String mostrarVehiculos(int[] codigo, String[] nombre, int[] precio,int cantidad) {
        String auto = "";
        for (int i = 0; i < cantidad; i++) {
            auto += codigo[i]+" "+nombre[i]+" "+precio[i]+"\n";
            
        }
        
        return auto;
    }
}
