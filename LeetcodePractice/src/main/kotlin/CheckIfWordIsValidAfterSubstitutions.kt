import java.util.Stack

fun isValidString(s: String): Boolean {
    val stack = Stack<Char>()
    for (i in s.indices) {
        val ch = s.toCharArray()[i]
        if (ch == 'c') {
            if (stack.size < 2 || stack.pop() != 'b' || stack.pop() != 'a') {
                return false
            }
        } else {
            stack.push(ch)
        }
    }
    return stack.size == 0
}