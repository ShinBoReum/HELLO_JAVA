package chapter7.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for (int i=0; i<library.length; i++){
            System.out.println(library[i]);  //null 출력 자리만 만듬
        }

        library[0] = new Book("태백1", "조정래");
        library[1] = new Book("태백2", "조정래");
        library[2] = new Book("태백3", "조정래");
        library[3] = new Book("태백4", "조정래");
        library[4] = new Book("태백5", "조정래");

        for (int i=0; i<library.length; i++){
            System.out.println(library[i]);  //주소값 만듬
        }

        for (int i=0; i<library.length; i++){
            library[i].showBookInfo();
        }

    }
}
