//writing a file
const fs = require("fs")
fs.writeFile("newfile.txt", "This is the new text file created.", (error)=>{
    if(error){
        console.log("error", error)
    }
})

//appending a file
fs.appendFile("newfile.txt", "This is appended text", (error)=>{
    if(error){
        console.log("error", error)
    }
})

//opening a file
fs.open("file2.txt", "w", (err, file)=>{
    if(err) throw err;
    console.log("Saved File2!");
    
})


//reading a file
fs.readFile("file2.txt", "utf-8", (err, file)=>{
    if(err) throw err;
    console.log("Saved file!", file);
})


//renaming a file
fs.rename("file2.txt", "renamedfile.txt", (err)=>{
    if(err) throw err;
    console.log("This file is renamed from file2.txt to renamed.txt");
})

//delete file from sever
fs.unlink("new.txt", (err)=>{
    if(err) throw err;
})


//to perform above same operations in synchronous way
let res = fs.appendFileSync("syncFile.txt", "utf-8");
console.log(res);

//readFileSync 
let resp = fs.readFileSync("newfile.txt", "utf-8")
console.log(resp)
 
// renameSync
let ans = fs.renameSync("syncFile.txt", "renamedSyncFile.txt");
console.log(ans)

//unlinkSync
let del = fs.unlinkSync("abcd.txt");
console.log(del);
