package GDTS;

public class Cliente extends Thread
{
	private Integer numeroDeConsultas;
	
	public Cliente() 
	{
		// TODO Auto-generated constructor stub
		numeroDeConsultas=(int)Math.random();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeroDeConsultas; i++) 
		{
			Mensaje mensaje=new Mensaje();
		}
	}
}
