package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.signup.SignupInputData;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary userclearUsecaseInteractor;

    public ClearController(ClearInputBoundary userclearUsecaseInteractor){
        this.userclearUsecaseInteractor = userclearUsecaseInteractor;
    }
    public void execute(){
        userclearUsecaseInteractor.execute();
    }
}
