//Stack Implementation with Array
import java.io.*;
import java.util.*;

public class AStack
{

  static final int MAX = 1000;

  int[] Stack = new int[MAX];
  int top = -1;

  public void push(int item){
    //check if full
    if (top+1 >= MAX){
      throw new RuntimeException("Stack full");
    }
    System.out.println(item);
    Stack[++top] = item;

  }

  public int pop(){
    //check if empty
    if(top < 0){
      throw new RuntimeException("Stack Empty");
    }

    return Stack[top--];

  }

  public int peek(){
    //check if empty
    if(top < 0){
      throw new RuntimeException("Stack Empty");
    }

    return Stack[top];
  }

  //returns true if there is nothing in the stack
  public boolean isEmpty(){
    return (top < 0);
  }

}
