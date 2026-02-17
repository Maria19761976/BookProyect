# BookProyect

## Descripción

BookProyect es una aplicación Java simple que gestiona información sobre libros. Permite crear objetos de libros, establecer sus propiedades (título, descripción, ISBN, autor, precio) y mostrar la información de forma estructurada.

## Características

- **Clase Book**: Representa un libro con las siguientes propiedades:
  - Título
  - Descripción
  - ISBN
  - Autor
  - Precio

- **Getters y Setters**: Acceso completo a los atributos del libro
- **Demostración**: Incluye ejemplos con obras de Stephen King

## Estructura del Proyecto

```
BookProyect/
├── src/
│   ├── Book.java       # Clase que define la estructura de un libro
│   └── Main.java       # Clase principal con ejemplos de uso
├── README.md           # Este archivo
└── BookProyect.iml     # Archivo de configuración del IDE
```

## Uso

### Compilación y Ejecución

```bash
# Compilar los archivos Java
javac src/*.java

# Ejecutar la aplicación
java -cp src Main
```

### Ejemplo de Código

```java
// Crear un nuevo libro
Book book = new Book();

// Establecer propiedades
book.setTitle("It");
book.setDescription("Un payaso aterrador acecha a un grupo de niños en Derry, Maine.");
book.setIsbn("978-0-451-16951-3");
book.setWriter("Stephen King");
book.setPrice(19.99);

// Obtener propiedades
System.out.println(book.getTitle());
System.out.println(book.getPrice());
```

## Salida de Ejemplo

La aplicación genera una lista de 5 libros de Stephen King y muestra sus propiedades. Luego modifica el primer libro y muestra la versión actualizada.

```
LISTA DE LIBROS 
-------------------------------
Título:      It
Descripción: Un payaso aterrador acecha a un grupo de niños en Derry, Maine.
ISBN:        978-0-451-16951-3
Autor:       Stephen King
Precio:      $19.99
-------------------------------
...
```

## Requisitos

- Java 8 o superior

## Autor

Proyecto de ejemplo para gestión de libros en Java.

## Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.
