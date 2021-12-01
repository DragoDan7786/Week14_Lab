package Lab14;
import java.util.*;
import java.util.Scanner;
public class ParenMatch
{
 public static void main (String[] args)
 {
Stack s = new Stack();
String line; // the string of characters to be checked
Scanner scan = new Scanner(System.in);
System.out.println ("\nParenthesis Matching");
System.out.print ("Enter a parenthesized expression: ");
line = scan.nextLine();
// loop to process the line one character at a time
boolean correctNum = true;
for(int i = 0 ; i < line.length() && correctNum ; i++){
    if(line.charAt(i) == '(' )
        s.push(line.charAt(i));
    if(line.charAt(i) == ')'){
        if(s.isEmpty()){
            System.out.println("Too many right parentheses");
            correctNum = false;
        }
        else{
            s.pop();
        }
    }
}
// print the results
if(s.isEmpty() && correctNum == true){
   System.out.println("There is the correct number of parenthesis in the expression");
   Stack number = new Stack();
   Stack operators = new Stack();
   for(int j = 0 ; j < line.length() ; j++){
        char o = line.charAt(j);
        if(o == '%' || o ==  '/' || o == '*' || o == '+' || o == '-' )
            operators.push(o);
        else if(o == ')')
            System.out.println("");
            //evaluate expression with 2 pops from number and one pop from operator
        else
            number.push(line.charAt(j));
   }
    System.out.println(number.pop());
}
else if(s.isEmpty() == false)
   System.out.println("Too many left parentheses");
 }
}
