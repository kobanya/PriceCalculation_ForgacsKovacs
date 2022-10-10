import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        read_in();
        KartyasAr();
    }

//beolvasás

    static void read_in() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a megrendelés árát: ");
        MegrendelesAra = scanner.nextInt();

        System.out.println("Adja meg a csomag súlyát: ");
        CsomagSulya = scanner.nextInt();

        System.out.println("Kártyával fizet ?  igen = 1 / nem = 2 :");
        Kartya = scanner.nextInt();

    }

    static int MegrendelesAra;
    static int CsomagSulya;
    static int Kartya;
    static int OsszegKatryaNelkul;
    static int OsszegKartyaval;

    // ha kártyával vásárolsz, 3 % kedvezményt kapsz
    static int KartyasAr() {
        if (Kartya == 1) {
            OsszegKartyaval = MegrendelesAra+( MegrendelesAra * 3 / 100);
            System.out.println("A termékek ára ha kártyával fizeted: " + OsszegKartyaval+"Euro");
        } else if (Kartya == 2) {
            //return OsszegKatryaNelkul;
            System.out.println("A termékek ára ha készpénzben fizeted: " + MegrendelesAra+" Euro");
        } else {
            System.out.println("csak 0 és 1 választható");
        }

        return 0;
    }
}