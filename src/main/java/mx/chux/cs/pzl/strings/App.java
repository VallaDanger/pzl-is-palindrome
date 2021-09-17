package mx.chux.cs.pzl.strings;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		Boolean answer = IsAPalindrome.string("A Man, A Plan, A Canal, Panama!").optimalSolution();

		LOGGER.log(Level.INFO, "IsAPalindrome: {0}", new Object[] { answer });

		answer = IsAPalindrome.string("abca").optimalSolution();

		LOGGER.log(Level.INFO, "IsAPalindrome: {0}", new Object[] { answer });

		answer = IsAlmostPalindrome.string("abccdba").optimalSolution();

		LOGGER.log(Level.INFO, "IsAlmostPalindrome: {0}", new Object[] { answer });
		
		answer = IsAlmostPalindrome.string("abcdefdba").optimalSolution();

		LOGGER.log(Level.INFO, "IsAlmostPalindrome: {0}", new Object[] { answer });

		answer = IsPermutationOfPalindrome.string("bbaa").optimalSolution();

		LOGGER.log(Level.INFO, "IsPermutationOfPalindrome: {0}", new Object[] { answer });
		
		answer = IsAlmostPermutationOfPalindrome.string("abccdba").optimalSolution();

		LOGGER.log(Level.INFO, "IsAlmostPermutationOfPalindrome: {0}", new Object[] { answer });
		
		answer = IsAlmostPermutationOfPalindrome.string("abcdefdba").optimalSolution();

		LOGGER.log(Level.INFO, "IsAlmostPermutationOfPalindrome: {0}", new Object[] { answer });
		
		answer = IsAlmostPermutationOfPalindrome.string("fcadbefdba").optimalSolution();

		LOGGER.log(Level.INFO, "IsAlmostPermutationOfPalindrome: {0}", new Object[] { answer });

	}
	
}
