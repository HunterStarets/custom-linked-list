public class Node<T>
{
    private T data;
    private Node<T> next;
 
    public Node(T data) 
    {
        this.next = null;
        this.data = data;
    }
 
    public Node(T data, Node<T> next) 
    {
        this.data = data;
        this.next = next;
    }
 
    public void setLinkNext(Node<T> next) 
    {
        this.next = next;
    }
 
    public Node<T> getLinkNext() 
    {
        return next;
    }
 
    public void setData(T data) 
    {
        this.data = data;
    }
 
    public T getData() 
    {
        return data;
    }
}
