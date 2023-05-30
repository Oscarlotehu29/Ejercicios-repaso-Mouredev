package EjercicosWeb.java;

public class EjercicioUno {
    public static void main(String[] args) {
        SumaMultiplos();
    }
    public static void SumaMultiplos(){
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("La suma de los multiplos de 3 y 5 es: " + sum);
    }
}
