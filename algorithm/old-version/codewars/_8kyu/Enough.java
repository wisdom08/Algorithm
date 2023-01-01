package codewars._8kyu;

public class Enough {
    public static int enough(int cap, int on, int wait){
        if (cap >= on+wait) {
            return 0;
        }
        return (on + wait) - cap;
    }

    public static int enough_2(int cap, int on, int wait){
        return Math.max(0, wait + on - cap);
    }
}

// https://www.codewars.com/kata/5875b200d520904a04000003/train/java