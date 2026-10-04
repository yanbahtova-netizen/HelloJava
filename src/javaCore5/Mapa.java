package javaCore5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String line;
        Map<String, Long> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            String name = parts[0];
            long zalupa = Long.parseLong(parts[1]);

//            if (map.containsKey(name)) {
//                long zalupaOld = map.get(name);
//                zalupa = zalupa + zalupaOld;
//            }
//            map.put(name, zalupa);

            map.merge(name, zalupa, Long::sum);
        }
        return map;
    }
}
