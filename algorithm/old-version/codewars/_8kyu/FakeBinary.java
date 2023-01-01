package codewars._8kyu;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (Character c : numberString.toCharArray()) {
            if (Integer.parseInt(c.toString()) >= 5) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}


/*
* https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
* 회고
* if문 분기처리없이, append() 메서드 안에서 삼항연산자로 처리하는 것도 코드 가독성이 괜찮아보인다.
* */