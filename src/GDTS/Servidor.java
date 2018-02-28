package GDTS;

public class Servidor extends Thread
{
	private Buffer buff;
	
	public Servidor(Buffer pbuffer) {
		// TODO Auto-generated constructor stub
		buff=pbuffer;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean fin=false;
		while(!fin)
		{
			Mensaje m=buff.cogerMensaje();
			fin=buff.bufferVacio();
		}
	}
	public static void main(String args[])
	{
		Buffer b=new Buffer();
	}
	public void cambiarMensaje(Mensaje m)
	{
		m.setConsulta(m.getConsulta()+1);
	}
}
