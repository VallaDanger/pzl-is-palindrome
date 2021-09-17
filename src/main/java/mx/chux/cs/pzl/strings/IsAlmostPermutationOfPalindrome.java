package mx.chux.cs.pzl.strings;

public class IsAlmostPermutationOfPalindrome extends PalindromePuzzle {

	public static IsAlmostPermutationOfPalindrome string(final String string) {
		return new IsAlmostPermutationOfPalindrome(string);
	}

	private IsAlmostPermutationOfPalindrome(final String string) {
		super(string);
	}

	@Override
	public Boolean bruteForceSolution() {
		return optimalSolution();
	}

	@Override
	public Boolean optimalSolution() {

		int vector = 0;

		for( int i = 0 ; i < this.size ; i++ ) {
			vector = toggleBit(vector, i);
		}
		
		// an almost permutation of a palindrome is a string such that 
		// after removing one character and reordering the remainder
		// a valid and complete palindrome is formed
		
		// if a palidrome has all even character counts except for maybe one,
		// then an almost palindrome can have at most 2 characters with odd counts.
		// That is: one when the size of string is odd and one more to be removed.
		
		// if the number of characters with odd counts is one, 
		// then it is a simple permutation of a palindrome
		
		return Utils.hasAtMostNBitsSet(vector, 2);
		
	}
	
}
