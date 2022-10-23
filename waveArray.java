import java.util.*;

public class wavearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("enter the size of an array:");
        int n = sc.nextInt();
        System.out.print("enter the" + " " + n + " " + "element in an array :");
        for (int i = 1; i <= n; i++) {
            ar.add(sc.nextInt());
        }

        // System.out.println(wave(ar));
        System.out.println("this is our wave array: " + wave(ar));
    }

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : A)
            pq.add(i);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            temp.add(pq.poll());
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        int i = 0;
        for (i = 0; i < n; i += 2) {
            if ((i + 1) < n)
                ans.add(temp.get(i + 1));
            ans.add(temp.get(i));
        }
        return ans;
    }
}
