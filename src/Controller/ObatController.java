package Controller;
import Entity.ObatEntity;
import Model.AllObjectM;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ObatController {

    public void create(String nama, String kode, String kegunaan, int harga) {
        AllObjectM.ObatM.buatDataObat(new ObatEntity(nama, kode, kegunaan, harga));
    }

    public void updateDataObat(int index, String nama, String kode, String kegunaan, int harga) {
        AllObjectM.ObatM.updateDataObat(index, new ObatEntity(nama, kode, kegunaan, harga));
    }

    public void delete(int index) {
        AllObjectM.ObatM.delete(index);
    }

    public ArrayList<ObatEntity> getDataObat() {
        return AllObjectM.ObatM.DatabaseObat;
    }

    public DefaultTableModel daftarObat() {
        DefaultTableModel dtmDaftarObat = new DefaultTableModel();
        Object[] kolom = {"index", "Nama Obat", "Kode Obat", "Kegunaan Obat", "Harga Obat"};
        dtmDaftarObat.setColumnIdentifiers(kolom);
        int size = AllObjectM.ObatM.DatabaseObat.size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = i;
            data[1] = AllObjectM.ObatM.DatabaseObat.get(i).getNama();
            data[2] = AllObjectM.ObatM.DatabaseObat.get(i).getKode();
            data[3] = AllObjectM.ObatM.DatabaseObat.get(i).getKegunaan();
            data[4] = AllObjectM.ObatM.DatabaseObat.get(i).getHarga();
            dtmDaftarObat.addRow(data);
        }
        return dtmDaftarObat;
    }
}
