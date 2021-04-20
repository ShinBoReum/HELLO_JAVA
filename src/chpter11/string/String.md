#String 클래스
### String을 선언하는 두 가지 방법
* String str1 = new String("abc"); //생성자의 매개변수로 문자열 생성 
* String str2 = "test" //문자열을 직접 대임 . 문자열 상수를 가리키는 방식
### 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 방법 두 가지.
* 상수 풀의 문자열을 참조하면 모든 문자열이 같은 주소를 가리킴.
### String 클래스로 문자열 연결
* 한번 생성된 String 값(문자열)은 불변 (immutable)__
* 두 개의 문자열을 연결하면 새로운 인스턴스가 생성 됨
* 문자열 연결을 계속하면 메모리에 garbage 가 많이 생길 수 있음.
### StringBuilder, StringBuffer 사용하기
* 내부적으로 가변적인 char[] 배열을 가지고 있는 클래스 
* 문자열을 여러 번 연결하거나 변경할 때 사용하면 유리함. 불편이 아니라 가변!
* 매번 새로 생성하지지 않고 기존 배열을 변경하므로 garbage 가 생기지 않음
* StringBuffer 는 멀티 쓰레드 프로그래밍에서 동기화를 보장 (동기화시 락)
* 단일 쓰레드 프로그램에서는 StringBuilder 를 사용하기를 권장
* toString() 메서드로 String 반환

