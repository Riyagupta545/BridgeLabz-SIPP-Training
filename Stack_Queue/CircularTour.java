package Stack_Queue;
public class CircularTour {
    static class PetrolPump {
        int petrol, distance;

        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    static int findStartingPoint(PetrolPump[] pumps) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {
            int gain = pumps[i].petrol - pumps[i].distance;
            totalSurplus += gain;
            currentSurplus += gain;

            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int start = findStartingPoint(pumps);
        if (start != -1) {
            System.out.println("Start at pump: " + start);
        } else {
            System.out.println("No solution");
        }
    }
}
