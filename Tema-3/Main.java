public class Main {
    public static void main(String[] args) throws Exception {
        suma(2, 3, 4);
    
        Coche miCoche = new Coche();

        miCoche.incPuertas();

        System.out.println("Numero de puertas: " + miCoche.numPuertas);
    }

    static void suma(int x, int y, int z ) {
        int result = x + y +z;
        System.out.println(result); 
    }

}

class Coche {

    public int numPuertas = 3;

    public void incPuertas() {
        this.numPuertas++;
    }
}