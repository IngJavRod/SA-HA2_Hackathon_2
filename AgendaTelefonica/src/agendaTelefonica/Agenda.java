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

        // Ordenamos los contactos alfabéticamente por nombre y apellido
        contactos.stream()
                .sorted((c1, c2) -> {
                    // Primero comparamos por nombre
                    int nombreComparison = c1.getNombre().compareToIgnoreCase(c2.getNombre());

                    // Si los nombres son iguales, comparamos por apellido
                    if (nombreComparison == 0) {
                        return c1.getApellido().compareToIgnoreCase(c2.getApellido());
                    }

                    return nombreComparison;
                })
                .forEach(System.out::println);
    }

    // Método para buscar un contacto
    public void buscarContacto(String nombre, String apellido) {
        // Creamos un contacto con el mismo nombre y apellido (sin importar teléfono)
        Contacto contactoBuscado = new Contacto(nombre, apellido, "");

        // Usamos contains para verificar si el contacto existe en la lista (basado en el método equals())
        if (contactos.contains(contactoBuscado)) {
            for (Contacto c : contactos) {
                if (c.equals(contactoBuscado)) { // Compara solo nombre y apellido
                    System.out.println("Contacto encontrado: " + c);
                    return;
                }
            }
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


    // Método para eliminar un contacto
    public void eliminarContacto(Contacto c) {
        // Usamos equals solo para comparar nombre y apellido
        if (contactos.removeIf(contacto -> contacto.equals(c))) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Este contacto no existe.");
        }
    }


    // Método para modificar teléfono de un contacto
    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        for (Contacto c : contactos) {
            // Si encontramos el contacto por nombre y apellido
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                c.setTelefono(nuevoTelefono); // Modificamos el teléfono directamente
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
