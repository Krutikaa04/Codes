<?php

session_start();

$email = $_POST["email"];
$password = $_POST["password"];

$db_email = "john@gmail.com";
$db_password = "12345";

if($email == $db_email && $password == $db_password){
    $_SESSION["user_name"] = "John";
    $_SESSION["user_email"]= $email;
    $_SESSION["user_pass"]= $password;

    //step of redirecting
    echo "<script>window.location.href = 'dashboard.php'</script>";

}else {
    ?>

    <script type="text/javascript">
        window.location.href = "login-form.php"
    </script>
    <?php
    echo "Invalid Credentials!";
}

?>