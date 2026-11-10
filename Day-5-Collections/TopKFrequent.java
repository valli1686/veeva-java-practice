import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a - b;
        });

        for (int i = 0; i < Math.min(k, list.size()); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}