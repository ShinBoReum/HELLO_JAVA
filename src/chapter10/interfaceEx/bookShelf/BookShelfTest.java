package chapter10.interfaceEx.bookShelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();

        shelfQueue.enQueue("태백1");
        shelfQueue.enQueue("태백2");
        shelfQueue.enQueue("태백3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
