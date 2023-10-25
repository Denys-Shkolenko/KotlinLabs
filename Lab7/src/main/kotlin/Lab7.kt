/**
 * This class contains utility functions related to mathematical computations.
 */
class Lab7 {

    /**
     * Computes the nth Fibonacci number.
     *
     * @param n The position of the desired Fibonacci number.
     * @return The nth Fibonacci number.
     */
    fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

    /**
     * Displays the first `count` Fibonacci numbers.
     *
     * @param count The number of Fibonacci numbers to display.
     */
    fun displayFibonacciNumbers(count: Int) {
        for (i in 0 until count) {
            println("$i - ${fibonacci(i)}")
        }
    }

    /**
     * Computes the factorial of the given number.
     *
     * @param n The number whose factorial is to be computed.
     * @return The factorial of `n`.
     */
    fun factorial(n: Int): Int {
        return when (n) {
            0 -> 1
            else -> n * factorial(n - 1)
        }
    }

    /**
     * Computes the number of decimal digits in the given number.
     *
     * @param n The number whose digits are to be counted.
     * @return The number of decimal digits in `n`.
     */
    fun countDigits(n: Int): Int {
        return if (n == 0) 1 else {
            var num = n
            var count = 0
            while (num > 0) {
                count++
                num /= 10
            }
            count
        }
    }

    /**
     * Safely reads an integer input from the user. Returns `null` if the input is not a valid integer.
     *
     * @return The integer input from the user or `null` if the input is invalid.
     */
    fun safeReadInt(): Int? {
        return readLine()?.toIntOrNull()
    }
}
