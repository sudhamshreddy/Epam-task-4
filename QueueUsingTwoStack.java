import java.util.*;
class QueueUsingTwoStack{
	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		int Tcase=sc.nextInt();
		QueueUsingTwoStack q=new QueueUsingTwoStack();
		for(int i=0;i<Tcase;i++)
        {
            int n=sc.nextInt();
            if(n==1)
            {
                int x=sc.nextInt();
                q.enQueue(x,s1,s2);
            }
            else if(n==2)
                q.deQueue(s1,s2);
            else
                q.display(s1,s2);
        }
	}
	public static void enQueue(int x,Stack<Integer> s1,Stack<Integer> s2)
    {
        s1.push(x);
    }
    public static void deQueue(Stack<Integer> s1,Stack<Integer> s2)
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }
    public static void display(Stack<Integer> s1,Stack<Integer> s2)
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        System.out.println(s2.peek());

    }
}