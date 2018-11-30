import java.util.Random;

public class StringGenerator {
	
	private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	
	public static String[] generate(int wordSize, int totalWords) {
		if( totalWords < 1 ) {
			return null;
		}
		
		Random rand = new Random();
		String s[] = new String[totalWords];
		for( int i=0 ; i<totalWords ; i++ ) {
			String generatedStr = "";
			for( int j=0 ; j<wordSize ; j++ ) {
				generatedStr += LETTERS.charAt(rand.nextInt( LETTERS.length()-1 ));
			}
			s[i] = generatedStr;
		}
		return s;
	}
	
}