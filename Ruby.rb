dp = [1, 1, 0]

i = 2
total = 0
while (true) do
  cur = dp[(i-1+3)%3] + dp[(i-2+3)%3]
  break if cur > 4000000

  if (cur%2 == 0)
    total += cur
  end

  dp[i%3] = cur
  i = i+1
end

puts total

