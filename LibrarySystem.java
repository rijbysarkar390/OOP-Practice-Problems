class Book{
    private String title;
    private String author;
    Book(String title){
        this(title,"Sabit Raihan");
    }
    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public void bookName(){
        System.out.println("This book name is : " + title);
    }
    public void authorName(){
        System.out.println("Author of this book is : " + author);
    }
    public void bookAndauthorName(){
        System.out.println("Book name : " + title + ", Author : " + author);
    }
}
public class LibrarySystem {
    public static void main(String[] args){
        Book book1 = new Book("moner sokti");
        Book book2 = new Book("Linear Algebra","Marc Lipson");
        book1.bookName();
        book1.authorName();
        book1.bookAndauthorName();
        book2.bookName();
        book2.authorName();
        book2.bookAndauthorName();
    }
}
