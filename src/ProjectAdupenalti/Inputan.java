package ProjectAdupenalti;

import java.util.Scanner;

public class Inputan {
    Scanner sc = new Scanner(System.in);
    int cekInput (int input){
        System.out.print("\tMasukan Pilihan : ");
        input = sc.nextInt();
        return input;
    }
}
