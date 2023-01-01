package codewars._8kyu;

public class Bio {
    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
}


/*
* https://www.codewars.com/kata/5556282156230d0e5e000089/train/java
* 회고
* replace() 로 푼 사람도 있었는데 replace()와 replaceAll()의 차이를 정확하게 몰라서 찾아보는 시간을 가졌다.
* replaceAll() 은 replace() 메서드 기능에 정규식 적용도 가능하다는 걸 알았다.
* */