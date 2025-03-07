public class LibraryTester {
    public void main(String args[]){
        BookShelf T = new BookShelf();
        T.shelfLetter = "T";
        BookShelf O = new BookShelf();
        O.shelfLetter = "O";
        Book Betrayed = new Book("The Heart of the Betrayed","Crime");
        Book Stars = new Book("Our Hill of Stars","Fantasy");
        Book Kind = new Book("One of a Kind","Science Fiction");
        Book Roses = new Book("The Vision of Roses","Romance");
        System.out.println(T);
        System.out.println(O);
        System.out.println(Betrayed);
        System.out.println(Stars);
        System.out.println(Kind);
        System.out.println(Roses);
        O.addBook(Betrayed);
        O.addBook(Stars);
        O.addBook(Kind);
        O.addBook(Roses);
        T.addBook(Betrayed);
        T.addBook(Stars);
        T.addBook(Kind);
        T.addBook(Roses);
        System.out.println(O);
        System.out.println(T);
        
    }
    
}
