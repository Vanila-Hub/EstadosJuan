package patron.state;

public class HabitacionDisponibleOcupada implements HabitacionEstado{

	@Override
	public HabitacionEstado ocupar() {
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion esta limpia");
		return new HabitacionOcupada();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("Empezando el mantenidiemto de la habirtacion");
		return new HabitacionMantenimiento();
	}

	@Override
	public HabitacionEstado salir() {
		return new HabitacionOcupadaVacia();
	}

}
