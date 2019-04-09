/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

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
