import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ClaseArrayList miListaArreglos = new ClaseArrayList();

        miListaArreglos.add(2, 5.5, 2);
        miListaArreglos.add(6,8.5, 9);
        miListaArreglos.add(10,7.4, 20);
        miListaArreglos.add(82,27.6, 25);
        miListaArreglos.listarElementos();

        int num1 = 7;
        double num2 = 12.25;
        float num3 = 22;

        ArrayList<Integer> miInt = new ArrayList<Integer>();
        ArrayList<Double> miDouble = new ArrayList<Double>();
        ArrayList<Float> miFloat = new ArrayList<Float>();

        miInt.add((Integer) num1);
        miDouble.add((Double) num2);
        miFloat.add((Float) num3);

        System.out.println("Mi Integer: " + miInt);
        System.out.println("Mi Double: " + miDouble);
        System.out.println("Mi Float: " + miFloat);

    }
}