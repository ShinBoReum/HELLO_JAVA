# 컬렉션 프레임웍
- 프로그램 구현에 필요한 자료구조를 구현해 놓은 라이브러리
- java.util 패키지에 구현되어 있음
- 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
- 여러 인터페이스와 구현 클래스 사용 방법을 이해해야 함
- 단일 개체를 핸들링.

### Collection 인터페이스
- 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스
- 하위에 List 와 set 인터페이스가 있음
- 여러 클래스들이 collection 인터페이스를 구현함.  

|분류|설명|
|------|---|
|List 인터페이스|순서가 있는 자료관리, 중복 허용. 이 인터페이스를 구현한 클래스는 ArrayList, Vector, LinkedList, Stack, Queue 등이 있음|
|Set 인터페이스| 순서가 정해져 있지 않음. 중복을 허용하지않음. HashSet, TreeSet|

### Collection 인터페이스
|메서드|설명|
|------|---|
|boolean add(E e)| Collection 에 객체를 추가합니다.|
|void clear()| Collection 의 모든 객체를 제거합니다.|
|Iterator<E> iterator | Collection 을 순환할 반복자를 반환합니다. |
|boolean remove(Object o) | Collection에 매개변수에 해당하는 인스턴스가 존재하면 제거합니다.|
|int size() | Collection 에 있는 요소의 개수를 반환합니다.|

