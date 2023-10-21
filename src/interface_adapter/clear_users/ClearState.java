package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> usersDeleted;
    public ClearState(interface_adapter.clear_users.ClearState copy) {
        usersDeleted = copy.usersDeleted;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {
    }

    public ArrayList<String> getUsersDeleted() {
        return usersDeleted;
    }

    public void setUsername(ArrayList<String> usersDeleted) {
        this.usersDeleted = usersDeleted;
    }

}