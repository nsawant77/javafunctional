package example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


interface interf {
    public int square (int n);
}

public class Arrange {

    public static void main(String[] args) {

        interf n = n1 -> n1*n1;
        System.out.println(n.square(8));

        List<String> list = new ArrayList<>();
        list.add("a:b");
        list.add("c:d");
        list.add("e:f");
        list.add("g:h");

        System.out.println(list);

        Map<String, String> map = list.stream()
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(s-> s[0], s->s[1]))
                ;
        System.out.println(map);
    }
}
