package chapter7.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백1", "조정래");
        bookArray1[1] = new Book("태백2", "조정래");
        bookArray1[2] = new Book("태백3", "조정래");

        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for(int i=0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        for(int i=0; i<bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }
        for(int i=0; i<bookArray2.length; i++){
            /*
            bookArray1 바꿨는데 bookArray2 같이 바뀜
            arraycopy 로 값이 아니라 주소가 복사되었기 때문 = 얕은 복사
            두개의 배열이 동일한 인스턴스를 가르킴

            */
            bookArray2[i].showBookInfo();
        }
        /*
            값을 바꾸기 위해서는 깊은 복사
         */

        bookArray2[0] = new Book("태백1", "조정래");
        bookArray2[1] = new Book("태백2", "조정래");
        bookArray2[2] = new Book("태백3", "조정래");

        for(int i=0; i<bookArray1.length; i++){
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookName(bookArray1[i].getBookName());
        }

        bookArray1[0].setBookName("나무");
        bookArray1[0].setAuthor("베나나르");
        System.out.println("===============");
        for(int i=0; i<bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }
        for(int i=0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }
        System.out.println("=======b start =====");
        //새로운 for
        for(Book b : bookArray1){
            b.showBookInfo();
        }
    }
}
