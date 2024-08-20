import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWT extends Frame {

    public SimpleAWT() {
        // Configurações do Frame
        setTitle("Exemplo AWT");
        setSize(300, 150);
        setLayout(new FlowLayout());

        // Criando os componentes
        Label label1 = new Label("Input 1:");
        TextField input1 = new TextField(20);

        Label label2 = new Label("Input 2:");
        TextField input2 = new TextField(20);

        Button button = new Button("Enviar");

        // Adicionando os componentes ao Frame
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(button);

        // Tratamento do evento de fechamento
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Exibindo a janela
        setVisible(true);
    }
}