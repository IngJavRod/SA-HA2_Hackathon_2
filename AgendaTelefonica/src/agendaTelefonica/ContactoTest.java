package agendaTelefonica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactoTest {
    Contacto miguel;
    Contacto ivan;
    @BeforeEach
    public void setUp(){
        miguel = new Contacto("Miguel", "Gonzalez", "3421112234");
        ivan = new Contacto("Alejandro", "Fernandez", "3301022345");
    }

    @Test
    @DisplayName("Prueba al metodo getNombre")
    public void getName(){
        assertEquals("Miguel", miguel.getNombre());
    }

    @Test
    @DisplayName("Prueba al metodo getApellido")
    public void getApellido(){
        assertEquals("Gonzalez", miguel.getApellido());
    }

    @Test
    @DisplayName("Prueba al metodo getTelefono")
    public void getTelefono(){
        assertEquals("3301022345", ivan.getTelefono());
    }
}