package toDo;

import java.util.Arrays;

public class ToDo {
  public static String[] words;

    /**
     * 
     * @param ch
     * @return true if the character is an English letter, false otherwise
     */
    public static boolean isEnglishLetter(char ch) {

    // Use the Character.isLetter method to check if the character is a letter
    return Character.isLetter(ch);
    }
    

    /**
     * 
     * @param c
     * @return true if the character is a vowel, false otherwise
     */
    public static boolean isVowel(char c) {

    // Check if the character is a vowel (both uppercase and lowercase)
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }


    /**
     * 
     * @param c
     * @return true if the character is a constant, false otherwise
     */
    public static boolean isConsonant(char c) {

     // Check if the character is a letter and not a vowel
    return Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }


    /**
     * 
     * @param s
     * @return the number of vowels in the string
     */
    public static int countVowels(String s) {

     // Initialize a counter for vowels
     int count = 0;

     // Check each character in the string
    for (int i = 0; i < s.length(); i++) {

    // If the character is a vowel, increment the counter
    if (isVowel(s.charAt(i))) {
    count++;
       }
     }
 
     // Return the total count of vowels
     return count;
     }


    /**
     * 
     * @param arr
     * @param word
     * @return true if the array contains the word, false otherwise
     */
    public static boolean contains(String[] arr, String word) {
      
    // Iterate through the array
    for (int i = 0; i < arr.length; i++) {
      
    // Check if the current element matches the word
    if (arr[i].equals(word)) {
    return true;
      }
    }

    // Return false if no match is found
    return false;
    }


    /**
     * 
     * @param word
     * @param minCharacters
     * @return true if the String word is at least minCharacters long and exists in array words, false otherwise
     * 
     * IMPORTANT: Note the array of Strings (words) is available as a field in this class, so you don't need to pass it.
     * Note: Array words holds Strings in uppercases
     */
    public static boolean isValid(String word, int minCharacters) {
    
    // Check if the word length is at least minCharacters
            if (word.length() < minCharacters) {
                System.out.println("Word length is less than minCharacters");
                return false;
            }
    
            // Convert the word to uppercase to handle case insensitivity
            String upperCaseWord = word.toUpperCase();
            System.out.println("Upper case word: " + upperCaseWord);
    
            // Ensure words array is not null
            if (words == null) {
                System.out.println("Words array is not initialized");
                return false;
            }
    
            // Print the length of the words array
            System.out.println("Words array length: " + words.length);
    
            // Print the contents of the words array
            System.out.println("Words array contents: " + Arrays.toString(words));
    
            // Check if the word exists in the words array
            for (int i = 0; i < words.length; i++) {
                System.out.println("Comparing with: " + words[i]);
                if (words[i].equals(upperCaseWord)) {
                    return true;
                }
            }
    
            // Return false if the word does not exist in the words array
            System.out.println("Word not found in array");
            return false;
        }
  

    /**
     * 
     * @param s
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
    
    // Normalize the string to lower case to ensure case-insensitive comparison
    s = s.toLowerCase();

    // Initialize two pointers
    int left = 0;
    int right = s.length() - 1;

    // Compare characters from both ends moving towards the center
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    // Return true if all characters match
    return true;
  }


    /**
     * 
     * @param s
     * @return true if the string contains any letter more than once, false otherwise
     */
    public static boolean containsDuplicateLetter(String s) {
    
    // Create an array to track occurrences of characters
    boolean[] seen = new boolean[256]; // Assuming ASCII characters

  // Convert the string to uppercase to handle case insensitivity
  s = s.toUpperCase();

  // Iterate through each character in the string
  for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    // Check if the character has been seen before
    if (seen[ch]) {
      return true; // Duplicate found
    }
    // Mark the character as seen
    seen[ch] = true;
  }

