package mx.chux.cs.pzl.strings;

public class IsPermutationOfPalindrome extends PalindromePuzzle {

	public static IsPermutationOfPalindrome string(final String string) {
		return new IsPermutationOfPalindrome(string);
	}
	
	private IsPermutationOfPalindrome(final String string) {
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

		// if the string is a permutation of a palindrome, then at the
		// end vector will be zero or it will have at most 1 bit set.
		
		/*
			00010000 - 1 = 00001111 
			00010000 & 00001111 = 0
		*/
		
		return (vector == 0) || Utils.hasOnlyOneBitSet(vector); 
	}
	
}
