public class StackTester
{
  public static void main(String[] args) {
    AStack myStack = new AStack();
    System.out.println(myStack.isEmpty());
    //myStack.pop();
    for (int i = 0; i < 1000; i++){
      myStack.push(i);
    }

    while(!myStack.isEmpty()){
        System.out.println(myStack.pop());
    }


  }

}
