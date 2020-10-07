import java.util.*

public class StactGen<T>{
int size =0;

List <T> stackelement = new ArrayList<T>();

public void push(T item){
    stackelement.add(item);
    size++;
}

public T top(){
return stack.get(size);
}


public void pop(){
 size = (size < 0)?"No items in stack":0;

 System.out.println(size);


}


}




