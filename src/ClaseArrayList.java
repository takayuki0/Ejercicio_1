import java.util.ArrayList;

public class ClaseArrayList {

    private ArrayList<TipoPrimitivo> elementosArrayList;

    public ClaseArrayList() {
        elementosArrayList = new ArrayList<>();
    }

    public void add(int a, double b, float c) {
        elementosArrayList.add(new TipoPrimitivo(a, b, c));
    }

    public void listarElementos() {
        for (TipoPrimitivo elemento : elementosArrayList) {
            System.out.println(elemento);
        }
    }

}
