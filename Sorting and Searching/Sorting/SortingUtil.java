import java.util.Arrays;

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
	
	public static String[] mergeSort(String unsortedArr[]) {
		return splitAndMerge(unsortedArr);
	}
	
	public static String[] splitAndMerge(String arr[]) {
		if( arr.length<2 ) return arr;
		int mid = arr.length / 2;
		String upperHalf[] = splitAndMerge( Arrays.copyOfRange(arr, 0, mid) );
		String lowerHalf[] = splitAndMerge( Arrays.copyOfRange(arr, mid, arr.length) );
		String merged[] = merge(upperHalf, lowerHalf);
		return merged;
	}
	
	public static String[] merge(String upperHalf[], String lowerHalf[]) {
		String sortedArr[] = new String[upperHalf.length + lowerHalf.length];
		int upperHalfLength = upperHalf.length;
		int lowerHalfLength = lowerHalf.length;
		int k=0, i=0, j=0;
		while( i<upperHalfLength && j<lowerHalfLength ) {
			if( upperHalf[i].compareTo( lowerHalf[j] ) > 0 ) {
				sortedArr[k++] = lowerHalf[j++];
			} else {
				sortedArr[k++] = upperHalf[i++];
			}
		}
		while( i<upperHalfLength ) {
			sortedArr[k++] = upperHalf[i++];
		}
		while( j<lowerHalfLength ) {
			sortedArr[k++] = lowerHalf[j++];
		}
		return sortedArr;
	}
	
	public static void swap(String arr[], int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}	
	
	
	public static void printArray(String arr[]) {
		for( int q=0 ; q<arr.length ; q++ ) {
			System.out.println( arr[q] );
		}
	}
	
}