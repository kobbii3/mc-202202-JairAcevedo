package excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Excepciones {

    	public static ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public static Producto producto;
	
	public static String fichero = "archivos.dat";
    
    public static void main(String[] args) {
        int opcion = 0;

		do {

			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Productos!\nIngrese la opcion que desea realizar: \n 1. Agregar \n 2. Eliminar  \n 3. Modificar \n 4. Listar \n 5. Guardar y Salir"));
			switch (opcion) {
			// Nuevo
			case 1:
				//TODO Crear metodo que le permita crear un producto y agregarlo al listado de productos
                                crearProducto();
				break;

			// Eliminar
			case 2:
				//TODO Crear metodo que le permita eliminar un producto.

			// Modificar
			case 3:
				//TODO Crear metodo que le permita modificar un producto ya existente en el listado
				break;

			// Listar
			case 4:
				//TODO crear metodo que le permita imprimir la informacion de los productos contenidos en el arreglo
                                JOptionPane.showMessageDialog(null, listarProductos());
				break;

			// Salir
			case 5:
				
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida!\n");
				break;
			}
		} while (opcion != 5);
		JOptionPane.showMessageDialog(null, "Adios!");
		

	}
	
        public static void crearProducto(){
            String nombre;
            String desc;
            int cantidad;
            float valor;
            nombre = JOptionPane.showInputDialog("Por favor escriba el nombre del producto");
            desc = nombre = JOptionPane.showInputDialog("Por favor escriba la descripcion");
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Por favor escriba la cantidad"));
            valor = Float.parseFloat(JOptionPane.showInputDialog("Por favor escriba el valor"));
            producto = new Producto(nombre, desc, cantidad, valor);
            productos.add(producto);
        }
        
        public static String listarProductos(){
            String texto = "";
            for(Producto producto : productos){
                texto += "\n" + "[" + (productos.indexOf(producto) + 1) + "]" + producto;
            }
        return texto;    
        }
        
	/**
	 * Carga la lista de productos desde un archivo .dat
	 * 
	 * @return
	 */
	public ArrayList<Producto> cargarProductos() {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			Object aux = ois.readObject();
			while (aux != null) {
				if (aux instanceof Producto)
					productos.add((Producto) aux);
				aux = ois.readObject();

			}
			ois.close();
		} catch (FileNotFoundException e) {
			try {
				File archivo = new File(fichero);
				archivo.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (Exception e) {

		}
		return productos;
	}

	/**
	 * Recibe un listado de productos y guarda en un archivo .dat
	 * 
	 * @param productos
	 */
	public void guardaProductos() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
			for (Producto producto : this.productos) {
				oos.writeObject(producto);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   }
