#include <iostream>

using namespace std;

int main(){

int number;

cout << "Please Enter Number $ ";

cin>>number;

if(number % 2 == 0){
for(int i = 0; i < 20; i++){
cout<< i+1 <<" x  "<<number<<" = " << number * ( i + 1)<<endl;
}

}else if(number % 2 == 1){
 for(int j =0; j < 30; j++){
 if(j % number != 0){
 cout<< j << endl;
 }
 }
}


}



