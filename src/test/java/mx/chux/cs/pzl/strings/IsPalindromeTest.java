package mx.chux.cs.pzl.strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IsPalindromeTest {

	private void assertOptimalSolution(final PalindromePuzzle puzzle, final Boolean expectedSolution) {
		assertThat(puzzle.optimalSolution()).isEqualTo(expectedSolution);
	}
	
	@Test
	public void isPalindromeTest() {
		final PalindromePuzzle puzzle = IsAPalindrome.string("A Man, A Plan, A Canal, Panama!");
		assertOptimalSolution(puzzle, Boolean.TRUE);
	}
	
	@Test
	public void isNotPalindromeTest() {
		final PalindromePuzzle puzzle = IsAPalindrome.string("abca");
		assertOptimalSolution(puzzle, Boolean.FALSE);
	}
	
	@Test
	public void isAlmostPalindromeTest() {
		final PalindromePuzzle puzzle = IsAlmostPalindrome.string("abccdba");
		assertOptimalSolution(puzzle, Boolean.TRUE);
	}
	
	@Test
	public void isNotAlmostPalindromeTest() {
		final PalindromePuzzle puzzle = IsAlmostPalindrome.string("abcdefdba");
		assertOptimalSolution(puzzle, Boolean.FALSE);
	}
	
	@Test
	public void isPermutationPalindromeTest() {
		final PalindromePuzzle puzzle = IsPermutationOfPalindrome.string("bbaa");
		assertOptimalSolution(puzzle, Boolean.TRUE);
	}
	
	@Test
	public void isNotPermutationPalindromeTest() {
		final PalindromePuzzle puzzle = IsPermutationOfPalindrome.string("cdbbaa");
		assertOptimalSolution(puzzle, Boolean.FALSE);
	}
	
	@Test
	public void isAlmostPermutationPalindromeTest() {
		final PalindromePuzzle puzzle = IsAlmostPermutationOfPalindrome.string("abccdba");
		assertOptimalSolution(puzzle, Boolean.TRUE);
	}
	
	@Test
	public void isNotAlmostPermutationPalindromeTest() {
		final PalindromePuzzle puzzle = IsAlmostPermutationOfPalindrome.string("abcdefdba");
		assertOptimalSolution(puzzle, Boolean.FALSE);
	}
	
}
