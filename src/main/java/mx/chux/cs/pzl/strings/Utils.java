package mx.chux.cs.pzl.strings;

class Utils {
	
	private static int a = Character.getNumericValue('a');
	
	static String clean(final String s) {
		
		final int sizeOfString = s.length();
		final StringBuilder builder = new StringBuilder(s.length());
		
		for( int i = 0 ; i < sizeOfString ; i++ ) {
			if( isAlphaNumeric(s, i) ) {
				builder.append(toLower(s, i));
			}
		}
		
		return builder.toString();
	}

	static boolean isAlphaNumeric(final String s, final int index) {
		return Character.isLetterOrDigit(charAt(s, index));
	}
	
	static char toLower(final String s, final int index) {
		return Character.toLowerCase(charAt(s, index));
	}
	
	static char charAt(final String s, final int index) {
		return s.charAt(index);
	}
	
	static int numericValueOf(final String s, int index) {
		return Character.getNumericValue(charAt(s, index)) - a;
	}
	
	static int toggleBit(int vector, int index) {
		
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
	
	static boolean hasOnlyOneBitSet(final int vector) {
		/*
			00010000 - 1 = 00001111 
			00010000 & 00001111 = 0
		*/
		return (vector & (vector-1)) == 0;
	}
	
	static boolean hasAtMostNBitsSet(int vector, final int n) {
		
		int count = 0;
		
		while( vector > 0 ) {
			// if vector & 1 is greater is true, then increment the count of 1's
			count += ((vector & 1) > 0)? 1 : 0;
			// shift right
			vector >>>= 1; 
		}
		
		return count <= n;
		
	}

}
