package mx.chux.cs.pzl.strings;

public class IsAPalindrome extends PalindromePuzzle {

	public static IsAPalindrome string(final String string) {
		return new IsAPalindrome(string);
	}

	private IsAPalindrome(final String string) {
		super(string);
	}

	@Override
	public Boolean bruteForceSolution() {
		return optimalSolution();
	}

	@Override
	public Boolean optimalSolution() {
		return Boolean.valueOf(fromOutside() && fromInside() && reverseMatch());
	}
	
	private boolean fromOutside() {
		
		int i = 0;
		int j = this.size - 1;
		
		while( i < j ) {
			if( charAt(i++) != charAt(j--) ) {
				return false;
			}
		}
		
		return true;
	}
	
	private boolean fromInside() {
		
		final int center = this.size/2;
		
		int i = this.isEven? center-1 : center;
		int j = this.isEven? center : i;
		
		while( i >= 0 ) {
			if( charAt(i--) != charAt(j++) ) {
				return false;
			}
		}
		
		return true;
	}
	
	private boolean reverseMatch() {
		
		final String reversed = reverse();
		
		for( int i = 0 ; i < this.size ; i++ ) {
			if( charAt(i) != Utils.charAt(reversed, i) ) {
				return false;
			}
		}
		
		return true;
	}
	
	private String reverse() {
		
		final StringBuilder builder = new StringBuilder(this.size);
		
		for( int i = this.size-1 ; i >= 0 ; i-- ) {
			builder.append(charAt(i));
		}
		
		return builder.toString();
	}
	
}
