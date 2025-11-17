package vista;

import modelo.Producto;
import java.util.List;
import java.util.Scanner;

public class InventarioVista {

    private Scanner sc;

    public InventarioVista() {
        sc = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n===== MENÚ INVENTARIO =====");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto por SKU");
        System.out.println("3. Mostrar todos los productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }

    public Producto pedirDatosUsuario() {
        sc.nextLine(); 
        System.out.print("Ingrese nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese SKU del producto: ");
        String sku = sc.nextLine();

        System.out.print("Ingrese cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese precio: ");
        double precio = sc.nextDouble();

        return new Producto(nombre, sku, cantidad, precio);
    }

    public String pedirSku() {
        sc.nextLine(); 
        System.out.print("Ingrese SKU: ");
        return sc.nextLine();
    }

    public void mostrarProducto(Producto p) {
        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p.toString());
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

