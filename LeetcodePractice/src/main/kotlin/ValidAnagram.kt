fun isAnagram(wordToCheck: String, givenText: String): Boolean {
    if (wordToCheck.length != givenText.length)
        return false
    return wordToCheck.lowercase().toCharArray().sorted() == givenText.lowercase().toCharArray().sorted()
}

