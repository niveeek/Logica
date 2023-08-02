/*@Programdor: Ing. Kevin Carlos López González,
 * @Fecha: 02/10/2023,
 * @Ejercicio: 1 Lógica,
 * @Descripción: dada una frase escrita por el usuario, en un nuevo proyecto de java realice lo siguiente:
1.	Ordene las palabras por el peso de sus letras de forma ascendente.
a)	Por ejemplo, a la letra “a” se le asignará el valor 1, a la letra “b” el valor 2. etc.
b)	Si el usuario ingresa la frase “Juan canta”, la salida esperada del ejercicio será
Canta = 40
Juan = 47
2.	Imprima la respuesta en consola.
 * */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class Main {
    public void ejercicio1(String text){
        int result=0;
        byte[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        Map<String,Integer> map = new HashMap<>();
        String[] splitText = text.toLowerCase().split(" ");
        //BUCLES DE LA CADENA DE TEXTO
        for (String name : splitText) {
            for (byte i = 0; i < name.length(); i++) {
                for (byte j = 0; j < letters.length; j++) {
                    if (name.charAt(i) == letters[j]) {
                        result = result + numbers[j];
                    }
                }
            }
            map.put(name, result);
            result = 0;
        }
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.ejercicio1("Inteligencia Artificial");
    }
}