
class Task1{

public static void main(String args[]){
 
	//Gen<Integer> name = new Gen<>();
	Gen<String> n = new Gen<>(); 


	System.out.println(n.name("Seth"));



}


}

class Gen<T>{


      public T name(T name){
	return name;
	}
}






class Person{
private String name;

public void  setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
}
