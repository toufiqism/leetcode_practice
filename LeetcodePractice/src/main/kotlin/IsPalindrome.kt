fun isPalindrome(x: Int): Boolean {

    var numToProcess: Int = x
    var reversedNum = 0

    while (numToProcess > 0) {
        val digit = numToProcess % 10
        reversedNum = (reversedNum * 10) + digit
        numToProcess /= 10
    }

    return x == reversedNum
}
