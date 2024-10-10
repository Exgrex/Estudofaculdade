public class Main {
    public static void main(String[] args) {
        int b = 3;
        int e = 5;
        System.out.println(potencia(b, e));
    }

    public static int potencia(int b, int e) {
        if (e == 0) {
            return 1; 
        }
        return b * potencia(b, e - 1); 
    }
}
