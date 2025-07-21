package agendaTelefonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda (); // Tamaño de agenda

    while (true) {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Listar Contactos");
        System.out.println("3. Buscar Contacto");
        System.out.println("4. Eliminar Contacto");
        System.out.println("5. Modificar Teléfono");
        System.out.println("6. Verificar Espacio Libre");
        System.out.println("7. Salir");
        System.out.println("Selecciona una opción");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        switch (opcion) {
            case 1:
                System.out.println("Introce el nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Introduce el apellido: ");
                String apellido = scanner.nextLine();
                System.out.println("Introduce el teléfono: ");
                String telefono = scanner.nextLine();

                if (!nombre.isEmpty() && !apellido.isEmpty()) {
                    agenda.añadirContacto(new Contacto(nombre, apellido, telefono));
                } else {
                    System.out.println("El nombre y el apellido no pueden estar vacíos.");
                }
                break;

            case 2:
                agenda.listarContactos();
                break;

            case 3:
                System.out.println("Introduce el nombre a buscar: ");
                nombre = scanner.nextLine();
                System.out.println("Introduce el apellido a buscar: ");
                apellido = scanner.nextLine();
                agenda.buscarContacto(nombre, apellido);
                break;

            case 4:
                System.out.println("Introduce el nombre del contacto a eliminar: ");
                nombre = scanner.nextLine();
                System.out.println("Introduce el apellido del contacto a eliminar");
                apellido = scanner.nextLine();
                agenda.eliminarContacto(new Contacto(nombre, apellido, ""));
                break;

            case 5:
                System.out.println("Introduce el nombre del contacto a modificar: ");
                nombre = scanner.nextLine();
                System.out.println("Introduce el apellido del contacto a modificar: ");
                apellido = scanner.nextLine();
                System.out.println("Introduce el nuevo teléfono: ");
                telefono = scanner.nextLine();
                agenda.modificarTelefono(nombre, apellido, telefono);
                break;

            case 6:
                agenda.espaciosLibres();
                break;

            case 7:
                System.out.println("Saliendo...");
                scanner.close();
                return;

            default:
                System.out.println("Opción no válida");

            }

        }

    }
}
