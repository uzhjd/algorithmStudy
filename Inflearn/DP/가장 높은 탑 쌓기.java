import java.util.*;

class box implements Comparable<box> {
    public int width, height, weight;

    box(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(box b) {
        if(this.width == b.width) return this.weight - b.weight;
        return this.width - b.width;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<box> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            list.add(new box(width, height, weight));
        }
        Collections.sort(list);

        arr[0] = list.get(0).height;
        for(int i = 1; i < n; i++) {
            int max = 0;

            for(int j = 0; j < i; j++) {
                if (list.get(i).width > list.get(j).width &&
                        list.get(i).weight > list.get(j).weight) {
                    max = Math.max(max, arr[j]);
                }
            }
            arr[i] = max + list.get(i).height;
        }

        int answer = 0;
        for(int i = 0; i < n; i++)
            answer = Math.max(answer, arr[i]);

        System.out.println(answer);

        return;
    }
}