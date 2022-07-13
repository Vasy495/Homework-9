public class Main {
    public static void main(String[] args) {

        Book bookNumberOne = new Book("Война и мир", new Author("Лев", "Толстой"),1811);
        Book bookNumberTwo = new Book("Финансы", new Author("Георгий", "Бофт"),2020);


        System.out.println("Год издания книги " + bookNumberTwo.getNameBook() + ": " + bookNumberTwo.getYearBook());
        bookNumberTwo.setYearBook(2021);
        System.out.println("Обновленный год издания книги " + bookNumberTwo.getNameBook() + ": " + bookNumberTwo.getYearBook());
    }
}

