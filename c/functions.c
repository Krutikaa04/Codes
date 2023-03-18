Functions -
 Functions are declared first and then called. you can define the function below main too
 but declaration should be done above main only  
 
 //example 1


#include<stdio.h>
 
 void func(){   //declaraing function 1
    int i;
    int j;

    for(i=0;i<10;i++){
        for(j=10;j>i;j--){
            printf("* ");
        }
        printf("\n")
    }
}

void prime(){      //declaraing function 2
    
    printf("\n Prime function called");
}

void num() {
    printf("\n This is a function for numbers");
}

void main(){
    func();     //calling function 1
    prime();    //calling function 2
}
