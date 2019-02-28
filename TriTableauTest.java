import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@Test
	void testCroissant() {
		int monTab[] = {3,2,1};
		int expected[] = {1,2,3};
		TriTableau.triCroissant(monTab);
		Assertions.assertEquals(expected[0],monTab[0]);
	}
	
	@Test
	void testDecroissant() {
		int monTab[] = {1,2,3};
		int expected[] = {3,2,1};
		TriTableau.triDecroissant(monTab);
		Assertions.assertEquals(expected[0],monTab[0]);
	}

}
