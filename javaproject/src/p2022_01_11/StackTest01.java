package p2022_01_11;

import java.util.*;

//1.  LIFO(Last Input First Output) 구조
//마지막으로 입력된 자료가 가장 먼저 출력되는 구조

public class StackTest01 {
  public static void main(String[] args) {
   
	Stack myStack = new Stack();
    myStack.push("1-자바"); 
    myStack.push("2-C++"); 
    myStack.push("3-API"); 
    myStack.push("4-MFC"); 

    System.out.println(myStack.pop());	//4-MFC
    System.out.println(myStack.pop());	//3-API
    System.out.println(myStack.pop());	//2-C++
    System.out.println(myStack.pop());	//1-자바	
    System.out.println(myStack.pop());	//EmptyStackException
    
//    스택 자료구조가 비어있지 않으면  
    while(!myStack.isEmpty()) {
      System.out.println( myStack.pop());
    }
  }    
}                                                     
