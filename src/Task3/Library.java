package Task3;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
        System.out.println("Библиотека создана.");
    }

    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Книга успешно добавлена");
    }

    public void removeBook(Book book) {
        if (catalog.remove(book)) {
            System.out.println("Книга успешно удалена");
        } else {
            System.out.println("Книга не найдена в каталоге");
        }
    }

    public void searchByAuthor(String author){
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author.trim())){
                searchList.add(book);
            }
        }
        if (searchList.isEmpty()){
            System.out.println("Книги автора не найдены");
        } else {
            System.out.println("Найденные книги автора:");
            System.out.println(searchList);
        }
    }

    public void displayAvailableBooks(){
        displaySizeLibrary();
        System.out.println(catalog);
    }
    public void displaySizeLibrary(){
        System.out.println("Книг в каталоге: "+ catalog.size());
    }
}
