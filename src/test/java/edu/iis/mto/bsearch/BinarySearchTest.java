package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void resultShouldReturnTrueAndPositionOfElementInSequenceConsistingOnlyOneElement() {

        int[] seq = {3};
        int key = 3;
        checkSequenceLength(seq);
        SearchResult res = BinarySearch.search(key, seq);
        assertTrue(res.isFound());
        assertEquals(key, seq[res.getPosition()]);
    }

    @Test
    public void resultShouldReturnFalseAndMinusOneAsPositionOfElementInSequenceConsistingOnlyOneElement() {

        int[] seq = {3};
        int key = 4;
        final int resultNotFound = -1;
        checkSequenceLength(seq);
        SearchResult res = BinarySearch.search(key, seq);
        assertFalse(res.isFound());
        assertEquals(resultNotFound, res.getPosition());
    }


    @Test
    public void elementShouldBeFoundIfIsOnFirstPositionInSequenceWithManyElements() {

        int[] seq = {1, 3, 4, 5, 7, 10};
        int key = 1;
        final int firstPostion = 0;
        checkSequenceLength(seq);
        SearchResult res = BinarySearch.search(key, seq);
        assertTrue(res.isFound());
        assertEquals(firstPostion, res.getPosition());
        assertEquals(key, seq[res.getPosition()]);
    }

    @Test
    public void elementShouldBeFoundIfIsOnLastPositionInSequenceWithManyElements() {

        int[] seq = {1, 3, 4, 5, 7, 10};
        int key = 10;
        final int lastPosition = seq.length - 1;
        checkSequenceLength(seq);
        SearchResult res = BinarySearch.search(key, seq);
        assertTrue(res.isFound());
        assertEquals(lastPosition, res.getPosition());
        assertEquals(key, seq[res.getPosition()]);
    }

    @Test
    public void elementShouldBeFoundIfIsInTheMiddleInSequenceWithManyElements() {

        int[] seq = {1, 3, 4, 5, 7, 9, 10};
        int key = 5;
        final int middlePosition = seq.length / 2;
        checkSequenceLength(seq);
        SearchResult res = BinarySearch.search(key, seq);
        assertTrue(res.isFound());
        assertEquals(middlePosition, res.getPosition());
        assertEquals(key, seq[res.getPosition()]);
    }

    @Test
    public void resultShouldReturnFalseAndMinusOneAsPositionOfElementIfNotInSequenceWithManyElements() {

        int[] seq = {1, 3, 4, 5, 7, 9, 10};
        int key = 12;
        final int resultNotFound = -1;
        checkSequenceLength(seq);
        SearchResult res = BinarySearch.search(key, seq);
        assertFalse(res.isFound());
        assertEquals(resultNotFound, res.getPosition());
    }

    private void checkSequenceLength(int[] seq){
        if (seq.length == 0) {
            throw new IllegalArgumentException();
        }
    }

}
