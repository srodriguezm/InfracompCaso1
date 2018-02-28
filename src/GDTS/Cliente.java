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
			try 
			{
				Integer contenido=(int)Math.random();
				Mensaje mensaje=new Mensaje(id,contenido);
				System.out.println("Su consulta es: "+contenido+", su id es: "+id);
				buff.dejarMensaje(mensaje);
				mensaje.wait();
				mensaje=buff.getMensajeByid(id);
				System.out.println("Su consulta fue respondida, la respuesta es: "+mensaje.getConsulta()+", su id es: "+id);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
