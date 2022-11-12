package codewars._8kyu;

import java.util.Collections;
import java.util.List;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }

}

// https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java