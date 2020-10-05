#include <iostream>

int main(){


	double number;
	double result = 0;
for(int i = 0; i< 5; i++){
	std::cout<<"Enter number $" <<i+1<<std::endl;
	std::cin>>number;
	result +=number;

}

std::cout<<"Mean value => " <<result/5<<std::endl;
}
