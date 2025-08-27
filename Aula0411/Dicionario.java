package Aula0411;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Dicionario {
    public static void main(String[] args) {
        //Exemplo diferença dicionario e listas
        List<Map<String, String>> listaDicionario = new ArrayList<>();

        Map<String, String> dicionario1 = new HashMap<>();
        dicionario1.put("nome", "João");
        dicionario1.put("idade", "25");

        listaDicionario.add(dicionario1);
    }
}
