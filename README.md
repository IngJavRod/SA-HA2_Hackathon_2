# SA-HA2_Hackathon_2

# Agenda Telefónica - Hackatón

Este proyecto fue desarrollado como parte de un hackatón con el objetivo de crear un sistema de gestión de agenda telefónica en Java. La plataforma permite realizar diversas operaciones sobre una agenda de contactos, como añadir, listar, buscar, modificar y eliminar contactos. Además, incluye validaciones para asegurar que no se añadan contactos duplicados y que los datos sean correctos.

## Funcionalidades

- **Añadir Contacto**: Permite añadir un contacto a la agenda, verificando que no esté duplicado y que los campos no estén vacíos.
- **Listar Contactos**: Muestra todos los contactos de la agenda, ordenados alfabéticamente por nombre y apellido.
- **Buscar Contacto**: Permite buscar un contacto por su nombre y apellido, mostrando su número telefónico si existe.
- **Eliminar Contacto**: Elimina un contacto de la agenda si existe.
- **Modificar Teléfono**: Permite modificar el teléfono de un contacto existente en la agenda.
- **Espacio Libre**: Informa cuántos contactos más pueden ser añadidos a la agenda, basado en el tamaño máximo definido.
- **Validaciones**: Se realizan validaciones para evitar contactos duplicados y para asegurar que los nombres y apellidos no estén vacíos.

## Requisitos

- Java 8 o superior.
- Un IDE como IntelliJ IDEA, Eclipse o Visual Studio Code.

## Instalación

1. Clona este repositorio:

    ```bash
    git clone https://github.com/tuusuario/agenda-telefonica.git
    ```

2. Abre el proyecto en tu IDE preferido.

3. Ejecuta la clase `Main.java` para probar el sistema de gestión de contactos.

## Uso

El sistema de gestión de agenda telefónica se ejecuta en consola, donde se le presentará al usuario un menú interactivo con las siguientes opciones:

1. Añadir Contacto
2. Listar Contactos
3. Buscar Contacto
4. Eliminar Contacto
5. Modificar Teléfono
6. Verificar espacio libre
7. Salir

### Ejemplo de uso:

1. **Añadir un Contacto**:
   ```text
   Introduce el nombre: Ivan
   Introduce el apellido: Camacho
   Introduce el teléfono: 123456789
   Contacto añadido exitosamente.
