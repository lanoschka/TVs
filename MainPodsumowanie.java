package Paradygmaty.Podsumowanie.telewizory;

import Paradygmaty.Podsumowanie.telewizory.Philips.P55PUS7334;
import Paradygmaty.Podsumowanie.telewizory.Samsung.UE43RU172;

import java.util.Scanner;

public class MainPodsumowanie {
    public static void main(String[] args) {
        obslugaPilota();

    }
    private static void obslugaTelewizora(){
        Scanner scanner = new Scanner(System.in);

        Telewizor tv = new P55PUS7334("unikalneID12334"); //tu se moge zmienic na id philipsa i sie zmieni bo implementuja jeden interface
        int opcja = 0;
        System.out.println("1. Wlacz; 2. Wylacz; 3. Zmien program; 4. Zakoncz program");

        while(opcja !=4){
            opcja = scanner.nextInt();

            switch (opcja){
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("podaj numer kanału: ");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
                    break;

            }
        }
        scanner.close();

    }
    private static void obslugaPilota(){
        Pilot pilot = new PilotNoName();
        Telewizor telewizor = new UE43RU172("UnikalneID123");
        pilot.sparujTelewizor(telewizor);

        Scanner scanner = new Scanner(System.in);
        int opcja;

        System.out.println("0. Nacisnij czerony; 1. Nacisnij 1; 2. Nacisnij 2; 3. Nacisnij 3; 4. Zakoncz");

        do{
            opcja = scanner.nextInt();
            switch (opcja){
                case 0:
                    pilot.nacisnijCzerwony();
                    break;
                case 1:
                    pilot.nacisnijJeden();
                    break;
                case 2:
                    pilot.nacisnijDwa();
                    break;
                case 3:
                    pilot.nacisnijTrzy();
            }
        }while(opcja != 4);
        {
            scanner.close();
        }
    }
}
