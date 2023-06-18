public class TipoPrimitivo {

    private int intElement;
    private double doubleElement;
    private float floatElement;

    public TipoPrimitivo(int intElement, double doubleElement, float floatElement) {
        this.intElement = intElement;
        this.doubleElement = doubleElement;
        this.floatElement = floatElement;
    }

    public int getIntElement() {
        return intElement;
    }

    public void setIntElement(int intElement) {
        this.intElement = intElement;
    }

    public double getDoubleElement() {
        return doubleElement;
    }

    public void setDoubleElement(double doubleElement) {
        this.doubleElement = doubleElement;
    }

    public float getFloatElement() {
        return floatElement;
    }

    public void setFloatElement(float floatElement) {
        this.floatElement = floatElement;
    }

    @Override
    public String toString() {
        return "Elementos de tipo Primitivo: " +
                "\nElemento int: " + intElement +
                "\nDouble Elemento double: " + doubleElement +
                "\nElemento float: " + floatElement +
                "\n_______________________________________________________";
    }
}
