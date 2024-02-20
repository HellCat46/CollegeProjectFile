import java.awt.*;
public class menuExample {
    menuExample(){
        Frame frame = new Frame();

        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        file.add(new MenuItem("Exit"));
        menuBar.add(file);

        menuBar.add(new Menu("Edit"));

        Menu view = new Menu("View");
        view.add(new MenuItem("Prev"));
        view.add(new MenuItem("Next"));
        menuBar.add(view);

        frame.setMenuBar(menuBar);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args){
        new menuExample();
    }
}
