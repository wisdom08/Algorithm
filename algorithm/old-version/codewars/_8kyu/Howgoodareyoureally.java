package codewars._8kyu;

public class Howgoodareyoureally {
    public class Kata {
        public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
            int sum = yourPoints;

            for (int point : classPoints) {
                sum += point;
            }

            int numberOfStudents = classPoints.length + 1;
            int aver = sum / numberOfStudents;
            if (aver > yourPoints) {
                return false;
            }

            return true;
        }
    }
}

/*
* https://www.codewars.com/kata/5601409514fc93442500010b/train/java
* 회고
* 내 점수는 포함하든 안하든 테스트 통과된다.
* */