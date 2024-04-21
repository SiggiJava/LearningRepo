package org.example.mvcpattern;

public class View {

    private Model model;
    private Controller controller;
    private String dataToShow;

public View(Controller controller) {
    this.controller = controller;
}

    public void notifyAboutChange(){
        this.dataToShow = model.getData();
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
