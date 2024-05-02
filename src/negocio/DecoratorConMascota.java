package negocio;

public class DecoratorConMascota extends DecoratorMascota {

	public DecoratorConMascota(IViaje aEncapsular) {
		super(aEncapsular);
	}
	
	@Override
	public double getIncPasajeros() {
		return getCostoBase()*0.1*getCantPasajeros();
	}
	@Override
	public double getIncKilometros() {
		return getCostoBase()*0.2*getDistancia();
	}

}
