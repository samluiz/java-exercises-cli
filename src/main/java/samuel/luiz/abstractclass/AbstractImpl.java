package samuel.luiz.abstractclass;

public class AbstractImpl {


    public void run() {
        Book newBook = new MyBook();
        newBook.setTitle("A tale of two cities");
        System.out.println("The title is: " + newBook.getTitle());
    }

}
