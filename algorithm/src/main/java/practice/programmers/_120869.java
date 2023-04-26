package practice.programmers;

public class _120869 {
    public int solution(String[] spell, String[] dic) {
        boolean isContainedWithin = false;

        for (String word : dic) {
            int count = 0;
            for (String alphabet : spell) {
                if(word.contains(alphabet)) count++;
            }

            if (count == spell.length) {
                isContainedWithin =  true;
                break;
            }
        }
        return isContainedWithin ? 1 : 2;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120869
