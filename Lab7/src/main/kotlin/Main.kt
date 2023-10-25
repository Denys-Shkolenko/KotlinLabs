fun main() {
    val lab = Lab7()

    // Task 1
    println("Enter the number of Fibonacci numbers to display:")
    var count: Int?
    do {
        count = lab.safeReadInt()
        if (count == null || count < 0) {
            println("Please enter a valid non-negative number:")
        }
    } while (count == null || count < 0)
    lab.displayFibonacciNumbers(count)

    // Task 2
    println("Enter a number to compute its factorial:")
    var numForFactorial: Int?
    do {
        numForFactorial = lab.safeReadInt()
        if (numForFactorial == null || numForFactorial < 0) {
            println("Please enter a valid non-negative number:")
        }
    } while (numForFactorial == null || numForFactorial < 0)
    println("Factorial of $numForFactorial: ${lab.factorial(numForFactorial)}")

    // Task 3
    println("Enter a number to compute the number of its decimal digits:")
    var numForDigits: Int?
    do {
        numForDigits = lab.safeReadInt()
        if (numForDigits == null || numForDigits < 0) {
            println("Please enter a valid non-negative number:")
        }
    } while (numForDigits == null || numForDigits < 0)
    println("Number of decimal digits in $numForDigits: ${lab.countDigits(numForDigits)}")
}
