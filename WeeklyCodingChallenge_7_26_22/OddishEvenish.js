var x = 43;
var y = 373;
var z = 4433;

isItOddish(x);
isItOddish(y);
isItOddish(z);


function isItOddish(int1){
    var total = 0;
    const astring = int1.toString();
    for(const x of astring){
        total += parseInt(x);
    }
    let result = total % 2;
    if(result == 0){
        console.log("Evenish")
    } 
    else{
        console.log("Oddish");
    }
}