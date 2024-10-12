class Makanan {
    private String nama;
    private String asal;

    public Makanan(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String infoMakanan() {
        return "Makanan: " + nama + ", Asal: " + asal;
    }
}
