//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1 uzduotis =======================================");
        int one = (int) Math.round(Math.random() * 15) + 5;
        int two = (int) Math.round(Math.random() * 25) + 5;
        System.out.println("one = " + one + ", two = " + two);
        suma (one, two);
        suma (5, 2);
        suma (one, 7);

        System.out.println("\n2 uzduotis =======================================");
        double piKvadratas = PISq();
        System.out.println(piKvadratas);

        System.out.println("\n3 uzduotis =======================================");
        System.out.println(sandauga(8, 6));
        System.out.println(sandauga(one, two));
        System.out.println(sandauga(two, 9));

        System.out.println("\n4 uzduotis =======================================");
        int[] skMasyvas = {1,2,3,4,5,6,7,8,9};
        printMasyvas(skMasyvas);

        System.out.println("\n\n5 uzduotis =======================================");
        System.out.println(intRandom(8, 26));
        System.out.println(intRandom(8, 26));
        System.out.println(intRandom(8, 26));

        System.out.println("\n6 uzduotis =======================================");
        int[] sugeneruotasMasyvas = intRandomMasyvas(5,20, 5);
        printMasyvas(sugeneruotasMasyvas);

        System.out.println("\n7 uzduotis =======================================");
        System.out.println(masyvoSuma(sugeneruotasMasyvas));

        System.out.println("\n8 uzduotis =======================================");
        System.out.println(masyvoVidurkis(sugeneruotasMasyvas));

        System.out.println("\n9 uzduotis =======================================");
        spausdinkStaciakampi(12,15);

        System.out.println("\n\n10 uzduotis =======================================");
        String sakinys = "Šiandien labai graži diena";
        raidesTarpai(sakinys);

        System.out.println("\n11 uzduotis =======================================");
        String vardas = "Naglis";
        System.out.println(uzkoduotasSakinys(vardas));

        System.out.println("\n==================SUNKESNI===========================");
        System.out.println("\n1 uzduotis =================================");
        String text = "labas";
        labas(text);

        System.out.println("\n2 uzduotis =================================");
        printRndString(generateRndStr(10));

        System.out.println("\n3 uzduotis =================================");
        int pradinisSkaicius = 3000;
        int sveikiSkaiciai = countSveikiSkaiciai(pradinisSkaicius);
        System.out.println("Skaicius " + pradinisSkaicius + " be liekanos dalijasi is " + sveikiSkaiciai + " sveiku skaiciu (isskyrus vieneta ir pati save).");

        System.out.println("\n4 uzduotis =================================");
        int[] sortedArray = randomMasyvas100();
        printMasyvas(sortedArray);

        System.out.println("\n5 uzduotis =================================");

        System.out.println("\n6 uzduotis =================================");

        System.out.println("\n7 uzduotis =================================");




    }
//===========1 uzduotis=============================
    public static void suma(int pirmas, int antras){
        System.out.println(pirmas + antras);
    }
//===========2 uzduotis==============================
    public static double PISq(){
        return 9.8596;
    }
//=============3 uzdavinys==============================
    public static int sandauga(int vienas, int du){
        return vienas * du;
    }
//=============4 uzdavinys==================================
    public static void printMasyvas(int[] skMasyvas){
        String eilute = "";
        for (int i = 0; i < skMasyvas.length; i++) {
            eilute += skMasyvas[i] + " ";
        }
        System.out.println(eilute);
    }
//===============5 uzduotis=============================
    public static int intRandom(int min, int max){
        int random = (int) Math.round(Math.random() * (max - min)) + min;
        return random;
    }
//==============6 uzduotis==================================
    public static int[] intRandomMasyvas(int min, int max, int lenght){
        int[] naujasMasyvas = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            int random1 = intRandom(min,max);
            naujasMasyvas[i] = random1;
        }
        return naujasMasyvas;
    }
//==============7 uzduotis===================================
    public static int masyvoSuma(int[] sugeneruotasMasyvas){
        int suma = 0;
        for (int i = 0; i < sugeneruotasMasyvas.length; i++) {
            suma += sugeneruotasMasyvas[i];
        }
        return suma;
    }
//=================8 uzduotis=================================
    public static double masyvoVidurkis(int[] sugeneruotasMasyvas){
        double vidurkis = masyvoSuma(sugeneruotasMasyvas)/sugeneruotasMasyvas.length;
        return vidurkis;
    }
//===================9 uzduotis==============================
    public static void spausdinkStaciakampi(int ilgis, int plotis){
        for (int x = 1; x <= ilgis; x++) {
            System.out.println();
            for (int y = 1; y <= plotis; y++) {
                System.out.print("*");
            }
        }
    }
//===================10 uzduotis====================================
    public static void raidesTarpai(String sakinys){
        System.out.println("Sakinyje yra " + sakinys.length() + " simboliai:");
        String replaceSakinys = sakinys.replace(" ", "");
        System.out.println(replaceSakinys.length() + " raides");
        int tarpuSkaicius = sakinys.length() - replaceSakinys.length();
        System.out.println(tarpuSkaicius + " tarpai");
    }
//=================11 uzdavinys=================================
    public static String uzkoduotasSakinys(String vardas){
        String reverseVardas = "";
        for (int i = vardas.length() - 1; i >= 0; i--) {
            reverseVardas = reverseVardas + vardas.charAt(i);
        }
        return reverseVardas;
    }
//    =====================SUNKESNI===========================================
//    ========================================================================

//    =====================1 uzdavinys========================================
    public static void labas(String text){
        System.out.println("---" + text + "---");
    }
//    =====================2 uzdavinys========================================
    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String text1 = "";
        for (int i = 0; i < length; i++) {
            text1 += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text1;
    }
    public static void printRndString(String text1){
        String numbers = "";
        System.out.println(text1);
        for (int i = 0; i < text1.length(); i++) {
            String simbolis = "" + text1.charAt(i);
            if (simbolis.matches("[0-9]")) {
//                System.out.println("[" + simbolis + "]");
                numbers += text1.charAt(i);
            } else {
                if(numbers.length() > 3){
                    System.out.println("[" + simbolis + "]");
                    numbers = "";
                }
                System.out.println(simbolis);
            }
        }
    }
//    =====================3 uzdavinys========================================
    public static int countSveikiSkaiciai(int argumentas){
        int svSk = 0;
        for (int i = 2; i < argumentas - 1; i++) {
            if (argumentas % i == 0){
                svSk++;
                //System.out.println(i);
            }
        }
        return svSk;
    }
//    =====================4 uzdavinys========================================
    public static int[] randomMasyvas100(){
        int[] naujasMasyvas = intRandomMasyvas(33,77,100);
        for (int i = 0; i < naujasMasyvas.length; i++) {
            int dalikliuKiekis = countSveikiSkaiciai(naujasMasyvas[i]);
        }
        return naujasMasyvas;
    }





























































}