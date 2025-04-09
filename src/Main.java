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
        int[] sugeneruotasMasyvas = intRabdomMasyvas(5,20, 5);
        System.out.println(sugeneruotasMasyvas);
        printMasyvas(sugeneruotasMasyvas);

        System.out.println("\n7 uzduotis =======================================");
        System.out.println(masyvoSuma(sugeneruotasMasyvas));

        System.out.println("\n8 uzduotis =======================================");
        System.out.println(masyvoVidurkis(sugeneruotasMasyvas));

        System.out.println("\n9 uzduotis =======================================");
        spausdinkStaciakampi(12,15);

        System.out.println("\n10 uzduotis =======================================");



        System.out.println("\n11 uzduotis =======================================");


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
    public static int[] intRabdomMasyvas(int min, int max, int lenght){
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
    public static void raidesTarpai(String aaa){
        String sakinys = "Šiandien labai graži diena";
        String replaceSakinys = sakinys.replaceAll(" ", "0");
        System.out.println(replaceSakinys);
    }

























































}