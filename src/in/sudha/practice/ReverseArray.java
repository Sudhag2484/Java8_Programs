package in.sudha.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array=new int[] {12,13,43,23,15};
		int[] reverseArray = IntStream.rangeClosed(1, array.length).map(i->array[array.length-i])
				.toArray();//convert Intstrean ro array
		System.out.println(Arrays.toString(reverseArray));//convert array to string
	}

}
