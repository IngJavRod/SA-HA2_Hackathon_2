package agendaTelefonica;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private int tamañoMaximo;

    // Constructor con tamaño máximo por defecto de 10
    public Agenda() {
        this.contactos = new ArrayList<>();
        this.tamañoMaximo = 10;
    }

    // Constructor con tamaño personalizado
    public Agenda(int tamañoMaximo) {
        this.contactos = new ArrayList<>();
        this.tamañoMaximo = tamañoMaximo;
    }
    // Método para añadir un contacto
    public void añadirContacto(Contacto c) {
        if (contactos.size() >= tamañoMaximo) {
            System.out.println("La agenda está llena. No se puede añadir más contactos.");
            return;
        }
        if (!contactos.contains(c)) {
            contactos.add(c);
            System.out.println("Contacto añadido exitosamente.");
        } else {
            System.out.println("Este contacto ya existe.");
        }
    }

    // Método para listar los contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        contactos.stream()
            .sorted((c1, c2) -> c1.toString().compareToIgnoreCase(c2.toString()))
            .forEach(System.out::println);
    }
    // Método para buscar un contacto
    public void buscarContacto(String nombre, String apellido) {
        Contacto c = new Contacto(nombre, apellido, "");
        if (contactos.contains(c)) {
            System.out.println("Contacto encontrado: " + c);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    // Método para eliminar un contacto
    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Este contacto no existe.");
        }
    }

    // Método para modificar teléfono de un contacto
    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                c = new Contacto(nombre, apellido, nuevoTelefono);
                System.out.println("Teléfono modificado.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    // Verifica si la agenda está llena
    public boolean agendaLlena() {
        return contactos.size() >= tamañoMaximo;
    }

    // Muestra el espacio libre en la agenda
    public void espacioLibres() {
        System.out.println("Espacio libre en la agenda: " + (tamañoMaximo - contactos.size()));
    }
}
