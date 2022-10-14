package main;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(5);
		list1.add(6);
		list1.add(8);
		list1.add(20);
		
		java.util.stream.Stream<Integer> stream=list1.stream();
		List <Integer> newlist=stream.filter(i ->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		
		
		java.util.stream.Stream<Object> emptyStream =Stream.empty();
		
 
	}

}
