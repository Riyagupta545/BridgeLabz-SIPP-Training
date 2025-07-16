package ScenarioBasedQuestions;
import java.util.*;

public class FoodFest {
    static class Stall {
        String name;
        int footfall;

        Stall(String name, int footfall) {
            this.name = name;
            this.footfall = footfall;
        }
    }

    public static List<Stall> mergeSort(List<Stall> stalls) {
        if (stalls.size() <= 1) return stalls;
        int mid = stalls.size() / 2;
        List<Stall> left = mergeSort(stalls.subList(0, mid));
        List<Stall> right = mergeSort(stalls.subList(mid, stalls.size()));
        return merge(left, right);
    }

    private static List<Stall> merge(List<Stall> a, List<Stall> b) {
        List<Stall> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i).footfall <= b.get(j).footfall)
                result.add(a.get(i++));
            else
                result.add(b.get(j++));
        }
        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));
        return result;
    }

    public static void main(String[] args) {
        List<Stall> stalls = Arrays.asList(
            new Stall("Tacos", 200),
            new Stall("Pizza", 150),
            new Stall("Biryani", 180)
        );
        List<Stall> sorted = mergeSort(stalls);
        for (Stall s : sorted)
            System.out.println(s.name + ": " + s.footfall);
    }
}

