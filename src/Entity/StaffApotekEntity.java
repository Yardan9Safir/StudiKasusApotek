package Entity;

public class StaffApotekEntity extends KomponenApotekEntity{
    private String Username;
    private String Password;
    private String PengalamanKerja;

    public StaffApotekEntity(String nama, String Kode,String Username, String Password, String PengalamanKerja) {
        super(nama, Kode);
        this.Username = Username;
        this.Password = Password;
        this.PengalamanKerja = PengalamanKerja;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPengalamanKerja() {
        return PengalamanKerja;
    }

    public void setPengalamanKerja(String PengalamanKerja) {
        this.PengalamanKerja = PengalamanKerja;
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
