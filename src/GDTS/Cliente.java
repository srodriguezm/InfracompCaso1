package GDTS;

public class Cliente extends Thread
{
	private Integer numeroDeConsultas;
	
	private Integer id;
	
	private Buffer buff;
	
	public Cliente(Integer pId) 
	{
		// TODO Auto-generated constructor stub
		numeroDeConsultas=(int)Math.random();
		id=pId;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeroDeConsultas; i++) 
		{
			Integer contenido=(int)Math.random();
			Mensaje mensaje=new Mensaje(id,contenido);
			buff.dejarMensaje(mensaje);
		}
	}
}
