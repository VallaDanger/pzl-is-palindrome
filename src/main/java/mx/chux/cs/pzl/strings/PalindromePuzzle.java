package mx.chux.cs.pzl.strings;

import mx.chux.cs.pzl.PuzzleSolution;

public abstract class PalindromePuzzle implements PuzzleSolution<Boolean> {

	protected final String string;
	protected final int size;
	
	protected final boolean isEven;
	
	protected PalindromePuzzle(final String string) {
		this.string = (string == null)? "" : Utils.clean(string);
		this.size = this.string.length();
		this.isEven = (this.size%2) == 0;
	}
	
	protected final char charAt(final int index) {
		return Utils.charAt(this.string, index);
	}
	
	protected final Character getCharAt(final int index) {
		return Character.valueOf(charAt(index));
	}
	
	protected final int numericValueOf(int index) {
		return Utils.numericValueOf(this.string, index);
	}
	
	protected final int toggleBit(int vector, int index) {
		return Utils.toggleBit(vector, numericValueOf(index));
	}
	
}
