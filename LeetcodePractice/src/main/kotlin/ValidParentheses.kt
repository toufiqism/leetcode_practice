import java.util.Stack

fun isValidParentheses(s: String): Boolean {
    val stack = Stack<Char>()
    val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        if (char in matchingBrackets) {
            if (stack.isEmpty() || stack.pop() != matchingBrackets[char]) {
                return false
            }
        } else {
            stack.push(char)
        }
    }
    return stack.isEmpty()

}