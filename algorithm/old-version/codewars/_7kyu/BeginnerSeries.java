package codewars._7kyu;

public class BeginnerSeries {
    public int GetSum(int a, int b) {
        if(a==b) return a;
        int sum = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum+=i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                sum +=i;
            }
        }
        return sum;
    }
}

/*
* https://www.codewars.com/kata/55f2b110f61eb01779000053/java
* 회고
* IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum()
* 다른 사람이 작성한 코드 중 가장 가독성이 좋은 코드로 느껴진다.
*
* 추가적으로 오늘 면접에서 반복문을 돌릴 때 스트림과 for 문의 반복문 성능 차이를 물어보셨었는데 답변을 제대로 못했던 게 이 간단한 문제를 풀면서 다시 생각났다.
* 코드워즈 문제를 풀 때 지금까지 어떤 성능의 차이가 있는지 왜 찾아보지 못했을까? 코드 한 줄, 한 줄 호기심을 가져야 한다. 그냥 넘어가지 말자.
*
* 성능 차이에 대해서는 면접 끝나고 정리를 했었는데 간단하게 다시 정리해보면 for 문은 인덱스 기반으로 도는 반복문으로 메모리에 접근하기 때문에 스트림에 비해 빠르고 오버헤드도 없다.
* 그에 비해 스트림은 JVM이 이것저것 처리해줘야 하는 것들이 많아서 실행 시, 느릴 수밖에 없다.
* */