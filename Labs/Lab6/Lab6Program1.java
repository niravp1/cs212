package Lab6;

import javax.swing.*;

public class Lab6Program1 {

	public static void main(String[] args) {

		String fileName = args[0];
		int[] fileArray = new int[14];
		inputFromFile(fileName, fileArray);
		JOptionPane.showMessageDialog(null,"Sum: " + sum(fileArray,fileArray.length) + "\n" + "Average: "+ 
		average(fileArray, fileArray.length));
	}
	/*
	 * create function that reads file one word per line
	 * stores it in a array
	 * then in main function print it
	 */
	private static void inputFromFile(String fileName, int[] fileArray) {
		TextFileInput cur = new TextFileInput(fileName);
		int lengthFilled = 0;
		String line = cur.readLine();

		while (lengthFilled < fileArray.length && line != null) {
			fileArray[lengthFilled++] = Integer.parseInt(line);
			line = cur.readLine();
		} // we iterated past length of array BUT cur.readLine() still returns string if
			// (line != null)
		if (line != null) {
			System.out.println("The file has too many numbers, this program can only take"
					+ fileArray.length + " numbers.");
			// figure out how you can see this "1" as an error code
			System.exit(1);
		}
		cur.close();

	}
	public static int sum (int[] myArray, int myArraySize){
		int count = 0;
		for (int i =0; i < myArraySize; i++)
		{
			count += myArray[i];
		}
		return count;

	}
	public static int average(int[] myArray, int myArraySize){
		int sum = sum(myArray, myArraySize);
		int average = sum / myArraySize;
		return average;

	}

}