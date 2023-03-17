//decision making statements
if
if ... else 
if .. else if ... else
switch()
 
 //if
if(condition && condition){
    //code

}


//if.....else 
if(condition){
    //code

}
else{
    //code 
}

//if....else if
if(condition1){

}
else if(condition ){

}
else if(condition){

}

.....
else{

}

//example
#include<stdio.h>

void main(){
    int age;
    printf("\nEnter the age: ");
    scanf("%d", &age);

    if(age>=18){
        printf("\n Person is eligible to vote");
    }
    else{

        printf("\nPerson is not eligible");
    }
}

Sample Question -
Give marks of 4 subjects English, Maths, Science, History (out of 100)
Calculate average (float)

>90 = Grade A 
>80 and <=89 = grade B 
>70 and <=79 = Grade C
>60 and <=69 = Grade D 
<60 = Grade E 

Hint -- Use if....else if 


//switch case
switch(a){

    case 'a':
        printf("/n The month is ");
        break;
    case 'b':
        printf()
        break;
    case 'c':
        break;
    case 'd':
        break;
    default:
        //code
        break;
}

//example
#include<stdio.h>

void main(){
    int month;
    printf("\nEnter the month number -  ");
    scanf("%d", &month);

    switch(month){
        case 1:
            printf("\n Month is January");
            break;
        case 2:
            printf("\n Month is February");
            break;
        default:
            printf("Invalid");

    }
}