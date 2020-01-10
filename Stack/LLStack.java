import java.io.*;
import java.util.*;

//Stack Implementation with Nodes
public class LLStack<T>
{
  //Stack node
  private static class StackNode<T>
  {
    private T data;
    private StackNode<T> next;

    public StackNode (T inputData){
      data = inputData;
    }
  }

  //indicates top of stack
  private StackNode<T> top;

  //adds element to top of the stack
  public void push (T item){
    StackNode<T> node = new StackNode<>(item);
    node.next = top;
    top = node;
  }

  //returns and removes the top element off the stack
  public T pop (){
    //check if empty
    if (top == null){
      throw new EmptyStackException();
    }
    T item = top.data;
    top = top.next;
    return item;
  }

  //returns top element in stack
  public T peek(){
    if (top == null){
      throw new EmptyStackException();
    }
    T item = top.data;
    return item;
  }

  //returns true if stack is empty
  public boolean isEmpty(){
    if (top == null){
      return true;
    }
    return false;
  }

}
