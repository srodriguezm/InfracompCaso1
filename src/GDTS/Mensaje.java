package GDTS;

public class Mensaje 
{
	private Integer consulta;
	private Integer id;
	public Mensaje(Integer pID)
	{
		id=pID;
	}

	public Integer getConsulta() {
		return consulta;
	}

	public void setConsulta(Integer consulta) {
		this.consulta = consulta;
	}
	
}
