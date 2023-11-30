/*
* File: Controller.java
* Author: Béres Délia
* Copyright: 2023, Béres Délia
* Group: Szoft II_1_E
* Date: 2023-11-30
* Github: https://github.com/deliaberes/
* Licenc: GNU GPL
*/
public class Controller implements Controllable {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }

    @Override
    public void start() {
        System.out.println("Elindult a start metódus!");
    }

    @Override
    public void stop() {
        System.out.println("Elindult a stop metódus!");

    }

    @Override
    public void restart() {
        System.out.println("Elindult a restart metódus!");

    }
}