  // No duplicates found
  return false;
}



    /**
     * 
     * @param s
     * @return true if the string is sorted in ascending order, false otherwise
     */
    public static boolean isAscending(String s) {
    
 // Convert the string to uppercase to handle case insensitivity
 s = s.toUpperCase();

 // Iterate through the string
 for (int i = 0; i < s.length() - 1; i++) {
     // Compare each character with the next one
     if (s.charAt(i) > s.charAt(i + 1)) {
         return false; // Found a character greater than the next one
     }
 }

 // Return true if all characters are in ascending order
 return true;
}

  /**
   * 
   * @param s
   * @return true if the string is sorted in descending order, false otherwise
   */
  public static boolean isDescending(String s) {
  
  // Convert the string to uppercase to handle case insensitivity
  s = s.toUpperCase();

  // Debugging: Print the string to be checked
  System.out.println("Checking string: " + s);

  // Iterate through the string
  for (int i = 0; i < s.length() - 1; i++) {
    // Compare each character with the next one
    if (s.charAt(i) < s.charAt(i + 1)) {
      // Debugging: Print the characters and their positions where it fails
      System.out.println("Failed at position " + i + ": " + s.charAt(i) + " < " + s.charAt(i + 1));
      return false; // Found a character less than the next one
    }
  }

  // Return true if all characters are in descending order
  return true;
}


  /**
   * 
   * @param s
   * @return true if the string is sorted in ascending or descending order, false otherwise
   */
  public static boolean isSorted(String s) {
  
  // Check if the string is sorted in ascending order
  if (isAscending(s)) {
    return true;
  }

  // Check if the string is sorted in descending order
  if (isDescending(s)) {
    return true;
  }

  // Return false if the string is not sorted in either order
  return false;
}

  /**
   * @param from
   * @param s
   * @return true if it is possible to create the string "s" from the string "from", false otherwise
   */
  public static boolean checkIfPossible(String from, String s) {
  
  // Create frequency arrays for both strings
  int[] fromFreq = new int[256]; // Assuming ASCII characters
  int[] sFreq = new int[256];

  // Convert both strings to uppercase to handle case insensitivity
  from = from.toUpperCase();
  s = s.toUpperCase();

  // Fill the frequency array for the "from" string
  for (int i = 0; i < from.length(); i++) {
    fromFreq[from.charAt(i)]++;
  }

  // Fill the frequency array for the "s" string
  for (int i = 0; i < s.length(); i++) {
    sFreq[s.charAt(i)]++;
  }

  // Check if the "from" string has enough characters to form the "s" string
  for (int i = 0; i < s.length(); i++) {
    if (sFreq[s.charAt(i)] > fromFreq[s.charAt(i)]) {
      return false; // Not enough characters to form the "s" string
    }
  }

  // Return true if all characters in "s" can be formed from "from"
  return true;
}


  /**
   * 
   * @param word
   * @param minCharacters
   * @return the first word in the array words that matches target, null if no word matches it.
   * the dot character ('.') should be treated like a wildcard.
   * So, match(".elong", 5) should return "belong", "b.llo" should return "ballo", 
   * while "pcka." should return null.
   * 
   * IMPORTANT: Note the array of Strings (words) is available as a field in this class, so you don't need to pass it.
   * Note: Array words holds Strings in uppercases
   * 
   * minCharacters is a bit of a confusing point here. 
   * Just return null if target.length() < minCharacters, and after that,
   * if the control is still in the function, ignore it all together.
   * 
   * The word you return, if any, should be of the same length as target.
   */
  public static String match(String target, int minCharacters) {
    
    // Return null if target length is less than minCharacters
    if (target.length() < minCharacters) {
      return null;
    }

    // Iterate through the words array
    for (String word : words) {
      System.out.println(words);

      // Check if the word is of the same length as the target
      if (word.length() == target.length()) {
        boolean match = true;

        // Compare each character in the target with the word
        for (int i = 0; i < target.length(); i++) {
          if (target.charAt(i) != '.' && target.charAt(i) != word.charAt(i)) {
            match = false;
            break;
          }
        }

        // Return the word if it matches the target
        if (match) {
          return word;
        }
      }
    }

    // Return null if no matching word is found
    return null;
  }
}


