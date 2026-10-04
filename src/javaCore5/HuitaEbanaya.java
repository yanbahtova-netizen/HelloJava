package javaCore5;

import java.util.HashSet;
import java.util.Set;

public class HuitaEbanaya {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
//        Set<T> result = new HashSet<>();
//        for (T el: set1) {
//            if (!set2.contains(el)) {
//                result.add(el);
//            }
//        }
//        for (T el: set2) {
//            if(!set1.contains(el)) {
//                result.add(el);
//            }
//        }
//        return result;
        Set<T> copy1 = new HashSet<>(set1);
        Set<T> copy2 = new HashSet<>(set1);
        copy1.removeAll(set2);
        copy2.removeAll(set1);
        copy1.addAll(copy2);
        return copy1;

    }
}
