package Model;

import Entity.StaffApotekEntity;
import java.util.ArrayList;

public class StaffApotekModel implements InterfaceModels{
    
    public ArrayList<StaffApotekEntity> DatabaseStaffAptk = new ArrayList<>();
    
    public void buatDataObat(StaffApotekEntity dataStaff) {
        DatabaseStaffAptk.add(dataStaff);
    }

    public void updateDataObat(int index, StaffApotekEntity dataStaff) {
        DatabaseStaffAptk.set(index, dataStaff);
    }

    public void delete(int index) {
        DatabaseStaffAptk.remove(index);
    }

    @Override
    public void tampilData() {
        
    }
    
    public int cekData(String username, String passwordAdmin) {
        int loop = 0;
        for (StaffApotekEntity ApotekEt : DatabaseStaffAptk) {
            if (ApotekEt.getUsername().equals(username) && ApotekEt.getPassword().equals(passwordAdmin)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public StaffApotekEntity showDataAdmin(int index) {
        return DatabaseStaffAptk.get(index);
    }
    
    public ArrayList<StaffApotekEntity> AmbilDataStaff(){
        return DatabaseStaffAptk;
    }
    
}
