
##템플릿 메서드
`템플릿` 틀이 있는 메서드. 싱글톤 패턴과 같은 디자인 패턴.  
템플릿 메서드는 디자인 패턴의 한 방법으로 모든 객체 지향 프로그램에서 사용하는 구현 방법.  
추상 메서드나 구현된 메서드를 활용하여 전체 기능의 흐름(시나리오)을 정의하는 메서드 final 로 선언하면
하위 클래스에서 재정의 할 수 없음.  
####추상 클래스와 템플릿 메서드
추상 클래스로 선언된 상위 클래스에 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서 다르게 구현되어야 하는 
부분은 추상 메서드로 선언해서 하위 클래스가 구현하도록 함.  

####final 예약어
* final 변수는 값이 변경될 수 없음 상수임 
public static final double PI = 3.14;
* final 변수는 오직 한 번만 값을 할 당할 수 있음.
* final 메서드는 하위 크래스에서 재정의 (overriding) 할 수 없음.
* final 클래스는 더 이상 상속되지 않음  
예) java 의 String 클래스