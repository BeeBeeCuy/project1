class Sate extends Makanan {
    public Sate() {
        super("Sate", "Madura");
    }

    @Override
    public String infoMakanan() {
        return super.infoMakanan() + " (Spesial Sate)";
    }
}