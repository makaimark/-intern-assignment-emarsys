import java.util.ArrayList;
import java.util.List;

public class OrderLogic {

    public static List<String> getAllDestination(List<String[]> destinationDependencies){
        List<String> listOfDestinations = new ArrayList<>();
        for(String[] line : destinationDependencies){
            listOfDestinations.add(line[0]);
        }
        return listOfDestinations;
    }

    public static List<String> orderDestinations(List<String[]> destinationDependencies){
        List<String> allDestinations = getAllDestination(destinationDependencies);
        for(String[] dependency : destinationDependencies){
            if(!(dependency.length == 1)){
                allDestinations.remove(allDestinations.indexOf(dependency[1]));
                allDestinations.add(allDestinations.indexOf(dependency[0]), dependency[1]);
            }
            System.out.println(allDestinations);
        }
        //System.out.println(allDestinations);
        return allDestinations;
    }
}
