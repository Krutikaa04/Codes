<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body>
    <?php
        #echo is used to print anything on web browser
        #print can also be used for the same
        #you can write html in php file but php can't be written in html file

        echo "<h1>Welcome to PHP</h1>";
        echo "<br>";
        print "<p>This is a paragraph</p>";

        #a $ sign is used before any variable name
        $test = "this is a demo test data";
        echo "<h3>$test</h3>";

        #another method
        define("CompanyName", "XYZ Enterprises");
        echo CompanyName;


        #if , else if, else 
        if(condition) {
            #code
        }
        else if(condition){
            #code
        }
        else{
            #code
        }


        #switch case
        $num = 1;
        switch($num){
            case 1:
                //code;
                break;

            case 2:
                //code;
                break;

            default:
            //code;
        }


        # loops in php
        for($num = 1; $num <= 10; $num++){
            echo "$num";
        }

        $num = 10;
        while($num >0){
            echo "$num";
            $num --;
        }

        $num = 1;
        do{
            echo "$num";
            $num ++;
        }
        while($num <= 5);


        # foreach loop
        foreach($userData as $value){
            echo $value;
        }


        #arrays in php
        $arr = array(1, 2, 3, 4, 5);
        $arr2 = [1, 2, 3, 4, 5];
        echo "This is from array 1:", " ";
        for($i = 0; $i<count($arr); $i++){
            echo $arr[$i];
        }
        echo "<br>";
        echo "This is from array 2:", " ";
        for($j = 0; $j<count($arr2); $j ++){
            echo $arr2[$j];
        }


        $person = array(
            'name'=> 'John',
            'age'=> 19,
            'email'=> 'john123@gmail.com',
            'company'=> array(
                "name"=> "XYZ Enterprises",
                "address"=> "Mumbai"
            )
            );
            echo "<br>";
            echo $person["name"];
            echo "<br>";

            foreach($person as $key){                  #key concept
                if(is_array($key)){
                    print_r($key);
                    echo "<br>";
                    foreach($key as $subkey){           #subkey concept
                        echo $subkey; 
                    }
                }
                else{
                    echo $key;
                }
            }

            
    ?>
</body>
</html>