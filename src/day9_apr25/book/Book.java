package day9_apr25.book;

public class Book {
    private String title;
    private String author;
    private int totalPages;
    boolean isBorrowed = false;
    String borrowedBy = "None";

    public Book(String t, String a, int pages)
    {
        title = t;
        author = a;
        totalPages = pages;

    }
    public void borrow(String personName)
    {
        if (!isBorrowed)
        {
            isBorrowed = true;
            borrowedBy = personName;
            System.out.println(personName + "borrowed " + title);
        } else {
            System.out.println("Sorry " + title + " is currently borrowed by " + borrowedBy);
        }
    }
    public void returnBook(){
        if (!isBorrowed)
        {
            isBorrowed = true;
            System.out.println("Returned " + title);

        }
        else {
            isBorrowed = false;
            System.out.println("It's already in the library");

        }

    }
    public void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + totalPages);
        System.out.println("Borrowed by: " + borrowedBy);


    }
}
