import java.util.Stack;

public class FindTheRi8Par {
	public boolean getPrint()
	{
		String sts = "{[]}}";
		Stack<Character> stack = new Stack<Character>();
		char[] charData = sts.toCharArray();
		for (char data : charData) {
             if(data=='['||data=='{'||data==')')
             {
            	 stack.add(data);
             }
             else if(data==']')
             {
            	 if(stack.isEmpty()||stack.peek()!=']')
            	 {
            		 return false ;
            	 }
            	 stack.pop();
             }
		}
		return false;
	}
	public static void main(String[] args) {
		

	}
}