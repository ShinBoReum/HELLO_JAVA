package chapter11.object;
class Book{
    String tilte;
    String author;

    Book(String tilte, String author){
        this.tilte = tilte;
        this.author = author;
    }

    @Override
    public String toString() {
        //super에 toString을 재정의
        return "Book{" +
                "tilte='" + tilte + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("두잇자바","박은종");
        System.out.println(book); //book 주소값 출력.
        //toString 재정의 후에는 이름과 저자 출력

        String str = new String("test");
        System.out.println(str); //test가 출력. String 클래스에 toString이 이미 정의 되있기 때문. 자기 문자열을 반환
    }
}
