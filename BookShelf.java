import java.util.ArrayList;
public class BookShelf {
    public char firstbookletter;
    public String shelfLetter;
    ArrayList<Book> BookShelves = new ArrayList<Book>();
    public BookShelf(){
        shelfLetter = "";
        for(int i = 0; i < 8;i++){
            BookShelves.add(i,null);
        }

    }
    public void addBook(Book Book){
        for(int i = 0; i < 8;i++){
            if (BookShelves.get(i) == null){
                firstbookletter = Book.title.charAt(0);
                if (firstbookletter == shelfLetter.charAt(0)) {
                    BookShelves.set(i,Book);
                }
                return;
            }
        }
    }
    public void removeBook(Book Book){
        for(int i = 0; i < 8;i++){
            if (BookShelves.get(i) == Book){
                BookShelves.set(i,null);
            }
        } 
    }
    @Override
    public String toString(){
        Book spot;

        //looks through each spot in the arraylist
        for(int i = 0; i < 8;i++){

            spot = BookShelves.get(i);
            //if this is deemed true at any point, it means there is something in the arrayList
            if (spot != null){
                //initizalize a variable result
                String result = "";
                //looks through each value in the arrayList
                for(int j = 0; j < 8;j++){
                    
                    spot = BookShelves.get(j);
                    if (spot != null){
                        result = result + spot.title + "   ";
                    }
                } 
                return result;
            }
        }
        //all the spots were empty, returns empty
        return "Empty";
    }
}
