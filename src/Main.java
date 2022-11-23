public class Main {
    public static void main(String[] args) {
        Author author = new Author("А.С.Пушкин");
        Book book = new Book("Капитанская дочка",author, 1836);
        System.out.println("book = " + book.getBookName());
        System.out.println("author = " + author.getNameAuthor());
        System.out.println("year = " + book.getPublishingYear());
        book.setPublishingYear(1835);
        System.out.println("year = " + book.getPublishingYear());

        Author author1 = new Author("Ф.М. Достоевский");
        Book book1 = new Book("Преступление и наказание",author1, 1866);
        System.out.println("book1 = " + book1.getBookName());
        System.out.println("author1 = " + author1.getNameAuthor());
        System.out.println("year1 = " + book1.getPublishingYear());
        book.setPublishingYear(1865);
        System.out.println("year1 = " + book.getPublishingYear());
    }
}