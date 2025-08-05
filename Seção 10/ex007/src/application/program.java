package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("bob");
        list.add("Ana");
        list.add(2, "Marco");
        //list.remove("Ana");
        //list.remove(1);
        //list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("Index of bob: "+ list.indexOf("bob"));
        System.out.println("Index of Rafael: "+ list.indexOf("Rafael"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);

        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
     }
}