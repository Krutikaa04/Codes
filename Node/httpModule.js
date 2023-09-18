const http = require('http');
var server = http.createServer((req, res)=>{
    res.write("Hello from this side");
    res.write(JSON.stringify({name:"Krutika"}));


    //Routing through Node

    let url = req.url;
    console.log("url", url);
    if(url == "/"){
        res.write("I am default page");
    }else if(url == "/home"){
        res.write("I am home page");
    }else if(url == "/about"){
        res.write("I am about page");
    }else if(url == "/contact"){
        res.write("I am contact page");
    }
    res.end();
})

server.listen(3000, ()=>{
    console.log("Server is running on port 3000");
})





