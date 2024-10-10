public class Recursivo {
    public static void main(String[] args) {
        binario(10);
    }

    public static void binario(int n) {
        if(n < 2){
        System.out.println(n);
        }
        else{
            binario(n/2);
        }
    }
    
}
