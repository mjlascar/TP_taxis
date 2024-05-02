package negocio;

public abstract class DecoratorMascota implements IViaje {
	protected IViaje encapsulado;

	public DecoratorMascota(IViaje aEncapsular) {
		encapsulado= aEncapsular;
	}

	@Override
	public int getCantPasajeros() {
		return encapsulado.getCantPasajeros();
	}

	@Override
	public double getDistancia() {
		return encapsulado.getDistancia();
	}
	
	@Override
	public double getCostoBase() {
		return encapsulado.getCostoBase();
	}

	@Override
	public double getCosto() {// getIncKilometros() y getIncPasajeros() no estan implementados en esta capa aun, pero lo seran en sus decorator hijos :)
		return encapsulado.getCosto() + getIncKilometros() + getIncPasajeros();
	}
	
}
