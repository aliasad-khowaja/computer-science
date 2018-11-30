import java.io.*;

public class WhiteFilter {
	
	private static final String WHITELIST_PATH = "whitelist.txt";
	private static final String CLIENT_LIST = "users.txt";
	
	public static void main(String arg[]) {
		
		String whiteListStr = readFile(  WHITELIST_PATH );
		String usersStr = readFile(  CLIENT_LIST );
	
		if( whiteListStr!=null && usersStr!=null ) {
			String whiteList[] = whiteListStr.split("\n");
			String users[] = usersStr.split("\n");
			
			//String result[] = SearchUtil.sequencialSearch(whiteList, users);
			String result[] = SearchUtil.binarySearch(whiteList, users);
			for(String user : result) {
				System.out.println( user );
			}
		}
		
	}
	
	private static String readFile(String path) {
		String str = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = null;
			while ((line = br.readLine()) != null) {
				str += line + "\n";
			}
		} catch (Exception ex) {
			str = "";
			ex.printStackTrace();
		}
		return str.equals("") ? null : str;
	}
}