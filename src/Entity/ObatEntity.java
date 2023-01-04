package Entity;

public class ObatEntity extends KomponenApotekEntity {

    private String Kegunaan;
    private int harga;

    public ObatEntity(String nama, String Kode, String Kegunaan, int harga) {
        super(nama, Kode);
        this.Kegunaan = Kegunaan;
        this.harga = harga;
    }

    public String getKegunaan() {
        return Kegunaan;
    }

    public void setKegunaan(String Kegunaan) {
        this.Kegunaan = Kegunaan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public void setKode(String Kode) {
        super.setKode(Kode); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKode() {
        return super.getKode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

}
