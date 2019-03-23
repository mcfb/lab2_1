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

    @Test
    public void resultShouldReturnFalseAndMinusOneAsPositionOfElementInSequenceConsistingOnlyOneElement() {

        int[] seq = {3};
        int key = 4;
        final int resultNotFound = -1;
        SearchResult res = BinarySearch.search(key, seq);
        assertFalse(res.isFound());
        assertEquals(resultNotFound, res.getPosition());
    }
}
