package codewars._8kyu;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 90) {
            return 'B';
        } else if (score >= 70 && score <= 80) {
            return 'C';
        } else if (score >= 60 && score <= 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

/*
* https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java
* 회고
* else if 문을 다 없앨 수도 있다. 다음은 최대한 if 문만으로 구성해보자.
*
* */