package negocio;

public class DecoratorSinMascota extends DecoratorMascota {

	public DecoratorSinMascota(IViaje aEncapsular) {
		super(aEncapsular);
	}

	@Override
	public double getIncPasajeros() {
		return 0;
	}
	@Override
	public double getIncKilometros() {
		return 0;
	}

	

}
