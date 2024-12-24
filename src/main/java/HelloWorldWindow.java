import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldWindow {
    public static void main(String[] args) {
        createAndShowWindow();
    }

    public static void createAndShowWindow() {

        // Mostrar estilos segun el SO
//        JFrame.setDefaultLookAndFeelDecorated(true);

        // JFrame es una ven tana, un panel principal
        var frame = new JFrame("Hola Mundo Swing!");
        var text = new JLabel("Hola Mundo!");

        // Destruir todos los objetos cuando se sale del programa
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un listener
        frame.addWindowListener(new WindowAdapter() {

            // Cuando se cierra la ventana
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("cerrando ventana con exito!");

                // Salir
                System.exit(0);
//                super.windowClosing(e);
            }
        });

        // Agregar al frame el texto
        frame.getContentPane().add(text);

        // Mostrar el frame
        frame.setVisible(true);


        frame.pack();
    }
}
