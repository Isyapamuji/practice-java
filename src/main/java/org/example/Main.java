package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("Nama saya Isya");
        System.out.print("Ini tanpa spasi");
        System.out.print("Ini tanpa spasiii");
        System.out.print("Ini pake spasi");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        // data type dan variable
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "isya";
        char q = 'Y';
        Boolean flag2 = false; //true

        // Arithmathic Operation
        int result = a / b;
        int result2 = (int) (a / c); // 1 int dibagi 1 float --> Hierarki float lebih tinggi (hasilnya float)
        float result3 = a / c; // 10 dibagi 3
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        // if, else, else if
        int timeStart = 8;
        int timeFinish = 17;
        int waktuMasuk = 9; //waktu karyawan masuk
        int waktuPulang = 20;

        // karyawan yg masuk tepat waktu, dan pulang tepat waktu atau lebih lama, diberikan selamt
        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat, anda masuk tepat waktu");
            System.out.println("Anda Sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");
            // karyawan yang masuk tepat waktu, pulang duluan, di cengin
        } else if (waktuMasuk <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("Yea di cengin");

        // karyawan yang telat masuk, tapi pulang lebih lama atau tepat waktu, dimaafkan
        } else if (waktuMasuk >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Dimaafkan");

        // karyawan yg telat masuk, pulang duluan disoraki
        }else {
            System.out.println("TElAT NI YEE");
            System.out.println("Anda Sampai " + (waktuMasuk - timeStart) + " jam lebih lama");

        }

        int day = 5;
        switch (day){
            case 1:
                System.out.println("WFH");
                break;
            case 2:
                System.out.println("WFO");
                break;
            case 3:
                System.out.println("CUTI");
                break;
            default:
                System.out.println("Saya LIBUR");
                break;
        }



    }
}