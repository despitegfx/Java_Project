import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args ){
        List <Laptops> laptops = new ArrayList<>();
        laptops.add(new Laptops("Acer","Red"));
        laptops.add(new Laptops("Del","Green"));
        laptops.add(new Laptops("HP","Yellow"));

        Collections.sort(laptops);

        for(Laptops lap : laptops){

            System.out.println(lap.getBrand());
        }
    }
}
