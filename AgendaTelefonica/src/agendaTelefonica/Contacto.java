package agendaTelefonica;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setter para el teléfono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para comparar contactos (basado en nombre y apellido)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equalsIgnoreCase(contacto.nombre) && apellido.equalsIgnoreCase(contacto.apellido);
    }

    // Método toString para mostrar los detalles del contacto
    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }
}
