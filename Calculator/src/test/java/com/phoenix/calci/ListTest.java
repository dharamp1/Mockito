package com.phoenix.calci;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;



public class ListTest {
	
	@Mock
	List<String> list;
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	public void testList() {
	    // Lets mock a LinkedList
	    
	    List<String> list = Mockito.mock(List.class);
	    

	    // this works
	    // real method is not called so list.get(0)
	    Mockito.when(list.get(0)).thenReturn("Rose");

	    assertEquals("Rose", list.get(0));
	}
	
	@Test
	public void testLinkedListSpyWrong() {
	    // Lets mock a LinkedList
	    List<String> list = new LinkedList<String>();
	    List<String> spy = Mockito.spy(list);
	    //spy.add("Rose");
	    // this does not work
	    // real method is called so spy.get(0)
	    // throws IndexOutOfBoundsException (list is still empty)
	    Mockito.when(spy.get(0)).thenReturn("Rose");

	    assertEquals("Rose", spy.get(0));
	}

}
