package codewars._8kyu;

public class RemoveExclamationMarks {

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}

/*
* https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java
* 회고
* replaceAll 메서드에 대해서 좀 더 찾아봤는데 replace와 비교해서 '.'을 인식할 때 가장 큰 차이점이 있다는 걸 알았다.
* replace(".", "^^") 의 경우에는 "."만 ^^로 치환하는데
* replace(".", "^^") 의 경우에는 "."이 정규식으로 인식돼서 모든 문자를 ^^로 바꾸게 된다.
* */