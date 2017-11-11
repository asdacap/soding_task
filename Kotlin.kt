import java.util.*
import java.io.*

fun main(args: Array<String>) {
    val dp = arrayOf(1L, 1L, 0L)

    var i = 2
    var total = 0L
    while(true) {
        val cur: Long = dp[(i-1+3)%3] + dp[(i-2+3)%3]
        if(cur > 4000000) break

        if (cur%2 == 0L){
            total += cur
        }

        dp[i%3] = cur
        i = i+1
    }

    System.out.println(total)
}

