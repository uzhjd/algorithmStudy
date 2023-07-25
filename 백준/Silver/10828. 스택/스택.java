import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int result = -1;
        int cnt = Integer.parseInt(bf.readLine());

        
        for(int i = 0; i < cnt; i++) {
            String str = bf.readLine();
            String[] arr = str.split(" ");

            switch (arr[0]) {
                case "push":
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "pop":
                    if(stack.empty()) result = -1;
                    else result = stack.pop();
                    System.out.println(result);
                    break;
                case "size":
                    result = stack.size();
                    System.out.println(result);
                    break;
                case "empty":
                    if(stack.empty()) result = 1;
                    else result = 0;
                    System.out.println(result);
                    break;
                case "top":
                    if(stack.empty()) result = -1;
                    else result = stack.peek();
                    System.out.println(result);
                    break;
            }
        }
        return ;
    }
}
