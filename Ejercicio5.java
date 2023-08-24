public class Ejercicio5 {
    public void getTax(int amount) {
        boolean PAY_TAX = true;
        double taxI;
        if(PAY_TAX) taxI = 0.07 * amount;
        else taxI = 0.0;
        System.out.println("El impuesto es : " + taxI);
    }
}
