package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.IntegerListImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    IntegerListImpl integerArrayList = new IntegerListImpl();

    @BeforeEach
    void clearArray() {
        integerArrayList.clear();
    }

    @Test
    void addItemPositiveTest() {
        Integer actual1 = integerArrayList.add(ONE);
        Integer actual2 = integerArrayList.add(TWO);

        assertEquals(ONE, actual1);
        assertEquals(TWO, actual2);

        assertTrue(integerArrayList.size() == 2);
    }

    @Test
    void addByIndexPositiveTest() {
        fillArray();

        Integer actual1 = integerArrayList.add(0, ONE);

        assertEquals(ONE, actual1);
    }

    @Test
    void addByIndexNegativeTest() {
        assertThrows(InvalidIndexException.class, () -> integerArrayList.add(-1, ONE));
    }

    @Test
    void setPositiveTest() {
        integerArrayList.add(ONE);
        Integer actual = integerArrayList.set(0, TWO);
        assertEquals(TWO, actual);
    }

    @Test
    void removeItemPositiveTest() {
        integerArrayList.add(ONE);
        assertFalse(integerArrayList.isEmpty());
        integerArrayList.remove(ONE);
        assertTrue(integerArrayList.isEmpty());
    }

    @Test
    void removeByIndexPositiveTest() {
        integerArrayList.add(ONE);
        integerArrayList.add(TWO);

        assertFalse(integerArrayList.isEmpty());
        integerArrayList.remove(0);
        integerArrayList.remove(0);
        assertTrue(integerArrayList.isEmpty());
    }

    @Test
    void containsPositiveTest() {
        integerArrayList.add(ONE);

        assertTrue(integerArrayList.contains(ONE));
        assertFalse(integerArrayList.contains(TWO));
    }

    @Test
    void lastIndexOfPositiveTest() {
        integerArrayList.add(ONE);
        integerArrayList.add(ONE);
        assertTrue(integerArrayList.lastIndexOf(ONE) == 1);
        assertTrue(integerArrayList.lastIndexOf(TWO) == -1);
    }

    @Test
    void getPositiveTest() {
        integerArrayList.add(ONE);
        integerArrayList.add(TWO);
        Integer actual = integerArrayList.get(1);
        assertEquals(TWO, actual);
    }

    @Test
    void equalsPositiveTest() {
        integerArrayList.add(ONE);
        integerArrayList.add(TWO);

        IntegerListImpl otherArrayList = new IntegerListImpl(10);

        otherArrayList.add(ONE);
        otherArrayList.add(TWO);

        assertTrue(integerArrayList.equals(otherArrayList));
    }

    @Test
    void validateItemNegativeTest() {
        assertThrows(NullItemException.class, () -> integerArrayList.add(null));
    }

    private void fillArray() {
        integerArrayList.add(ONE);
        integerArrayList.add(TWO);
        integerArrayList.add(THREE);
        integerArrayList.add(FOUR);
        integerArrayList.add(FIVE);
        integerArrayList.add(SIX);
        integerArrayList.add(SEVEN);
        integerArrayList.add(EIGHT);
        integerArrayList.add(NINE);
        integerArrayList.add(TEN);
    }
}