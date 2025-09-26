package Lab5;

import javax.swing.*;
public class Lab5Program1 {
	
	public static void main(String[] args) {
		
		String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		String isOrIsNot, inputWord;
		String fileName = "lab5input.txt";
		String[] fileArray = new String[8];
		inputFromFile(fileName, fileArray);
		System.out.println(fileArray.length);
		
		for (String s: fileArray )
		{
			System.out.println(s);
		}


		while(true)	
		{

		
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		if (inputWord.equals("STOP"))
			System.exit(0);
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; 
		else
			isOrIsNot = "is not"; 
		
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
	}
}

	public static boolean wordIsThere(String findMe, String[] theList) {
		for (String word: theList){
			if (findMe.equals(word)) 
				return true;
		}
		return false;
	} 
	/* 
	 * create  function that reads file one word per line
	 * stores it in a array
	 * then in main function pritn it 
	 */
	private static void inputFromFile(String fileName, String[] fileArray)
	{
		TextFileInput cur = new TextFileInput(fileName);
		int lengthFilled = 0;
		String line = cur.readLine();

		while (lengthFilled < fileArray.length && line != null)
		{
			fileArray[lengthFilled++] = line;
			line = cur.readLine();
		} // we iterated past length of array  BUT cur.readLine() still returns string if (line != null)
		if (line != null)
		{
			System.out.println("The file has too many words, this program can only take"
			+ fileArray.length + " words.");
			// figure out how you can see this "1" as an error code
			System.exit(1);
		}
		cur.close();

	}
} 
