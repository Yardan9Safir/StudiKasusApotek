package Model;
import Entity.ObatEntity;
import java.util.ArrayList;

public class ObatModel implements InterfaceModels {

    public ArrayList<ObatEntity> DatabaseObat;

    public ObatModel() {
        DatabaseObat = new ArrayList<>();
    }

    public void buatDataObat(ObatEntity dataObat) {
        DatabaseObat.add(dataObat);
    }

    public void updateDataObat(int index, ObatEntity dataObat) {
        DatabaseObat.set(index, dataObat);
    }

    public void delete(int index) {
        DatabaseObat.remove(index);
    }

    @Override
    public void tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
