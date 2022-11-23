public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publisherYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publisherYear;
    }

    public String getBookName(){
        return bookName;
    }
    public Author getAuthorName(){
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear=publishingYear;
    }
}