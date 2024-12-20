class Book {
    private String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void book_info() {
        System.out.println("Book name is " + name + " and the author is " + author +".");
    }

    public static void main(String[] args) {
        Book bigBook = new Book("Introduction to Electronics", "Iftekhar Md Shishir");
        bigBook.book_info();
    }
}