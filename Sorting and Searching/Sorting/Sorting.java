public class Sorting {
	
	public static void main(String arg[]) {
		
		StringGenerator sg = new StringGenerator();
		String str[] = sg.generate(5, 20);
		
		for( int k=0 ; k<str.length ; k++ ) {
			System.out.println( str[k] );
		}
		System.out.println( "\n\n\n" );
		//String sortedArr[] = SortingUtil.insertionSort( str );
		String sortedArr[] = SortingUtil.mergeSort( str );
		System.out.println( "\n\n\n" );
		for( int k=0 ; k<sortedArr.length ; k++ ) {
			System.out.println( sortedArr[k] );
		}
		
	}
	
	
	
}