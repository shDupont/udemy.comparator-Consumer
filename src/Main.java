import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1900.00));
        list.add(new Product("Tablet", 700.00));
        list.add(new Product("CD", 70.00));

        Function<Product,String> func = product -> product.getName().toUpperCase();

        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();


        names.forEach(System.out::println);



    }
}