public class SortingUtil {
	
	public static String[] insertionSort(String unsortedArr[]) {
		if( unsortedArr==null || unsortedArr.length<1 ) 
			return null;
		
		for( int i=1 ; i<unsortedArr.length ; i++ ) {
			for( int j=i ; j>0 ; j-- ) {
				if( unsortedArr[j-1].compareTo( unsortedArr[j] ) > 0 ) {
					swap( unsortedArr, j-1, j );
				} else {
					break;
				}
			}
		}
		
		return unsortedArr;
	}
	
	public static void swap(String arr[], int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}	
	
}