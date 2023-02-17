package implementingTwoStackUsingSingleArray;

public class TwoStack {
int size;
int top1,top2;
int array[];

public TwoStack(int size)
{
	this.size = size;
	array = new int[size];
	top1 = -1;
	top2 = size;
	
}
private void push1(int x)
{
	if(top1 < top2)
	{
		top1++;
		array[top1]=x;
		System.out.println("Pushed element in the stack1 is"+x);
	}
	else
	{
		System.out.println("Stack is overflow");
		System.exit(1);
	}
}
private void push2(int x)
{
	if(top1 < top2-1)
	{
		top2--;
		array[top2]=x;
		System.out.println("Pushed element in the stack2 is"+x);
	}
	else
	{
		System.out.println("Stack is overflow");
		System.exit(1);
	}
}
private int pop1()
{
	if(top1 >= 0)
	{
		int x  = array[top1];
		System.out.println("Popped element in the stack1 is"+x);
		top1--;
		return x;
	}
	else
	{
		System.out.println("Stack is underflow");
		System.exit(1);
	}
	return 0;
}
private int pop2()
{
	if(top2 < size)
	{
		int x  = array[top2];
		System.out.println("Popped element in the stack2 is"+x);
		top2--;
		return x;
	}
	else
	{
		System.out.println("Stack is underflow");
		System.exit(1);
	}
	return 0;
}
public static void main(String[] args) {
	TwoStack t = new TwoStack(10);
	t.push1(10);
	t.push1(20);
	t.push1(30);
	t.pop1();
	t.push2(50);
	t.push2(60);
	t.push2(70);
	t.pop2();
}
}
