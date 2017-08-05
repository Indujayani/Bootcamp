import java.util.*;

public class Sort{

public static void main(String[] args){

	Stack<Integer> input=new Stack<Integer>();
	Stack<Integer> output=new Stack<Integer>();
	input.push(5);
	input.push(2);
	input.push(6);
	input.push(1);
	input.push(8);
	input.push(4);
	int size=input.size();
	

	

	while(!input.isEmpty()){
		 int tmp = input.pop();
            
            while(!output.isEmpty() && output.peek() > tmp) {
                input.push(output.pop());
            }
           output.push(tmp);
	}

	for(int x=0;x<size;x++){
		System.out.println(output.get(x).toString());
	}
}

}