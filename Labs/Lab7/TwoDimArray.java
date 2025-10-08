package Lab7;

public class TwoDimArray {
	public static String myFile = "Lab7/twodimesion.txt";
	public static int[][] myArray = fillArray(myFile);

	public static void main(String[] args) {

		System.out.println("========== NORMAL ARRAY ==========");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				display(myArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("========== EVEN ARRAY ==========");
		printArrayEven(myArray);

	}

	private static void display(int num) {
		if (num < 10)
			System.out.print(num + "  ");
		else {
			System.out.print(num + " ");
		}
	}

	private static void printArrayEven(int[][] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++) {
				if (theArray[i][j] % 2 == 1) {
					System.out.print("*  ");
				} else {
					display(theArray[i][j]);
				}
			}
			System.out.println();

		}
	}

	public static int[][] fillArray(String myFile) {
		TextFileInput myArrayInput = new TextFileInput(myFile);
		int row = Integer.parseInt(myArrayInput.readLine());
		int col = Integer.parseInt(myArrayInput.readLine());
		int myInputArray[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				myInputArray[i][j] = Integer.parseInt(myArrayInput.readLine());
			}
		}
		return myInputArray;

	}
}
