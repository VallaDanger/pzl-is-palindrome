package mx.chux.cs.pzl.strings;

public class IsAlmostPalindrome extends PalindromePuzzle {

	public static IsAlmostPalindrome string(final String string) {
		return new IsAlmostPalindrome(string);
	}

	private IsAlmostPalindrome(final String string) {
		super(string);
	}

	@Override
	public Boolean bruteForceSolution() {
		return optimalSolution();
	}

	@Override
	public Boolean optimalSolution() {
		// an almost palindrome is such that by removing one character 
		// the remaining string is a complete and valid palindrome
		return isPalindrome(this.string, 0, this.size-1, false);
	}
	
	private boolean isPalindrome(final String s, int i, int j, boolean sub) {
		
		while( i < j ) {
			if( (Utils.charAt(s, i) != Utils.charAt(s, j)) ) {
				return !sub && (isPalindrome(s, i+1, j, true) || isPalindrome(s, i, j-1, true));
			}
			i += 1;
			j -= 1;
		}
		
		return true;
	}
	
}
