package Entity;

public abstract class KomponenApotekEntity {
    private String nama;
    private String Kode;

    public KomponenApotekEntity(String nama, String Kode) {
        this.nama = nama;
        this.Kode = Kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }
}
