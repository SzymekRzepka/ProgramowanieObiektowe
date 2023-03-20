import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("Imię: Szymon, wiek: 20");

        //Zadanie 2
        System.out.println("Wprowadź liczbe a: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Wprowadź liczbe b: ");
        int b = in.nextInt();
        System.out.println("Suma liczb "+ a +"+"+ b +"="+ (a+b));
        System.out.println("Różnica liczb "+ a +"-"+ b +"="+ (a-b));
        System.out.println("Iloczyn liczb "+ a +"*"+ b +"="+ (a*b));

        //Zadanie 3
        System.out.println("Sprawdz czy liczba jest parzysta(wprowadz liczbe): ");
        int c = in.nextInt();
        boolean czyParzysta;
        if(c % 2 == 0){
            czyParzysta = true;
        } else {
            czyParzysta = false;
        }
        System.out.println("Czy liczba jest parzysta: "+ czyParzysta);

        //Zadanie 4
        System.out.println("Sprawdz czy liczba dzieli sie przez 3 i 5(podaj liczbe): ");
        int d = in.nextInt();
        boolean czyPodzielna;
        if((d % 3 == 0) && (d % 5 == 0)){
            czyPodzielna = true;
        }else {
            czyPodzielna = false;
        }
        System.out.println("Czy liczba jest podzielna przez 3 i 5: "+ czyPodzielna);

        //Zadanie 5
        System.out.println("Wprowadz liczbe potęgowaną: ");
        int e = in.nextInt();
        double potegowanie = Math.pow(e, 3);
        System.out.println("Liczba "+ e +" do potęgi 3 = "+potegowanie);

        //Zadanie 6
        System.out.println("Wprowadz liczbe pierwiastkowaną: ");
        int f = in.nextInt();
        double pierwiastkowanie = Math.sqrt(f);
        System.out.println("Pierwiastek kwadratowy z liczby "+ f +" = "+pierwiastkowanie);

        //Zadanie 7
        System.out.println("Wprowadz liczbe a: ");
        int a1 = in.nextInt();
        System.out.println("b: ");
        int b1 = in.nextInt();
        System.out.println("c: ");
        int c1 = in.nextInt();
        boolean trojkat;
        int dlugosc;
        if((a1 > b1) && (a1 > c1)){
            dlugosc = b1 + c1;
            if(dlugosc > a1){
                trojkat = true;
            }else trojkat = false;
        } else if((b1 > a1) && (b1 > c1)){
            dlugosc = a1 + c1;
            if(dlugosc > b1){
                trojkat = true;
            }else trojkat = false;
        } else if((c1 > a1) && (c1 > b1)){
            dlugosc = a1 + b1;
            if(dlugosc > c1){
                trojkat = true;
            }else trojkat = false;
        }else{
            trojkat = false;
        }
        System.out.println("Czy z takich dlugosci bokow mozna zbudowac trojkat prostokatny: "+ trojkat);

    }
}