# JAVA Study📖

<table>
    <tr>
         <th colspan=5>💻🙎‍♂스터디원</th>
    </tr>
    <tr>
        <td><a href='https://github.com/jeonbar2'>강전호</a></td>
        <td><a href='https://github.com/HoduUlmu'>김재훈</a></td>
        <td><a href='https://github.com/Shinnybest'>김효신</a></td>
        <td><a href='https://github.com/hyunwoome'>임현우</a></td>
        
    
</table>


## Chapter 01. `반복`

연습 문제 11번. 

` 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어, 135를 입력하면 '그 수는 3자리입니다.' 라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.' 라고 출력하면 됩니다. `

---

## Chapter 02-1. `배열`

연습 문제 09번. 

`y년 m월 d일의 그 해 남은 일 수(12월 31일이면 0, 12월 30일이면 1)를 구하는 아래 메서드를 작성하세요. `
```
static int leftDayOfYear(int y, int m, int d)
```
 
 ---
 
## Chapter 02-2. `클래스`

연습 문제 11번. 

```
class YMD {
  int y; 
  int m; 
  int d;
}
```

` 위 처럼 서기 년월일을 필드로 갖는 클래스를 만드세요. 다음과 같이 생성자(constructor)와 메서드를 정의해야 합니다.`
- 생성자 (주어진 날짜로 설정) YMD(int y, int m, int d)
- n일 뒤의 날짜를 반환 YMD after(int n)
- n일 앞의 날짜를 반환 YMD before(int n)

---

## Chapter 04-1. `스택`

연습 문제 02번. 

```
public class Gstack<E> {
  private int max;   // 스택 용량
  private int ptr;   // 스택 포인터
  private E [] stk;  // 스택 본체
}
```

` 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Gstack<E>를 작성하세요.`

---

## Chapter 04-2. `큐`

연습 문제 06번. 

```
public class Gqueue<E> {
  private int max;   // 큐의 용량
  private int num;   // 현재 데이터 수
  private int front;  // 프런트 요소 커서
  private int rear;  // 리어요소 커서
  private E[] que;   // 큐의 본체
}
```

` 임의의 객체형 데이터를 쌓아 놓을 수 있는 제네릭 큐 클래스 Gqueue<E>를 작성하세요.`

---
