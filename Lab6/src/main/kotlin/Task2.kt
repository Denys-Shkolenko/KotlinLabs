import org.matheclipse.core.eval.ExprEvaluator
import java.io.File

fun main() {
    val evaluator = ExprEvaluator()

    // Step 1: Read equations from a file
    val equations = File("src/main/resources/EquationsTask2.txt").readLines()

    // Step 2: Read variables from the console
    val variableNames = listOf("a", "b", "c", "y")
    val variables = readVariables(variableNames)

    // Step 3: Set variables for evaluator
    for ((name, value) in variables) {
        evaluator.defineVariable(name, value)
    }

    // Step 4: Evaluate and display results
    for (equation in equations) {
        val result = solveForX(evaluator, equation)
        println("For $equation, x = $result")
    }
}

fun solveForX(evaluator: ExprEvaluator, equation: String): String {
    val rawResult = evaluator.eval("Solve[$equation, x]").toString()
    // Extract the solutions from the raw result
    val solutions = rawResult.split(",").map {
        it.split("->").last().trim(' ', '{', '}')
    }
    return solutions.joinToString(", ")
}

