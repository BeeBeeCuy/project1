public class Main {
    public static void main(String[] args) {
        Makanan nasiGoreng = new NasiGoreng();
        Makanan gadoGado = new GadoGado();
        Makanan sate = new Sate();

        System.out.println(nasiGoreng.infoMakanan());
        System.out.println(gadoGado.infoMakanan());
        System.out.println(sate.infoMakanan());

        // Contoh Overloading
        System.out.println("Info Makanan (Overloaded): " + nasiGoreng.infoMakanan());
        System.out.println("Info Makanan (Overloaded): " + gadoGado.infoMakanan());
        System.out.println("Info Makanan (Overloaded): " + sate.infoMakanan());
    }
}