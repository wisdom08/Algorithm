package practice.programmers;

public class _120902 {
    public int solution(String my_string) {
        int answer = 0;
        String[] stringArr = my_string.split(" ");
        answer = Integer.parseInt(stringArr[0]);

        for(int i = 1; i < stringArr.length; i++){
            if(i%2!=0){
                if(stringArr[i].equals("+")){
                    answer += Integer.parseInt(stringArr[i+1]);
                } else {
                    answer -= Integer.parseInt(stringArr[i+1]);
                }
            }
        }

        return answer;
    }
}
