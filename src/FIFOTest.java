import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FIFOTest {

	@Test
	void testSize() {
		FIFO unFifo = new FIFO();
		int expected = 1;
		
		unFifo.add(4);
		
		Assertions.assertEquals(expected, unFifo.size());
	}
	
	@Test
	void testFirst() {
		FIFO unFifo = new FIFO();
		Integer expected = 4;
		
		unFifo.add(4);
		
		Assertions.assertEquals(expected, unFifo.first());
	}
	
	@Test
	void testEmpty() {
		FIFO unFifo = new FIFO();
		boolean expected = true;
		
		
		Assertions.assertEquals(expected, unFifo.isEmpty());
	}
	
	@Test
	void testRemove() {
		FIFO unFifo = new FIFO();
		int expected = 0;
		
		unFifo.add(4);
		unFifo.removeFirst();
		
		Assertions.assertEquals(expected, unFifo.size());
	}
	
	@Test
	void testRemoveException() {
		FIFO unFifo = new FIFO();
		
		Assertions.assertThrows(NoSuchElementException.class, ()->{unFifo.removeFirst();});
	}
	
	@Test
	void testFirstException() {
		FIFO unFifo = new FIFO();
		
		Assertions.assertThrows(NoSuchElementException.class, ()->{unFifo.first();});
	}

}
