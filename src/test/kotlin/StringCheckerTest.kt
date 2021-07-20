import junit.framework.TestCase

class StringCheckerTest : TestCase() {

    private val stringChecker = StringChecker()

    fun testCheckForLetterFirst() {
        assertTrue(stringChecker.checkForLetterFirst("Test"))
        assertFalse(stringChecker.checkForLetterFirst("test"))
        assertTrue(stringChecker.checkForLetterFirst("test", true))

        assertFalse(stringChecker.checkForLetterFirst("0Test"))
        assertFalse(stringChecker.checkForLetterFirst("0test"))
        assertFalse(stringChecker.checkForLetterFirst(""))
        assertFalse(stringChecker.checkForLetterFirst(" Test"))
        assertFalse(stringChecker.checkForLetterFirst("?test"))

        assertFalse(stringChecker.checkForLetterFirst("0Test", true))
        assertFalse(stringChecker.checkForLetterFirst("0test", true))
        assertFalse(stringChecker.checkForLetterFirst("", true))
        assertFalse(stringChecker.checkForLetterFirst(" Test", true))
        assertFalse(stringChecker.checkForLetterFirst("?test", true))
    }
}