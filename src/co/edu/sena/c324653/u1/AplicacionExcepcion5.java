package co.edu.sena.c324653.u1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplicacionExcepcion5 
{
	public static void metodo( String s ) throws MiExcepcion
	{
		if( "feliz".equals( s ) )
		{
			System.out.println( "Son iguales." );
		}
		else
		{
			throw new MiExcepcion(); // se lanza
		}
	}
	
	public static void main( String[] args ) throws IOException, MiExcepcion
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String s;
		
		System.out.println( "Da la palabra: " );
		s = br.readLine();
		
		metodo( s );
	}
}
