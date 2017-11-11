var dp = [1, 1, 0];

var i = 2;
var total = 0;
while(true) {
    var cur = dp[(i-1+3)%3] + dp[(i-2+3)%3];
    if(cur > 4000000) break;

    if (cur%2 == 0){
        total += cur;
    }

    dp[i%3] = cur;
    i++;
}

console.log(total);

