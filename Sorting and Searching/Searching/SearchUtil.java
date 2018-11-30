import java.util.*;

public class SearchUtil {
	
	public static String[] sequencialSearch(String whitelist[], String users[]) {
		List<String> list = new ArrayList<String>();
		List<String> whitelistList = Arrays.asList(whitelist);
		for(String user : users) {
			if( whitelistList.contains(user) ) {
				list.add( user );
			}
		}
		return list.toArray(new String[list.size()]);
	}
	
	public static String[] binarySearch(String whitelist[], String users[]) {
		List<String> list = new ArrayList<String>();
		for(String user : users) {
			if( binarySearch(user, whitelist, 0, whitelist.length) > -1 ) {
				list.add( user );
			}
		}
		return list.toArray(new String[list.size()]);
	}
	
	private static int binarySearch(String toSearch, String list[], int lo, int hi) {
		if( hi <= lo ) 
			return -1;
		int mid = lo + (hi - lo) / 2;
		int comp = toSearch.compareTo( list[mid] );
		if( comp > 0 ) 
			return binarySearch(toSearch, list, mid+1, hi);
		else if( comp < 0 )
			return binarySearch(toSearch, list, lo, mid);
		else
			return mid;
	}
	
}