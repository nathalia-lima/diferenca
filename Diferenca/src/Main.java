import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int DIFERENCA = a * b - c * d;
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}