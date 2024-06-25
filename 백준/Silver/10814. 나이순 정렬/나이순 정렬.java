import java.io.*;
import java.util.*;

class member implements Comparable<member> {
    public int idx, age;
    public String name;

    member(int idx, int age, String name) {
        this.idx = idx;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(member m) {
        if(this.age == m.age)
            return this.idx - m.idx;
        return this.age - m.age;
    }
}

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<member> mem = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            mem.add(new member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(mem);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(mem.get(i).age + " " + mem.get(i).name + "\n");
        }

        System.out.println(sb);
    }
}