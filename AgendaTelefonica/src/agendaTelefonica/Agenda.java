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

}
