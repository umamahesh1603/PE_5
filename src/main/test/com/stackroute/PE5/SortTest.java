package com.stackroute.PE5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {


    Sort sort;

    @org.junit.Before
    public void setUp() throws Exception {
        sort= new Sort();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        sort=null;
    }

    @Test
    public void sortNames() {
        String[] inputStringArray={"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedArrayList= new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}));
        ArrayList<String> resultingArrayList=sort.sortNames(inputStringArray);

        assertArrayEquals("sort is failing", expectedArrayList.toArray(), resultingArrayList.toArray());
    }

    @Test
    public void sortNamesFailure() {
        String[] inputStringArray={"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedArrayList= new ArrayList<String>(Arrays.asList(new String[]{"Bluto","Alice","Eugene","Harry","Olive"}));
        ArrayList<String> resultingArrayList=sort.sortNames(inputStringArray);

//        assertArrayEquals("sort is failing", expectedArrayList.toArray(), resultingArrayList.toArray());
        assertFalse(expectedArrayList.equals(resultingArrayList));
    }

    @Test
    public void checkSortNamesNull()
    {
        String[] inputStringArray=null;
        ArrayList<String> resultingArrayList=sort.sortNames(inputStringArray);

        assertNull("checkSortNamesNull is failing ", resultingArrayList);
    }

    @Test
    public void checkSortNamesSingleElement()
    {
        String[] inputStringArray={"Harry"};
        ArrayList<String> resultingArrayList=sort.sortNames(inputStringArray);
        ArrayList<String> expctedArrayList=new ArrayList<>(Arrays.asList(new String[]{"Harry"}));

        assertArrayEquals(expctedArrayList.toArray(),resultingArrayList.toArray());
    }


    @Test
    public void checkSortNamesEmptyArray()
    {
        String[] inputStringArray={};
        ArrayList<String> resultingArrayList=sort.sortNames(inputStringArray);
        ArrayList<String> expctedArrayList=new ArrayList<>(Arrays.asList(new String[]{}));

        assertArrayEquals(expctedArrayList.toArray(),resultingArrayList.toArray());
    }
}