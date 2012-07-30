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
				
				System.out.println( "Da un número: " );
				n1 = Integer.parseInt( br.readLine() );
				
				System.out.println( "Da otro número: " );
				n2 = Integer.parseInt( br.readLine() );
				
				System.out.println( "La división = " + ( n1 / n2 ) );
				
				error = false;
			}
			catch( NumberFormatException nfe )
			{
				System.err.println( "Número inválido " + nfe.toString() );
			}
			catch( ArithmeticException ae )
			{
				System.err.println( "División inválida " + ae.toString() );
			}
		}
	}
}
