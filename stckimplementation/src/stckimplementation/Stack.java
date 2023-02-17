package stckimplementation;

public class Stack {
int array[] = new int[5];
int top = 0;
private boolean push(int x)
{
	top ++;
	array[top] = x;
	System.out.println("Element pushed="+x);
	return true;
}
private int pop()
{
	int x = array[top--];
	System.out.println("Element popped from the Stack="+x);
	return x;
}
private int peek() {
	return array[top];
}
public static void main(String[] args) {
	Stack s = new Stack();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.pop();
	System.out.println("Element present at the top="+(s.peek()));
}
}
