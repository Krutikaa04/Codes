decision making statements-
1) if....else
2) if...else if....else if....else
3) switch case

if...else //print adult or not
#include <iostream>
using namespace std;
int main() {
    int n;
    cout<<"Enter age: ";
    cin>>n;
    if(n>=18) {
        cout<<"\n Adult";
    }
    else {
        cout<<"\n Not an adult";
    }
    return 0;
}

if...else if
#include <iostream>
using namespace std;
int main() {
    if(condition) {
        //code
    }
    else if (condition) {
        //code
    }
    else if (condition) {
        //code
    }
    else{
        //code
    }
    return 0;
}

switch case
#include <iostream>
using namespace std;
int main() {
    int n; //declaration
    switch(n) {
        case 1:
        //code
        break;
        case 2:
        //code
        continue;
        case 3:
        //code
        break;
        defaut:
        //code
        break;
    }
    return 0;
}

break --> used to stop the execution of current case and move to the next case in a consecutive order
continue --> used to skip the current case and move on to the next case


loops and its types:
1) for loop
2) while loop
3) do-while loop

for loop //printing numbers from 1 to 10
#include <iostream>
using namespace std;
int main() {
    for(int n =1; n<=10; n++) {
        cout<<n<<"\n";
    }
    return 0;
}

while loop 
#include <iostream>
using namespace std;
int main() {
    int n = 1;
    while(n<=10) {
        cout<<n<<"\n";
        n++;
    }
    return 0;
}

do-while loop
#include <iostream>
using namespace std;
int main() {
    int n =1;
    do {
        cout<<n<<"\n";
        n++;
    }
    while(n<=10);
    return 0;
}
