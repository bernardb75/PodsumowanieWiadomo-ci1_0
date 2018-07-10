public class ImieNazwisko {
    public static void main(String[] args) {
        String nazwa = "Bernard Babicz";
        String test = " abcdefghiljklmoprstwyz";
        int wynik = 0;
        for (int i = 0; i < nazwa.length(); i++) {
            for (int j = 0; j < test.length(); j++) {
                if(nazwa.charAt(i) == test.charAt(j)) {
                    wynik = test.charAt(i);
                }
            }
        }
        int modulo = wynik%2;
        System.out.println(modulo);
    }
}
