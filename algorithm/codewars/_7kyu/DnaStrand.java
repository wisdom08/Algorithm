package codewars._7kyu;

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for (Character c : dna.toCharArray()) {
            if (c == 'A') {
                sb.append('T');
            } else if(c == 'T'){
                sb.append('A');
            } else if (c == 'C') {
                sb.append('G');
            } else {
                sb.append('C');
            }
        }

        return sb.toString();
    }
}
/*
* https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java
* 회고
* replace 나 switch 로 푸는 방법도 참고함.
* */