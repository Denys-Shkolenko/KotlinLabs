import java.util.*

/**
 * Reads a series of numbers from the standard input, each associated with a given variable name.
 *
 * The function prompts the user to enter a value for each variable name specified in the [variables] list.
 * It will keep prompting for a valid double number until the user provides one.
 *
 * @param variables A list of variable names for which values should be read from the input.
 * @return A map where the keys are the variable names and the values are the numbers entered by the user.
 *
 * @throws InputMismatchException if the user provides a non-number input for a variable.
 *         (Note: The function handles this exception internally, so it won't actually be thrown to the caller.)
 */
fun readVariables(variables: List<String>): Map<String, Double> {
    val scanner = Scanner(System.`in`)
    val values = mutableMapOf<String, Double>()

    for (variable in variables) {
        while (true) {
            try {
                print("Enter $variable: ")
                val value = scanner.nextDouble()
                values[variable] = value
                break
            } catch (e: InputMismatchException) {
                println("Invalid input for $variable. Please enter a valid number.")
                scanner.nextLine() // Clear the invalid input from the scanner
            }
        }
    }

    return values
}
