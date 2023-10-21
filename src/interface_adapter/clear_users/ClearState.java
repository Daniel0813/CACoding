package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> usersDeleted;
    public ClearState(ClearState copy) {
        usersDeleted = copy.usersDeleted;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {
    }

    public ArrayList<String> getUsersDeleted() {
        return usersDeleted;
    }

    public void setUsersDeleted(ArrayList<String> usersDeleted) {
        this.usersDeleted = usersDeleted;
    }

}