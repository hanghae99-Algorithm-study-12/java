# JAVA Studyπ

<table>
    <tr>
         <th colspan=5>π»πββμ€ν°λμ</th>
    </tr>
    <tr>
        <td><a href='https://github.com/jeonbar2'>κ°μ νΈ</a></td>
        <td><a href='https://github.com/HoduUlmu'>κΉμ¬ν</a></td>
        <td><a href='https://github.com/Shinnybest'>κΉν¨μ </a></td>
        <td><a href='https://github.com/hyunwoome'>μνμ°</a></td>
        
    
</table>


## Chapter 01. `λ°λ³΅`

μ°μ΅ λ¬Έμ  11λ². 

` μμ μ μλ₯Ό μλ ₯νκ³  μλ¦Ώμλ₯Ό μΆλ ₯νλ νλ‘κ·Έλ¨μ μμ±νμΈμ. μλ₯Ό λ€μ΄, 135λ₯Ό μλ ₯νλ©΄ 'κ·Έ μλ 3μλ¦¬μλλ€.' λΌκ³  μΆλ ₯νκ³ , 1314λ₯Ό μλ ₯νλ©΄ 'κ·Έ μλ 4μλ¦¬μλλ€.' λΌκ³  μΆλ ₯νλ©΄ λ©λλ€. `

---

## Chapter 02-1. `λ°°μ΄`

μ°μ΅ λ¬Έμ  09λ². 

`yλ mμ dμΌμ κ·Έ ν΄ λ¨μ μΌ μ(12μ 31μΌμ΄λ©΄ 0, 12μ 30μΌμ΄λ©΄ 1)λ₯Ό κ΅¬νλ μλ λ©μλλ₯Ό μμ±νμΈμ. `
```
static int leftDayOfYear(int y, int m, int d)
```
 
 ---
 
## Chapter 02-2. `ν΄λμ€`

μ°μ΅ λ¬Έμ  11λ². 

```
class YMD {
  int y; 
  int m; 
  int d;
}
```

` μ μ²λΌ μκΈ° λμμΌμ νλλ‘ κ°λ ν΄λμ€λ₯Ό λ§λμΈμ. λ€μκ³Ό κ°μ΄ μμ±μ(constructor)μ λ©μλλ₯Ό μ μν΄μΌ ν©λλ€.`
- μμ±μ (μ£Όμ΄μ§ λ μ§λ‘ μ€μ ) YMD(int y, int m, int d)
- nμΌ λ€μ λ μ§λ₯Ό λ°ν YMD after(int n)
- nμΌ μμ λ μ§λ₯Ό λ°ν YMD before(int n)

---

## Chapter 04-1. `μ€ν`

μ°μ΅ λ¬Έμ  02λ². 

```
public class Gstack<E> {
  private int max;   // μ€ν μ©λ
  private int ptr;   // μ€ν ν¬μΈν°
  private E [] stk;  // μ€ν λ³Έμ²΄
}
```

` μμμ κ°μ²΄ν λ°μ΄ν°λ₯Ό μμ μ μλ μ λ€λ¦­ μ€ν ν΄λμ€ Gstack<E>λ₯Ό μμ±νμΈμ.`

---

## Chapter 04-2. `ν`

μ°μ΅ λ¬Έμ  06λ². 

```
public class Gqueue<E> {
  private int max;   // νμ μ©λ
  private int num;   // νμ¬ λ°μ΄ν° μ
  private int front;  // νλ°νΈ μμ μ»€μ
  private int rear;  // λ¦¬μ΄μμ μ»€μ
  private E[] que;   // νμ λ³Έμ²΄
}
```

` μμμ κ°μ²΄ν λ°μ΄ν°λ₯Ό μμ λμ μ μλ μ λ€λ¦­ ν ν΄λμ€ Gqueue<E>λ₯Ό μμ±νμΈμ.`

---
