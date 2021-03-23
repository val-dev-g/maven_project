package maven_project;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LevenshteinTest {
	
	@Test
	public void levenshteinDistanceTest1() {
		int result = Levenshtein.levenshteinDistance("distance", "distance");
		assertEquals(0, result);
	}
	
	@Test
	public void levenshteinDistanceTest2() {
		int result = Levenshtein.levenshteinDistance("distance", "distances");
		assertEquals(1, result);
	}
	
	@Test
	public void levenshteinDistanceTest3() {
		int result = Levenshtein.levenshteinDistance("distances", "distance");
		assertEquals(1, result);
	}
}
