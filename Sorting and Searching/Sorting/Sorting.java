public class Sorting {
	
	public static void main(String arg[]) {
		
		StringGenerator sg = new StringGenerator();
		String str[] = sg.generate(5, 20);
		
		String sortedArr[] = SortingUtil.insertionSort( str );
		for( int k=0 ; k<sortedArr.length ; k++ ) {
			System.out.println( sortedArr[k] );
		}
		
	}
	
	
	
}