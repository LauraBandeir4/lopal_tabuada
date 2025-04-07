package br.dev.laura.tabuada.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
 
public class TelaTabuada {
	
    private JLabel labelMultiplicando;
    private JTextField txtMultiplicando;
	private JLabel labelMinMultiplicador;
    private JTextField txtMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JLabel labelResultado;
	private JScrollPane scrollTabuada;
	private JList listaTabuada;
	
	
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		// Definir o tamanho da tela
		// através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(335, 700);

		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// Criar um JLabel e um JtextField para o multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do Multiplicando:");
		tela.getContentPane().add(labelMultiplicando);
		labelMultiplicando.setBounds(50, 40, 150, 30);

		// Criar um JField
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(210, 40, 60, 30);
		
		// Criar um JLabel e um JtextField para o mín. multiplicandor
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setBounds(50, 80, 150, 30);
		
		txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(210, 80, 60, 30);
		 
		
		//Criar um 	JLabel e um JTextField para o máx. multiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setBounds(50, 120, 150, 30);
		
		txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(210, 120, 60, 30);
		
		
		// Criando botões da tela
		btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(50, 160, 105, 30);
		
		btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(165, 160, 105, 30);
		
		
		//Label do resultado
		labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(50, 200, 200, 30);
		
		
		
		// Criando a Lista que exibirá a tabuada
		
	    	
		listaTabuada = new JList(cidades);
		
		
		// Criando painel de rolagem para a lista
		scrollTabuada = new JScrollPane(listaTabuada);
		scrollTabuada.setBounds(50, 240, 240, 400);
		
		
		// Adicionando os componentes ao painel de conteúdo
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador); 
		tela.getContentPane().add(btnCalcular); 
		tela.getContentPane().add(btnLimpar); 
		tela.getContentPane().add(scrollTabuada);
		
		
		
		//Tornar a tela visível deve ser a última linha desse método
		tela.setVisible(true);

	}
}
