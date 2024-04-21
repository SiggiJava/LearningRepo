package org.example.mvcpattern;

public class Model {

    private View view;
    private String data;

    public void setView(View view) {
        this.view = view;
    }

    public void onChange(){
        this.data = "Data changed!";
        notifyView();
    }

    public void notifyView() {
        view.notifyAboutChange();
    }

    public String getData() {
        return this.data;
    }
}
