package algo.problem;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by deepak on 11/26/18.
 */
public class TicketPath {

    public static void main(String[] args) {
        Map<String, String> itinereay = generateTickets();

        List<String> path = getPath(itinereay);
        System.out.println("Path= " + path);
    }

    private static List<String> getPath(Map<String, String> itinereay) {
        List<String> path = new ArrayList<>();

        String source = getSource(itinereay);
        System.out.println("Source =" + source);

        path.add(source);

        while (itinereay.get(source) != null) {
            path.add(itinereay.get(source));
            source = itinereay.get(source);

        }

        return path;

    }

    private static String getSource(Map<String, String> itinereay) {


        List<String> destinations = new ArrayList<>();

        for (Map.Entry<String, String> entry : itinereay.entrySet()) {
            destinations.add(entry.getValue());
        }

        for (Map.Entry<String, String> entry : itinereay.entrySet()) {
            if (!destinations.contains(entry.getKey())) {
                return entry.getKey();
            }
        }

        return null;
    }

    private static Map<String, String> generateTickets() {
        Map<String, String> ticktes = new HashMap<>();

        ticktes.put("Phoenix", "NYC");


        ticktes.put("Phoenix", "NYC");

        ticktes.put("NYC", "Boston");

        ticktes.put("SFO", "LA");

        ticktes.put("LA", "Phoenix");

        return ticktes;
    }

}
