import java.util.ArrayList;
import java.util.List;

class Stack<T>{

	public static void main(String[] args){
		Stack<Integer> myNewStack = new Stack<Integer>();

		System.out.println(myNewStack.toString());
		myNewStack.push(1);
		myNewStack.push(2);
		myNewStack.push(3);
		System.out.println(myNewStack.toString());

		System.out.println(myNewStack.pop() + 1);
		System.out.println(myNewStack.toString());
	}

	private int top;
	private List<T> stack;

	public Stack(){
		top = -1;
		stack = new ArrayList<T>();
	}

	public void push(T obj){
		stack.add(obj);
		top++;
	}

	public T pop(){
		T temp = stack.get(top);
		stack.remove(top--);
		return temp;
	}

	public String toString(){
		if(top!=-1){
			StringBuffer sBuffer = new StringBuffer("{");
			for(int i=top; i>0; i--){
				sBuffer.append(stack.get(i).toString() + ",");
			}
			sBuffer.append(stack.get(0).toString() + "}");

			return sBuffer.toString();
		}
		else{
			return "{}";
		}
	}

}
