package homework;
public class Utils {

    public static void printArray(int[] array) {
        System.out.println("Array: ");
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("}");
    }
	
	public static void printArray2(int[][] array) {
		
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.print("\n\n");
		}
		
	}

    public static int[] arraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[indexMin])
                    indexMin = j;
            int temp = a[i];
            a[i] = a[indexMin];
            a[indexMin] = temp;
        }
        return a;
    }

}
