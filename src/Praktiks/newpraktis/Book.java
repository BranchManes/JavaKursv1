package Praktiks.newpraktis;

public class Book {

    private String nameBook;
    private String nameAftor;
    private String namePublisher;
    private int ISBN;

    Book(String nameBook, String nameAftor, String namePublisher, int ISBN) {
         if (nameBook != null) {
             this.nameBook = nameBook;
         } else {
             System.out.println("Ошибка");
         }
         if (nameAftor != null) {
             this.nameAftor = nameAftor;
         } else {
             System.out.println("Ошибка");
         }
         if (namePublisher != null) {
             this.namePublisher = namePublisher;
         } else {
             System.out.println("Ошибка");
         }
         if (ISBN > 0) {

             this.ISBN = ISBN;
         } else {
             System.out.println("Ошибка!");
         }

     }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAftor() {
        return nameAftor;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setNameBook(String nameBook) {
        if (nameBook != null) {
            this.nameBook = nameBook;
        } else {
            System.out.println("Ошибка");
        }
    }

    public void setNameAfter(String nameAftor) {
        if (nameAftor != null) {
            this.nameAftor = nameAftor;
        } else {
            System.out.println("Ошибка");
        }

    }

    public void setnamePublisher(String namePublisher) {
        if (namePublisher != null) {
            this.namePublisher = namePublisher;
        } else {
            System.out.println("Ошибка");
        }
    }

    public void setISBN(int ISBN) {
        if (ISBN > 0) {
            this.ISBN = ISBN;
        } else {
            System.out.println("Ошибка");
        }
    }

    public void getShowInfo() {
        System.out.println("Имя книги:" + getNameBook() + ",имя автора:" + getNameAftor() + ",издатель:" + getNamePublisher() + ",ISBN:" + getISBN());
    }
}

class Books extends Book{ // Вызываем супер конструктор и записываем туда значения переменных
    
    Books(String nameBook, String nameAftor, String namePublisher, int ISBN){
        super(nameBook,nameAftor,namePublisher,ISBN);
        
    }
    
    
    
}

class TestBook {

    public static void main(String[] args) {
        Book array[] = new Book[30];
        array[1] = new Book("James", "James Oliver", "Alpina", 312546);
        array[1].getShowInfo();
        array[2] = new Book("Doctor WHO", "James Oliver", "Alpina", 3548946);
        array[2].getShowInfo();
        Books array2[] = new Books[2];
        array2[1]= new Books("Brow","Kirl Viring","Alpina",548792);
        array2[1].getShowInfo();
    }
}
 