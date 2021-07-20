class StringChecker {
    /*
    Task states "if the first letter of that string is found in the range [A-Z]"
    Unclear if this includes a-z & A-Z, so have added an optional boolean to check in the lowercase range too
     */

    fun checkForLetterFirst(inputString: String, checkForLowerCase: Boolean = false) : Boolean {
        return when {
            inputString.isEmpty() -> {
                false
            }
            checkForLowerCase -> {
                inputString[0].isLetter()
            }
            else -> {
                inputString[0].isLetter() && !inputString[0].isLowerCase()
            }
        }
    }
}