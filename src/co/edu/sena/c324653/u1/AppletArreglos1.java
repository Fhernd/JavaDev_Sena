package co.edu.sena.c324653.u1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//<applet width="400" height="200" code="AppletArreglos1"></applet>

public class AppletArreglos1 extends Applet implements ActionListener
{
	Label lblDatoAniadir, lblTextoVerArreglo;
    Button btnAniade, btnMuestraVector, btnLimpiaVector, btnLimpiaCampos;	
    TextField txtDatoAniadir;
    TextArea txaVerArreglo;
    int arreglo[];
    int conta;

   public AppletArreglos1() 
   {
		lblDatoAniadir = new Label("Dato a Añadir");
		lblTextoVerArreglo = new Label("Texto para ver Arreglo");
		txtDatoAniadir = new TextField();
		txaVerArreglo = new TextArea(10,12);
		
		btnAniade = new Button("Añade");
		btnMuestraVector = new Button("Muestra Vector");
		btnLimpiaVector = new Button("Limpia Vector");
		btnLimpiaCampos = new Button("Limpia Campos");
		
		add(lblDatoAniadir);
		add(txtDatoAniadir);
		add(lblTextoVerArreglo);
		add(txaVerArreglo);
		add(btnAniade);
		add(btnMuestraVector);
		add(btnLimpiaVector);
		add(btnLimpiaCampos);
		
		btnAniade.addActionListener(this);
		btnMuestraVector.addActionListener(this);
		btnLimpiaVector.addActionListener(this);
		btnLimpiaCampos.addActionListener(this);
		
		arreglo = new int[100];
		conta=0;
    }
     
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == btnAniade) 
        {
            if (conta > arreglo.length) 
            {
                txaVerArreglo.setText("No se puede añadir otro elemento");
            }
            else 
            {
            	try 
            	{
            		int numero = Integer.parseInt(txtDatoAniadir.getText());
            		arreglo[conta++] = numero;	            	
            	}
            	catch(NumberFormatException nfe) 
            	{
            		txaVerArreglo.setText("invalido " + nfe.toString());
            	}
                
            	txtDatoAniadir.setText("");    
            }
         }
         if (ae.getSource() == btnMuestraVector) 
         {
               txaVerArreglo.setText("");
               
               for (int i=0; i < conta; i++) 
               {
                   txaVerArreglo.append("" + arreglo[i] + "\n");
               }
         }
         if (ae.getSource() == btnLimpiaVector)
         {
               conta = 0;
               arreglo = new int[100];
         }
         if (ae.getSource() == btnLimpiaCampos) 
         {
				txtDatoAniadir.setText("");
				txaVerArreglo.setText("");
         }
    }
}
