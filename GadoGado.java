class GadoGado extends Makanan {
    public GadoGado() {
        super("Gado-Gado", "Jakarta");
    }

    @Override
    public String infoMakanan() {
        return super.infoMakanan() + " (Spesial Gado-Gado)";
    }
}