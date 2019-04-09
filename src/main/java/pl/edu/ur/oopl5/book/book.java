
package pl.edu.ur.oopl5.book;

/**
 *
 * @author student
 */
public class book {

    private final String title;
    private final String author;
    private final int pages;
    private final int year;

    /**
     *
     */
    public int price;

    public book(String atitle, String bauthor, int cpages, int uyear) {
        title = atitle;
        author = bauthor;
        pages = cpages;
        year = uyear;
    }

     public String gettitle() {
        return title;
    }
    public String getauthor(){
    return author;
}
    
     public int getpages() {
        return pages;
    }
    public int getyear(){
    return year;
}
    
}