package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userClearDataAccessObject;
    final ClearOutputBoundary userClearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary) {
        this.userClearDataAccessObject = clearDataAccessInterface;
        this.userClearPresenter = clearOutputBoundary;
    }


    @Override
    public void execute() {
            ArrayList<String> message = userClearDataAccessObject.clear();
            ClearOutputData clearOutputData = new ClearOutputData(message);
            userClearPresenter.prepareSuccessView(clearOutputData);
    }

}