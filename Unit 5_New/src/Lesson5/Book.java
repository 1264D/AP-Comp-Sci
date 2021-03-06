
package Lesson5;
public class Book
  
{
  private String title;
  private String author;
  
  private int year;

  private static int num;
  private int bookID;
  
  public Book()
  {
    this("none", "unknown", 1450);
  }
  
  public Book(String t)
  {
    this(t, "unknown", 1450);
  }
  
  public Book(String t, String a, int y)
  {
      num++;
      bookID = num;
    setTitle(t);
    setAuthor(a);
    setYear(y);
  }
  
  public String toString()
  {
    return title + "\n\t" + author + "\n\t" + year + "\n\t" + bookID + " " + num;
  }
  
  public void setTitle(String t)
  {
    title = t;
  }
  
  public void setAuthor(String a)
  {
    author = a;
  }
  
  public void setYear(int y)
  {
    if (y >= 1450)
      year = y;
    else
      year = 2000;
  }

}
