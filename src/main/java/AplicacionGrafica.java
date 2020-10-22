import javax.swing.*;

/**
 *
 * @author SandraIMH
 */
public class AplicacionGrafica extends JFrame {
    /**
     * Panel de la aplicacion
     */
    private JPanel contentPane;
    private JTextField textField;
    
    
    public AplicacionGrafica(){
        //Añade un titulo, no es estrictamente necesario
        setTitle("Titulo de la ventana");
        
        /*
         * coordenadas x y de la aplicacion y su altura y longitud,
         * si no lo indicamos aparecera una ventana muy pequeña
         */
        setBounds(400,200,607,448);
        
        /*
         * indica que cuando se cierre la ventanase acaba la aplicacion,
         * si no indicamos cuando cerremos la ventana la aplicacion seguira funcionando
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Hace visible la ventana, si no lo hacemos no veremos la aplicacion
        setVisible(true);
        
        //creamos el panel
        contentPane = new JPanel();   
        //indicamos su diseño
        contentPane.setLayout(null);   
        //asigno el pannel de la ventana
        setContentPane(contentPane);
       
        
        //ETIQUETA
        JLabel etiqueta = new JLabel("!Hola Mundo!");
        etiqueta.setBounds(60, 20, 100, 20);
        contentPane.add(etiqueta);
        //CAMPO DE TEXTO
        textField = new JTextField();
        textField.setBounds(43, 67, 86, 26); 
        contentPane.add(textField); 
        //BOTON
        JButton btnPulsame = new JButton("Pulsame");
        btnPulsame.setBounds(43, 133, 89, 23);
        contentPane.add(btnPulsame);
        //BOTON RADIO
        JRadioButton rdbnOpcion = new JRadioButton("Opcion 1", true);
        rdbnOpcion.setBounds(43, 194, 109, 23);
        contentPane.add(rdbnOpcion);
        
        JRadioButton rdbnOpcion_1 = new JRadioButton("Opcion 2", false);
        rdbnOpcion_1.setBounds(43, 220, 109, 23);
        contentPane.add(rdbnOpcion_1);
        
        JRadioButton rdbnOpcion_2 = new JRadioButton("Opcion 3", false);
        rdbnOpcion_2.setBounds(43, 246, 109, 23);
        contentPane.add(rdbnOpcion_2);
        
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbnOpcion);
        bgroup.add(rdbnOpcion_1);
        bgroup.add(rdbnOpcion_2);
        //BOTON CHECKBOX
        JCheckBox chckbxOpcion = new JCheckBox("Opcion 1", true);
        chckbxOpcion.setBounds(43, 305, 97, 23);
        contentPane.add(chckbxOpcion);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Opcion 2", true);
        chckbxNewCheckBox.setBounds(43, 305, 97, 23);
        contentPane.add(chckbxNewCheckBox);
        
        JCheckBox chckbxOpcion_1 = new JCheckBox("Opcion 3", true);
        chckbxOpcion_1.setBounds(43, 346, 96, 23);
        contentPane.add(chckbxOpcion_1);
        //TEXTO DE AREA
        JTextArea textArea = new JTextArea("Prueba");
        textArea.setBounds(189, 18, 141, 117);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        contentPane.add(textArea);
        
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(189, 18, 141, 117);
        contentPane.add(scroll);
        //CAMPO DE PASSWORD
        JPasswordField pwd = new JPasswordField("fernando");
        pwd.setBounds(189, 171, 139, 20);
        contentPane.add(pwd);
        //MENU DE SELECCION
        JComboBox comboBox = new JComboBox<>();
        comboBox.setBounds(189, 221, 141, 22);
        contentPane.add(comboBox);
        
        comboBox.addItem("Fernando");
        comboBox.addItem("Alberto");
        comboBox.addItem("Arturo");
        //INTERRUPTOR
        JToggleButton tglbtnNewToggletButton = new JToggleButton("Interruptor, true");
        tglbtnNewToggletButton.setBounds(189, 291, 121, 23);
        contentPane.add(tglbtnNewToggletButton);
        //JSPINNER
        JSpinner spinner = new JSpinner();
        spinner.setBounds(371, 20, 29, 20);
        contentPane.add(spinner);
    }
    
    public static void main(String[] args){
        AplicacionGrafica ventana = new AplicacionGrafica();
    }
}
