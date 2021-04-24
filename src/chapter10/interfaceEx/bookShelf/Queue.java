package chapter10.interfaceEx.bookShelf;

public interface Queue {
    void enQueue(String title); //배열의 맨 마지막에 추가
    String deQueue(); //배열의 맨 처음 항목 반환
    int getSize();  //현재 Queue 에 있는 개수 반환.
}
