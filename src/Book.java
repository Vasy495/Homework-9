public class Book {
    private Author authorName;
    private int yearBook;
    private String nameBook;

    public Book(String nameBook, Author authorName, int yearBook) {
        this.yearBook = yearBook;
        this.nameBook = nameBook;
        this.authorName = authorName;
    }


    public int getYearBook() {
        return yearBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

}



