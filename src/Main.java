public class Main {

    public static void main(String[] args) {



        Book book1 = new Book();
        book1.setTitle("It");
        book1.setDescription("Un payaso aterrador acecha a un grupo de niños en Derry, Maine.");
        book1.setIsbn("978-0-451-16951-3");
        book1.setWriter("Stephen King");
        book1.setPrice(19.99);

        Book book2 = new Book();
        book2.setTitle("The Shining");
        book2.setDescription("Un escritor se convierte en el cuidador de un hotel encantado en invierno.");
        book2.setIsbn("978-0-385-12167-5");
        book2.setWriter("Stephen King");
        book2.setPrice(15.99);

        Book book3 = new Book();
        book3.setTitle("Carrie");
        book3.setDescription("Una adolescente con poderes telequinéticos se venga de sus compañeros de escuela.");
        book3.setIsbn("978-0-385-08695-0");
        book3.setWriter("Stephen King");
        book3.setPrice(12.99);

        Book book4 = new Book();
        book4.setTitle("Misery");
        book4.setDescription("Un novelista queda atrapado por su fanática más peligrosa tras un accidente.");
        book4.setIsbn("978-0-670-81364-3");
        book4.setWriter("Stephen King");
        book4.setPrice(14.99);

        Book book5 = new Book();
        book5.setTitle("Pet Sematary");
        book5.setDescription("Una familia descubre un cementerio con el poder de resucitar a los muertos.");
        book5.setIsbn("978-0-385-18244-7");
        book5.setWriter("Stephen King");
        book5.setPrice(16.99);



        System.out.println("========== LISTA DE LIBROS ==========");
        printBook(book1);
        printBook(book2);
        printBook(book3);
        printBook(book4);
        printBook(book5);



        System.out.println("\n===== LIBRO MODIFICADO (book1) =====");
        book1.setTitle("It - Edición Especial");
        book1.setDescription("Edición de coleccionista con contenido exclusivo e ilustraciones.");
        book1.setIsbn("978-0-000-00000-0");
        book1.setWriter("Stephen Edwin King");
        book1.setPrice(39.99);

        printBook(book1);
    }


    public static void printBook(Book book) {
        System.out.println("-------------------------------");
        System.out.println("Título:      " + book.getTitle());
        System.out.println("Descripción: " + book.getDescription());
        System.out.println("ISBN:        " + book.getIsbn());
        System.out.println("Autor:       " + book.getWriter());
        System.out.println("Precio:      $" + book.getPrice());
        System.out.println("-------------------------------");
    }
}