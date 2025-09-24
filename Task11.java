public class Task11 {

    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Java Programming","john Smith", 2021, 39.99),
                new Book("Python Basics","Jane Doe", 2020, 29.99),
                new Book("C++ Essentials","Michael JOhnson", 2019, 49.99)

        };
        int index = 1;
        for (Book b : books){
            System.out.println("Book" + index);
            b.printBook();
            index++;

        }

    }

}
    class Book {
        String title;
        String author;
        int yearPublished;
        double price;

        Book(String t, String a, int y, double p){
            this.title = t;
            this.author = a;
            this.yearPublished = y;
            this.price = p;
        }

        public void printBook() {

            System.out.println("Title: " + title);
            System.out.println("Author: " +  author);
            System.out.println("Year Published: " + yearPublished);
            System.out.println("Price: $" + Double.toString(price));
        }
    }


