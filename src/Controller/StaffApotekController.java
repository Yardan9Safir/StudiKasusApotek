package Controller;

import Entity.StaffApotekEntity;
import Model.AllObjectM;
import java.util.ArrayList;

public class StaffApotekController {

    int indexLogin = 0;

    public StaffApotekController() {
    }

    public void dataAdmin() {
        String namaStaff[] = {"Yardan Safir", "Saad Budiman", "Wildan Abdul", "Faktul Diki"};
        String kodeStaff[] = {"01", "02", "03", "04"};
        String UsernameStaff[] = {"12","34","56","78"};
        String PasswordStaff[] = {"21", "43", "65","87"};
        String PengalamanKerja[] = {"10", "2","3","4"};
        for (int i = 0; i < kodeStaff.length; i++) {
           AllObjectM.StaffM.buatDataObat(new StaffApotekEntity(namaStaff[i],kodeStaff[i],UsernameStaff[i],PasswordStaff[i],PengalamanKerja[i]));
        }
    }

    public void login(String username, String passwordAdmin) {
        indexLogin = AllObjectM.StaffM.cekData(username, passwordAdmin);
    }

    public StaffApotekEntity StaffEt() {
        return AllObjectM.StaffM.showDataAdmin(indexLogin);
    }
    
    public ArrayList<StaffApotekEntity> ambilData(){
        return AllObjectM.StaffM.AmbilDataStaff();
    }
}
