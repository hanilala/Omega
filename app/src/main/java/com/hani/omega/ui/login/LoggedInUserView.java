package com.hani.omega.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayName;
    private String mAge;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }

    public String getmAge() {
        return mAge;
    }
}
