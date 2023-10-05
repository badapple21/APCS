

public class BookTest {
    public static void main(String[] args){
        Book myBook = new Book(3);

        myBook.next_page();
        System.out.println(myBook.get_currentPage());

        myBook.next_page();
        System.out.println(myBook.get_currentPage());

        myBook.next_page();
        System.out.println(myBook.get_currentPage());
    }
}
