import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> tmp = new ArrayList<>();
        boolean check = false;

        for(int i  = 0; i < n; i++) {
            arr.add(br.readLine());
        }

        Collections.sort(arr);

        for(int i = 0; i < n - 1; i++) {
            String str = arr.get(i);
            int len = str.length();
            check = false;

            for(int j = i + 1; j < n; j++) {
                String s = arr.get(j);

                if(len > s.length()) continue;
                if (str.equals(s.substring(0, len))){
                    check = true;
                    break;
                }
            }
            if(!check) {
                tmp.add(str);
//                System.out.println(tmp);
            }
        }

        System.out.println(tmp.size() +1);
        return;
    }
}