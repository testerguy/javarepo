
public class MultiDimArray {
	
	public static void main(String[] args) {
		int firstarray[][] = {{45,614,51},{614,121,112,51,15},{15,21,31}};
		int secondarray[][] = {{15,21,51,131,11,5,2,42},{12,51,22,15,9,201,81,1},{14,51,61,12},{512,232,132,51,11},{5,2,123,51,1,55,12,25},{51,12412,4,1231,1312,12},{5,343,127,56,75,74}};
		
		System.out.println("first array");
		
		display(firstarray);
		
		System.out.println("second array");
		
		display(secondarray);
	}

	public static void display(int x[][]){
		for (int row=0; row<x.length; row++) {
			for (int column=0; column<x[row].length; column++) {
				System.out.print(x[row][column]+"\t");
			}
		    System.out.println();
		}
	}
}
