

rightShift(80, 3);
rightShift(-24, 2);
rightShift(-5, 1);
rightShift(4666, 6);
rightShift(3777, 6);
rightShift(-512, 10);


function rightShift(og, power){
    var answer = og/Math.pow(2, power);
    console.log(Math.round(answer - 0.5));
}