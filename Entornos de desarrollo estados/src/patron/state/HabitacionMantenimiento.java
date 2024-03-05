package patron.state;

public class HabitacionMantenimiento implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("Estoy en mantenimiemnto");
		return null;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion ha terminado el mantenimiento");
		return new HabitacionDisponibleOcupada();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("Estoy en mantenimiemnto");
		return null;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("Estoy en mantenimiemnto");
		return null;
	}

}
