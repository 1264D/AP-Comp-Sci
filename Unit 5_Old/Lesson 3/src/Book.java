
public class Book {
    private String title;
    private String author;
    private int year;
    
    public Book(String t, String a, int y){
        title = t;
        author = a;
        if (y > 1450) {
            year = y;
        }
    }
    
    public String toString(){
        return title + " (" + year + ")\n\tby " + author;
    }
}
