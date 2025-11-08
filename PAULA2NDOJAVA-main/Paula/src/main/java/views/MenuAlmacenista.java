package views;

import java.util.Scanner;
import controllers.InventarioController;
import models.Usuario;

public class MenuAlmacenista {
    private final Scanner scanner = new Scanner(System.in);
    private final InventarioController inventarioController = new InventarioController();
    
    public void mostrarMenu(Usuario almacenista) {
        int opcion;
        do {
            System.out.println("=== Menú Almacenista ===");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> inventarioController.agregarProducto();
                case 2 -> inventarioController.eliminarProducto();
                case 3 -> inventarioController.listarProductos();
                
                case 4 -> System.out.println("Saliendo del menú Almacenista...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
            System.out.println("Regresando a la pantalla de inicio de sesión.");
            new MenuLogin().mostrarLogin();
    }
}
