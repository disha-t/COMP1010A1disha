package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import doNotModify.CSVReader;
import doNotModify.Graded;
import doNotModify.Order;
import toDo.ToDo;

public class ToDoTests {
    //add tests for functions inside ToDo.java
    @BeforeAll
    public static void init() {
        ToDo.words = CSVReader.read("data/words.txt");
    }

    @Test
	@Graded(description = "isEnglishLetter", marks = 5)
	@Order(1)
    public void testIsEnglishLetter() {
        assertTrue(ToDo.isEnglishLetter('a'));
        assertTrue(ToDo.isEnglishLetter('z'));
        assertTrue(ToDo.isEnglishLetter('A'));
        assertTrue(ToDo.isEnglishLetter('Z'));
        assertFalse(ToDo.isEnglishLetter('0'));
        assertFalse(ToDo.isEnglishLetter('9'));
        assertFalse(ToDo.isEnglishLetter(' '));
        assertFalse(ToDo.isEnglishLetter('!'));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "isVowel", marks = 5)
	@Order(2)
    public void testIsVowel() {
        assertTrue(ToDo.isVowel('A'));
        assertTrue(ToDo.isVowel('E'));
        assertTrue(ToDo.isVowel('I'));
        assertTrue(ToDo.isVowel('O'));
        assertTrue(ToDo.isVowel('U'));
        assertTrue(ToDo.isVowel('a'));
        assertTrue(ToDo.isVowel('e'));
        assertTrue(ToDo.isVowel('i'));
        assertTrue(ToDo.isVowel('o'));
        assertTrue(ToDo.isVowel('u'));
        assertFalse(ToDo.isVowel('B'));
        assertFalse(ToDo.isVowel('C'));
        assertFalse(ToDo.isVowel('D'));
        assertFalse(ToDo.isVowel('F'));
        assertFalse(ToDo.isVowel('G'));
        assertFalse(ToDo.isVowel('H'));
        assertFalse(ToDo.isVowel('J'));
        assertFalse(ToDo.isVowel('K'));
        assertFalse(ToDo.isVowel('L'));
        assertFalse(ToDo.isVowel('M'));
        assertFalse(ToDo.isVowel('N'));
        assertFalse(ToDo.isVowel('P'));
        assertFalse(ToDo.isVowel('Q'));
        assertFalse(ToDo.isVowel('R'));
        assertFalse(ToDo.isVowel('S'));
        assertFalse(ToDo.isVowel('T'));
        assertFalse(ToDo.isVowel('V'));
        assertFalse(ToDo.isVowel('W'));
        assertFalse(ToDo.isVowel('X'));
        assertFalse(ToDo.isVowel('Y'));
        assertFalse(ToDo.isVowel('Z'));
        assertFalse(ToDo.isVowel('b'));
        assertFalse(ToDo.isVowel('c'));
        assertFalse(ToDo.isVowel('d'));
        assertFalse(ToDo.isVowel('f'));
        assertFalse(ToDo.isVowel('g'));
        assertFalse(ToDo.isVowel('h'));
        assertFalse(ToDo.isVowel('j'));
        assertFalse(ToDo.isVowel('k'));
        assertFalse(ToDo.isVowel('l'));
        assertFalse(ToDo.isVowel('m'));
        assertFalse(ToDo.isVowel('n'));
        assertFalse(ToDo.isVowel('p'));
        assertFalse(ToDo.isVowel('q'));
        assertFalse(ToDo.isVowel('r'));
        assertFalse(ToDo.isVowel('s'));
        assertFalse(ToDo.isVowel('t'));
        assertFalse(ToDo.isVowel('v'));
        assertFalse(ToDo.isVowel('w'));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "isConsonant", marks = 5)
	@Order(3)
    public void testisConsonant() {
        assertTrue(ToDo.isConsonant('B'));
        assertTrue(ToDo.isConsonant('C'));
        assertTrue(ToDo.isConsonant('D'));
        assertTrue(ToDo.isConsonant('F'));
        assertTrue(ToDo.isConsonant('G'));
        assertTrue(ToDo.isConsonant('H'));
        assertTrue(ToDo.isConsonant('J'));
        assertTrue(ToDo.isConsonant('K'));
        assertTrue(ToDo.isConsonant('L'));
        assertTrue(ToDo.isConsonant('M'));
        assertTrue(ToDo.isConsonant('N'));
        assertTrue(ToDo.isConsonant('P'));
        assertTrue(ToDo.isConsonant('Q'));
        assertTrue(ToDo.isConsonant('R'));
        assertTrue(ToDo.isConsonant('S'));
        assertTrue(ToDo.isConsonant('T'));
        assertTrue(ToDo.isConsonant('V'));
        assertTrue(ToDo.isConsonant('W'));
        assertTrue(ToDo.isConsonant('X'));
        assertTrue(ToDo.isConsonant('Y'));
        assertTrue(ToDo.isConsonant('Z'));
        assertTrue(ToDo.isConsonant('b'));
        assertTrue(ToDo.isConsonant('c'));
        assertTrue(ToDo.isConsonant('d'));
        assertTrue(ToDo.isConsonant('f'));
        assertTrue(ToDo.isConsonant('g'));
        assertTrue(ToDo.isConsonant('h'));
        assertTrue(ToDo.isConsonant('j'));
        assertTrue(ToDo.isConsonant('k'));
        assertTrue(ToDo.isConsonant('l'));
        assertTrue(ToDo.isConsonant('m'));
        assertTrue(ToDo.isConsonant('n'));
        assertTrue(ToDo.isConsonant('p'));
        assertTrue(ToDo.isConsonant('q'));
        assertTrue(ToDo.isConsonant('r'));
        assertTrue(ToDo.isConsonant('s'));
        assertTrue(ToDo.isConsonant('t'));
        assertTrue(ToDo.isConsonant('v'));
        assertTrue(ToDo.isConsonant('w'));
        assertTrue(ToDo.isConsonant('x'));
        assertTrue(ToDo.isConsonant('y'));
        assertTrue(ToDo.isConsonant('z'));
        assertFalse(ToDo.isConsonant('A'));
        assertFalse(ToDo.isConsonant('E'));
        assertFalse(ToDo.isConsonant('I'));
        assertFalse(ToDo.isConsonant('O'));
        assertFalse(ToDo.isConsonant('U'));
        assertFalse(ToDo.isConsonant('a'));
        assertFalse(ToDo.isConsonant('e'));
        assertFalse(ToDo.isConsonant('i'));
        assertFalse(ToDo.isConsonant('o'));
        assertFalse(ToDo.isConsonant('u'));
        assertFalse(ToDo.isConsonant('0'));
        assertFalse(ToDo.isConsonant('9'));
        assertFalse(ToDo.isConsonant(' '));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "testCountVowels", marks = 5)
	@Order(4)
    public void testCountVowels() {
        assertEquals(9, ToDo.countVowels("Superman Always Wins In The End"));
        assertEquals(1, ToDo.countVowels("Spmn Alwys Wns n Th nd"));
        assertEquals(10, ToDo.countVowels("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(0, ToDo.countVowels(""));
        assertEquals(0, ToDo.countVowels("    "));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "contains", marks = 5)
	@Order(5)
    public void testContains() {
        String[] arr = {"a", "b", "c", "d", "e"};
        assertTrue(ToDo.contains(arr, "a"));
        assertTrue(ToDo.contains(arr, "b"));
        assertTrue(ToDo.contains(arr, "c"));
        assertTrue(ToDo.contains(arr, "d"));
        assertTrue(ToDo.contains(arr, "e"));
        assertFalse(ToDo.contains(arr, "f"));
        assertFalse(ToDo.contains(arr, "g"));
        assertFalse(ToDo.contains(arr, "h"));
        assertFalse(ToDo.contains(arr, "i"));
        assertFalse(ToDo.contains(arr, "j"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }


    @Test
	@Graded(description = "isValid", marks = 5)
	@Order(6)
    public void testIsValid() {
        assertTrue(ToDo.isValid("SUPER", 4));
        assertTrue(ToDo.isValid("FANTASTIC", 8));
        assertFalse(ToDo.isValid("FANTASTIC", 20));
        assertFalse(ToDo.isValid("INCREDIBLH", 5));
        assertTrue(ToDo.isValid("fantastic", 5));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "isPalindrome", marks = 5)
	@Order(7)
    public void testIsPalindrome() {
        assertTrue(ToDo.isPalindrome("a"));
        assertTrue(ToDo.isPalindrome("aa"));
        assertTrue(ToDo.isPalindrome("aba"));
        assertTrue(ToDo.isPalindrome("RACECAR"));
        assertTrue(ToDo.isPalindrome("RAcECaR"));
        assertTrue(ToDo.isPalindrome("abba"));
        assertTrue(ToDo.isPalindrome("abcba"));
        assertFalse(ToDo.isPalindrome("ab"));
        assertFalse(ToDo.isPalindrome("abc"));
        assertFalse(ToDo.isPalindrome("abcd"));
        assertFalse(ToDo.isPalindrome("abcde"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "containsDuplicateLetter", marks = 5)
	@Order(8)
    public void testContainsDuplicateLetter() {
        assertFalse(ToDo.containsDuplicateLetter("a"));
        assertTrue(ToDo.containsDuplicateLetter("aa"));
        assertFalse(ToDo.containsDuplicateLetter("ab"));
        assertTrue(ToDo.containsDuplicateLetter("aba"));
        assertTrue(ToDo.containsDuplicateLetter("cbba"));
        assertTrue(ToDo.containsDuplicateLetter("acdebfghijb"));
        assertTrue(ToDo.containsDuplicateLetter("ACDEBFGHIJB"));
        assertTrue(ToDo.containsDuplicateLetter("abcbda"));
        assertTrue(ToDo.containsDuplicateLetter("abcbdee"));
        assertFalse(ToDo.containsDuplicateLetter("abcde"));
        assertFalse(ToDo.containsDuplicateLetter("abcdef"));
        assertFalse(ToDo.containsDuplicateLetter("ABCDEF"));
        assertTrue(ToDo.containsDuplicateLetter("abcADF"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "isAscending", marks = 5)
	@Order(9)
    public void testIsAscending() {
        assertTrue(ToDo.isAscending("a"));
        assertTrue(ToDo.isAscending("ab"));
        assertTrue(ToDo.isAscending("abc"));
        assertTrue(ToDo.isAscending("abcd"));
        assertTrue(ToDo.isAscending("abcde"));
        assertTrue(ToDo.isAscending("abcdef"));
        assertFalse(ToDo.isAscending("ba"));
        assertFalse(ToDo.isAscending("bac"));
        assertFalse(ToDo.isAscending("bacd"));
        assertFalse(ToDo.isAscending("bacde"));
        assertFalse(ToDo.isAscending("bacdef"));
        assertFalse(ToDo.isAscending("abcdefe"));
        assertTrue(ToDo.isAscending("abcdee"));
        assertTrue(ToDo.isAscending("mqttz"));
        assertFalse(ToDo.isAscending("mqtptz"));
        assertTrue(ToDo.isAscending("AbcDEf"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "isDescending", marks = 5)
	@Order(10)
    public void testIsDescending() {
        assertTrue(ToDo.isDescending("a"));
        assertTrue(ToDo.isDescending("ba"));
        assertTrue(ToDo.isDescending("cba"));
        assertTrue(ToDo.isDescending("dcba"));
        assertTrue(ToDo.isDescending("edcba"));
        assertTrue(ToDo.isDescending("fedcba"));
        assertTrue(ToDo.isDescending("fffffff"));
        assertFalse(ToDo.isDescending("ffffffg"));
        assertFalse(ToDo.isDescending("zqgcgba"));
        assertFalse(ToDo.isDescending("ab"));
        assertFalse(ToDo.isDescending("abc"));
        assertFalse(ToDo.isDescending("abcd"));
        assertFalse(ToDo.isDescending("abcde"));
        assertFalse(ToDo.isDescending("abcdef"));
        assertTrue(ToDo.isDescending("FedCBa"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "isSorted", marks = 5)
	@Order(11)
    public void testIsSorted() {
        assertTrue(ToDo.isSorted("a"));
        assertTrue(ToDo.isSorted("ab"));
        assertTrue(ToDo.isSorted("abc"));
        assertTrue(ToDo.isSorted("abcd"));
        assertTrue(ToDo.isSorted("abcde"));
        assertTrue(ToDo.isSorted("abcdef"));
        assertTrue(ToDo.isSorted("ba"));
        assertFalse(ToDo.isSorted("bac"));
        assertFalse(ToDo.isSorted("bacd"));
        assertFalse(ToDo.isSorted("bacde"));
        assertFalse(ToDo.isSorted("bacdef"));
        assertTrue(ToDo.isSorted("ab"));
        assertTrue(ToDo.isSorted("abc"));
        assertTrue(ToDo.isSorted("abcd"));
        assertTrue(ToDo.isSorted("abcde"));
        assertTrue(ToDo.isSorted("abcdef"));
        assertFalse(ToDo.isSorted("aba"));
        assertFalse(ToDo.isSorted("abcdefd"));
        assertFalse(ToDo.isSorted("edcbca"));
        assertFalse(ToDo.isSorted("edbcac"));
        assertFalse(ToDo.isSorted("abcdea"));
        assertTrue(ToDo.isSorted("cba"));
        assertTrue(ToDo.isSorted("dcba"));
        assertTrue(ToDo.isSorted("edcba"));
        assertTrue(ToDo.isSorted("feeeeeeedcba"));
        assertTrue(ToDo.isSorted("FEeeeeeeDCba"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    @Test
	@Graded(description = "checkIfPossible", marks = 5)
	@Order(12)
    public void testCheckIfPossible() {
        assertTrue(ToDo.checkIfPossible("SUPER", "SUPER"));
        assertTrue(ToDo.checkIfPossible("fantastic", "TACT"));
        assertFalse(ToDo.checkIfPossible("tact", "fantastic"));
        assertFalse(ToDo.checkIfPossible("tactic", "tactics"));
        assertTrue(ToDo.checkIfPossible("bearded", "dead"));
        assertTrue(ToDo.checkIfPossible("AWESOME", "MOWS"));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }
    @Test
	@Graded(description = "match", marks = 5)
	@Order(13)
    public void testMatch() {
        assertNull(ToDo.match("pcka.", 5));
        // assertNotNull(ToDo.match("H.LLO", 5));
        assertEquals("BALLO", ToDo.match("B.LLO", 5));
        assertEquals("SUPREME", ToDo.match(".U.REM.", 4));
        assertEquals("CHICKEN", ToDo.match(".HICK.N", 7));
        assertEquals("CHICKEN", ToDo.match(".HICK.N", 7));

        // ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
    }

    // =========================================
	// =========================================
	// =========================================

	public static int score = 0;
	public static String result = "";
	public static String currentMethodName = null;
	ArrayList<String> methodsPassed = new ArrayList<String>();

	@BeforeEach
	public void run() {
		currentMethodName = null;
	}

    @AfterEach
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if (currentMethodName != null
				&& !methodsPassed.contains(currentMethodName)) {
			methodsPassed.add(currentMethodName);
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score += graded.marks();
			score = Math.min(score, 100);
			result += graded.description() + " passed. Marks awarded: "
					+ graded.marks() + "\n";
			doNotModify.CSV.write(this.getClass().toString(), currentMethodName,
					graded.marks());
		}
	}

    @AfterAll
	public static void wrapUp() throws IOException {
		if (result.length() != 0) {
			result = result.substring(0, result.length() - 1); // remove the
																// last "\n"
		}
		System.out.println(result);
		System.out.println("\nMarks for this file (out of 65, remaining 35 for code style): " + score);
	}
}
