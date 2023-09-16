<?php

session_start();
if(!$_SESSION['user_name']){

    //redirect to login
    ?>

    <script type="text/javascript">
        window.location.href = 'login-form.php'
    </script>
    <?php
}

echo "<h2>Hello ".$_SESSION["user_name"]. "</h2>";
?>


<a href="logout.php">Logout</a>