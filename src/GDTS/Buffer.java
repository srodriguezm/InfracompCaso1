package GDTS;

import java.util.ArrayList;

public class Buffer {
	
	private ArrayList<Mensaje> mensajes;
	
	public Buffer() {
		mensajes=new ArrayList<>();
	}
	public synchronized void dejarMensaje(Mensaje m)
	{
		mensajes.add(m);
	}
	public synchronized Mensaje cogerMensaje(){
		if(!mensajes.isEmpty())
			return mensajes.get(0);
		else
			return null;
	}
	public boolean bufferVacio() {
		return mensajes.isEmpty();
	}
}
