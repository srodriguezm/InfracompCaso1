package GDTS;

public class Mensaje 
{
	private Integer consulta;
	private Integer id;
	public Mensaje(Integer pID, Integer cons)
	{
		id=pID;
		consulta=cons;
	}

	public Integer getConsulta() {
		return consulta;
	}

	public void setConsulta(Integer consulta) {
		this.consulta = consulta;
	}
	
}
