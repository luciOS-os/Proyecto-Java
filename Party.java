package modelo;
import java.util.ArrayList;
import java.util.List;

public class Party {
    private ArrayList<Personaje> personajes;

    public Party() {
        personajes = new ArrayList<>();
    }

    public boolean agregarPersonaje(Personaje p) {
        boolean agregar=false;
        try{
            personajes.add(p);
            agregar=true;
        }catch(Exception e){
            agregar = false;
        }
        return agregar;
    }

    public boolean quitarPersonaje(Personaje p) {
        boolean quitar=false;
        try{
            personajes.remove(p);
            quitar=true;
        }catch(Exception e){
            quitar = false;
        }
        return quitar;
    }

    public boolean reemplazarPersonaje(String viejo, Personaje nuevo) {
        boolean reemplazar=false;
        try{
            personajes.remove(personajes.buscarPersonaje(viejo));
            reemplazar=true;
        }catch(Exception e){
            reemplazar = false;
        }
        return reemplazar;
    }

    public boolean cambiarNombre(String viejo, String nuevo) {
        boolean cambiar=false;
        try{
            personajes.get(buscarPersonaje(viejo)).setNombre(nuevo);
            cambiar=true;
        }catch(Exception e){
            cambiar = false;
        }
        return cambiar;
    }

    public String[] listadoPersonajes() {
		String[] resultado;
		if (personajes.size() > 0) {
			resultado = new String[personajes.size()];
			for (int i=0; i < personajes.size();i++) {
				resultado[i] = personajes.get(i).toString();
			}
		}else {
			resultado = null;
		}
		return resultado;
	}

    public boolean existePersonaje(String nombre) {
            boolean existe = false;
            int i=0;
		if (personajes.size() > 0) {
			while(i < personajes.size() && !(i >= personajes.size())) {
                if(nombre.equals(personajes.get(i).getNombre())){
                    existe = true;
                }
				i++;
			}
		}
		return existe;
	}
    
    public int buscarPersonaje(String nombre) {
            int i = 0;
		if (personajes.size() > 0) {
			while(i < personajes.size() && !nombre.equals(personajes.get(i).getNombre())) {
				i++;
			}
			if (i >= personajes.size()) {
				i = -1;
			}
		}else {
			i = -1;
		}
		return i;
	}

}
