import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleAWT extends Frame {
    private Label messageLabel = new Label();

    public SimpleAWT() {
        // Configurações do Frame
	    setTitle("Tela de Login");
        setSize(600, 300);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Criando os componentes
        Label label1 = new Label("Usuário:");
        TextField input1 = new TextField(20);

        Label label2 = new Label("Senha: ");
        JPasswordField input2 = new JPasswordField(20);

        Button cancelar = new Button("Cancelar");
	    Button enviar = new Button("Enviar");

        messageLabel = new Label("");
        messageLabel.setForeground(Color.RED);
        messageLabel.setSize(400, 20);


        // Adicionando os componentes ao Frame
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(cancelar);
	    add(enviar);
        add(messageLabel);

    // Tratamento do evento de clique do botão
    enviar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (input1.getText().trim().isEmpty() || input2.getPassword().length == 0 ) {
                messageLabel.setText("Preencha todos os campos!");
            } else {
                messageLabel.setText("Usuário: " + input1.getText() + " logado com sucesso!");
            }
        }
    });


	cancelar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});

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
