#제넥릭 프로그래밍
* 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형을 변환 될 수 있도록 프로그래밍 하는 방식
* 실제 사용되는 참조 자료형으로 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식
* 컬렉션 프레임워크에서 많이 사용되고 있음

###자료형 매개 변수 T
* type의 의미로 T를 많이 사용 함
* <T>에서 <>는 다이아몬드 연사자라고 함
* static 키워드는 T 에 사용할 수 없음.  
 <T>는 생성할때 타입이 결정.static 은 인스턴트 생성과 상관없이 메모리를 잡음.
* ArrayList<String> list = new ArrayList<>();  
다이아몬드 연산자 내부에서 자료형은 생략가능 함.
* 제네릭에서 자료형 추론(자바 10 부터 )

### 자료형의 매개변수가 두 개인 경우
* T.V 두 개의 자료형 매개변수 사용
* GenericMethod 참조
