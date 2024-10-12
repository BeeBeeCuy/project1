class NasiGoreng extends Makanan {
    public NasiGoreng() {
        super("Nasi Goreng", "Indonesia");
    }

    @Override
    public String infoMakanan() {
        return super.infoMakanan() + " (Spesial Nasi Goreng)";
    }
}