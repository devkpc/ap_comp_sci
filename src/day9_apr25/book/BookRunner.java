package day9_apr25.book;

public class BookRunner {
    public static void main (String[] args)
    {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 208);
        Book b2 = new Book("Clean Code", "Robert Martin", 431);
        b1.display();
        System.out.println("---");
        b1.borrow("Alice");
        b1.borrow("Bob");    // should fail, Alice has it
        b1.display();
        System.out.println("---");
        b1.returnBook();
        b1.returnBook();
        // should fail, already returned
        b1.borrow("Bob");
        // should work now
        System.out.println("---");
         b2.borrow("Carol");
         b2.display();
    }
}
