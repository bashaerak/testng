package testng;

import static org.testng.Assert.*;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BinarySearchTest {
	
  @Test(dataProvider="sortedArrays", dataProviderClass=BinarySearchDataProvider.class)
  public void findValue(Integer[] sortedArray) {
	  for (int index=0; index < sortedArray.length; index++) {
		  assertEquals(Arrays.binarySearch(sortedArray, sortedArray[index]), index);
	  }
  }

}