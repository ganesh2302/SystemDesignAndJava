package CodingPractice;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String args[]){
        String str = "{[]{(})}";

        System.out.println(isValid(str));
    }
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for(int i = 0 ; i < s.length() ; i++)
            {

                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                {
                    stack.push(s.charAt(i));
                }
                else if(stack.size() != 0)
                {
                    if(stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '{' && s.charAt(i) == '}'
                            || stack.peek() == '[' && s.charAt(i) == ']')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }

            return stack.empty() ? true : false;

        }

}
