import java.util.*;
public class ExceptionHandling {

    public static void main (String[] args){
    List<Trade> trades = new ArrayList<>();

        trades.add(new Trade(30,"101","APPL",500));
        trades.add(new Trade(60,"104","TURNTABL",300));
        trades.add(new Trade(40,"101","TCL",100));
        trades.add(new Trade(50,"103","LG",200));

        Collections.sort(trades);
        int index =0;

        for(Trade trade : trades){
            if(trades.get(index) == trades.get(index++))
            System.out.println(trade);
        }
    }

}
