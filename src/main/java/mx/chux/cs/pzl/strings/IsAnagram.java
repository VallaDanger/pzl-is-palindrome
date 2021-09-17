package mx.chux.cs.pzl.strings;

import mx.chux.cs.pzl.PuzzleSolution;

public class IsAnagram implements PuzzleSolution<Boolean> {

	public static void main(String[] args) {
		System.out.println(IsAnagram.strings("abc", "bca").optimalSolution());
	}
	
	public static IsAnagram strings(final String first, final String second) {
		return new IsAnagram(first, second);
	}
	
	private static int a = Character.getNumericValue('a');
	
	private final String first;
	private final String second;
	
	private IsAnagram(final String first, final String second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public Boolean bruteForceSolution() {
		return optimalSolution();
	}

	@Override
	public Boolean optimalSolution() {
		
		final int size = this.first.length();
		
		if( size != this.second.length() ) {
			return Boolean.FALSE;
		}
		
		// this fancy solution only works for strings with a-z
		
		int firstVector = 0;
		for( int i = 0 ; i < size ; i++ ) {
			firstVector = toggleBit(firstVector, numericValueOf(this.first, i));
		}
		
		int secondVector = 0;
		for( int i = 0 ; i < size ; i++ ) {
			secondVector = toggleBit(secondVector, numericValueOf(this.second, i));
		}
		
		// if vectors are equal then bit toggling yielded the same value 
		// for both strings (position independent), which means that it is
		// true if it is indeed an anagram...
		return firstVector == secondVector; 
	}
	
	private char charAt(final String s, final int index) {
		return s.charAt(index);
	}
	
	private int numericValueOf(final String string, int index) {
		// offset from ascii a
		return Character.getNumericValue(charAt(string, index)) - a;
	}
	
	private int toggleBit(int vector, int index) {
		
		if( index < 0 ) {
			return vector; 
		}
		
		// create bit mask for character
		int mask = 1 << index; 

		// if this character has not been seen
		if( (vector & mask) == 0 ) {
			// set the bit in vector (OR)
			vector |= mask; 
		} else {
			// if the character has been seen before,
			// unset the bit by ANDing with the negated mask.
			// Every set bit will remain except the targeted one.
			vector &= ~mask;
		} 
		
		return vector; 
	}
	
}
