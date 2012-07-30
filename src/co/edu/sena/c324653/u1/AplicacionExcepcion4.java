package co.edu.sena.c324653.u1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplicacionExcepcion4 
{
	public static void main( String[] args ) throws IOException
	{
		boolean error = true; // asumimos que hay error
		
		while( error )
		{
			try
			{
				BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
				
				int n1, n2, n;
				
				System.out.println( "Da un n�mero: " );
				n1 = Integer.parseInt( br.readLine() );
				
				System.out.println( "Da otro n�mero: " );
				n2 = Integer.parseInt( br.readLine() );
				
				System.out.println( "La divisi�n = " + ( n1 / n2 ) );
				
				error = false;
			}
			catch( NumberFormatException nfe )
			{
				System.err.println( "N�mero inv�lido " + nfe.toString() );
			}
			catch( ArithmeticException ae )
			{
				System.err.println( "Divisi�n inv�lida " + ae.toString() );
			}
		}
	}
}
