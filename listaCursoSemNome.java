import java.util.ArrayList;

public class listaCursoSemNome {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listaCC = new ArrayList<ArrayList<String>>();

        listaCC.add(new ArrayList<String>());

        listaCC.add(new ArrayList<String>());
        
        listaCC.add(new ArrayList<String>());
    
        listaCC.get(0).add("Luiza");
        listaCC.get(0).add("Andriza");
        listaCC.get(0).add("Ceretta");

        listaCC.get(1).add("Ceretta");

        listaCC.get(1).sort(null);
    
        listaCC.get(2).add("Miguel");
        listaCC.get(2).add("Ceretta");

        listaCC.get(2).sort(null);
    
    }
}
