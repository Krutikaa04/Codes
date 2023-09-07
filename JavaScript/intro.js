
// 1) inline js 
// written in script tag at the end of body in body itself
//  <script>
// // the code of js
// </script> 


// 2) external js 
//  in head tag, write script tag with link of js file 
//  <script src="path of js file"></script>


// Write something in JS

    document.write("<p>Hello JS</p>");    //this will be displayed on the browser
    console.log("Hello JS");      //this will be displayed in the terminal



//  Comments in JS 
// <script>
//     //single line comment
//     /* multiline comment
//     */
// </script>


// Variables in JS
// var let and const


// If/Else if/ else Syntax 
if(condition){
    //code
}
else if(condition){
    //code
}
else{
    //code
}


// Switch case Syntax
var expression;
switch (expression) {
    case 1:
        //code
        break;

    default:
        //code
        break;
}


// For loop Syntax

for(var i = 1; i <=10; i++){
    //code
}


// while loop Syntax
while(condition){
    //code
}


// do while loop Syntax
do{
    //code
}
while(condition);


// Functions in JS
// without parameter and no return value
function functionName() {
    //code
}

// with parameter and no return value
function functionName(p1, p2){
    //code
}

// with parameter and return value
function functionName(p1, p2){
    //code
    return "some value";
}


// Objects in JS
const person = {
    firstName: "John",
    lastName: "Doe"
};
alert(person.firstName);   //alert is used to bring an alert box up there on the browser.


// Events in JS
// clicking event -->  onclick
<button onclick="functionName()">Click Me</button>

// likewise (ondblclick , onmouseover, onmouseout, onkeypress, onkeyup, onload, onfocus, onsubmit, etc)


// How to target DOM
document.getElementById("name of id");
document.getElementsByClassName("name of class");
document.getElementsByTagName("tag name");


// 1- innerHTML = to get/set html in an element
// 2- innerText = to get/set text in an element
// 3- value = to get/set value in an input


//JS strings
let text = "apple";
let length = text.length;     //length of string
document.write(length);

// slicing --> There are 3 methods for extracting a part of a string:  slice, substring, substr
// slice(start position, end position);
let fruits = "apple, banana, mango";
let sliced = fruits.slice(5, 14);
document.write(sliced);

// replace --> replaces the first parameter with second parameter
let sentence = "I had apple and mango for breakfast";
let final = sentence.replace("apple", "watermelon");
document.write(final); 

// replaceAll() it replaces first parameter with second parameter in whole sentence however times it happens to be in it


// A string is converted to upper case with toUpperCase()

// A string is converted to lower case with toLowerCase()

// concat() joins two or more strings