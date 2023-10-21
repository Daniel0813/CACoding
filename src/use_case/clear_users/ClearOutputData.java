package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private ArrayList<String> usersDeleted;
    public ClearOutputData(ArrayList<String> usersDeleted) {
        this.usersDeleted = usersDeleted;
    }
    public ArrayList<String> getUsersDeleted() {
        return usersDeleted;
    }
}
