import java.lang.Math;
import java.util.*;

public class Task1{


	public static void main(String[] args){
	Set<Integer> element = new TreeSet<Integer>();
	
	for(int i = 0; i < 6; i++){
	int rand = (int)(Math.random()*50);
	element.add(rand);
	}


	System.out.println(element);
}
}
