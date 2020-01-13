class Queue<T>
{
  private class QueueNode<T>
  {
    private T data;
    private QueueNode<T> next;

    public QueueNode(T inputData){
      data = inputData;
    }
  }

  QueueNode front;
  QueueNode last;

  //add item to the back of the queue
  public void add(T item){
    QueueNode q = new QueueNode(item);

    //if empty
    if (front == null){
      front = q;
      last = q;
    }

    last.next = q;
    last = q;

  }

  //remove item from the front of the queue
  public T remove(){
    //if empty
    if (front == null){
      throw new RuntimeException("Queue empty cannot remove");
    }

    T data = front.data;
    front = front.next;

    //check if queue now empty
    if (front == null){
      last = null;
    }

    return data;

  }

  //look at item from the front of the queue
  public T peek(){
    //if empty
    if (front == null){
      throw new RuntimeException("Queue empty cannot peek");
    }
    return front.data;
  }

  //return true if queue is empty
  public boolean isEmpty(){
    return (front == null);
  }
}
