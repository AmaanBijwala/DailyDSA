package BasicMath;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

        public static String interpret(String command) {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<command.length();i++){
                if(command.charAt(i)=='G'){
                    sb.append("G");
                }
                else if(command.charAt(i+1)==')'){
                    sb.append("o");
                    i+=1;
                }
                else if(command.charAt(i+1)=='a'){
                    sb.append("al");
                    i+=3;
                }
            }
            return sb.toString();
        }

}
/*
 Goal Parser Interpretation
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Example 1:
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

Example 2:
Input: command = "G()()()()(al)"
Output: "Gooooal"
* */