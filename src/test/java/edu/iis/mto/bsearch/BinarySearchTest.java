package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void resultShouldReturnTrueAndPositionOfElementInSequenceConsistingOnlyOneElement() {

        int[] seq = {3};
        int key = 3;
        SearchResult res = BinarySearch.search(key, seq);
        assertTrue(res.isFound());
        assertEquals(key, seq[res.getPosition()]);
    }
}
