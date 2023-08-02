import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HasMap {
    public static void main(String[] args){
        Map<String, Integer> familia = new HashMap<>();
        familia.put("Kevin",25);
        familia.put("Ivon",42);
        familia.put("Karina",46);

        int edadKarina = familia.get("Karina");
        System.out.println("Karina tiene "+edadKarina+" años.");

        boolean existeFamilia = familia.containsKey("Lalo");
        if(existeFamilia){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }

        List<Map.Entry<String,Integer>> lista = new ArrayList<>(familia.entrySet());
        lista.sort(Map.Entry.comparingByValue());
        lista.forEach(System.out::println);
    }
}
