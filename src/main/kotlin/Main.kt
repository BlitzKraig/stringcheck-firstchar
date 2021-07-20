fun main() {
    val stringChecker = StringChecker()

    var inputString = "Test"
    println("$inputString starts with uppercase letter: ${stringChecker.checkForLetterFirst(inputString)}")

    inputString = "test"
    println("$inputString starts with uppercase letter: ${stringChecker.checkForLetterFirst(inputString)}")
    println("$inputString starts with uppercase or lowercase letter: ${stringChecker.checkForLetterFirst(inputString, true)}")

    inputString = "0Test"
    println("$inputString starts with uppercase letter: ${stringChecker.checkForLetterFirst(inputString)}")

    if(stringChecker.checkForLetterFirst("Test")){
        println("You should see this string")
    } else {
        println("You shouldn't see this string")
    }

    println("See StringCheckerTest for unit tests & more examples")

}