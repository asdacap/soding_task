<?php

$dp = [1, 1, 0];

$i = 2;
$total = 0;
while(true) {
    $cur = $dp[($i-1+3)%3] + $dp[($i-2+3)%3];
    if($cur > 4000000) break;

    if ($cur%2 == 0){
        $total += $cur;
    }

    $dp[$i%3] = $cur;
    $i++;
}

echo $total;

