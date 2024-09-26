import java.util.*;
import java.io.*;

class medal implements Comparable<medal> {
    int no, g, s, b;

    medal(int no, int g, int s, int b) {
        this.no = no;
        this.g = g;
        this.s = s;
        this.b = b;
    }

    @Override
    public int compareTo(medal m) {
        if(this.g == m.g) {
            if (this.s == m.s) return m.b - this.b;
            else return m.s - this.s;
        }
        return m.g - this.g;
    }
}

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        medal[] country = new medal[N];

        int ng = 0;
        int ns = 0;
        int nb = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int no = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            if(no == k) {
                ng = gold;
                ns = silver;
                nb = bronze;
            }

            country[no - 1] = new medal(no, gold, silver, bronze);
        }

        Arrays.sort(country);
        int answer = 0;
        for(int i = 0; i < country.length; i++) {

            if(country[i].g == ng && country[i].s == ns && country[i].b == nb){
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);

        return;
    }

}