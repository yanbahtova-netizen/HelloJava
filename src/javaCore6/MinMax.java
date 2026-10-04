package javaCore6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMax {
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Object[] box = new Object[2];
        stream.forEach(x -> {
            if (box[0] == null) {
                box[0] = x;
                box[1] = x;
            } else {
                if (order.compare(x, (T) box[0]) < 0) {
                    box[0] = x;
                }
                if (order.compare(x, (T) box[1]) > 0) {
                    box[1] = x;
                }
            }
        });
        if (box[0] == null) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept((T) box[0], (T) box[1]);
        }
    }
//        List<T> list = new ArrayList<>();
//        stream.forEach(x -> {
//            if(list.isEmpty()) {
//                list.add(x);
//                list.add(x);
//            } else {
//                if (order.compare(x, list.get(0)) < 0) {
//                    list.set(0, x);
//                }
//                if (order.compare(x, list.get(1)) > 0) {
//                    list.set(1, x);
//                }
//            }
//        });
//        if (list.isEmpty()) {
//            minMaxConsumer.accept(null, null);
//        } else {
//            minMaxConsumer.accept(list.get(0), list.get(1));
//        }
//    }

//    public int Min(int[]array) {
//        int min = array[0];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//    }

}
