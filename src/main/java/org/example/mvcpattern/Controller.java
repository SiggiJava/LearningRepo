package org.example.mvcpattern;

public class Controller {

    View view;
    Model model;

    public Controller() {
        this.view = new View(this);
        this.model = new Model();
        this.linkViewAndModel();
    }

    private void linkViewAndModel() {
        view.setModel(model);
        model.setView(view);
    }

    private static void main(String[] args) {
        Controller controller = new Controller();

    }

}
