import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
                // Ejemplo de mutabilidad con funciones
                List<Integer> listaConMutabilidad = new ArrayList<>();//creamos una lista de array de tipo entero
        listaConMutabilidad.add(1);//agregamos un valores enteroa a la lista 1,2,3
        listaConMutabilidad.add(2);
        listaConMutabilidad.add(3);
//funcion lamda
        //con esta funcion creara una nueva lista agregando un entero mas sin alterar la lista original
                Function<List<Integer>, List<Integer>> addElement = list -> {
                    List<Integer> nuevaLista = new ArrayList<>(list);
                    nuevaLista.add(4);//crea una nueva lista y agrega otro valor
                    return nuevaLista;//arrojara la nueva lista 1,2,3,4
                };
//creamos una nuev lista para guardar los datos de la lista modificada
                List<Integer> modifiedList = addElement.apply(listaConMutabilidad);

                System.out.println("Lista mutable original: " + listaConMutabilidad);//imprimimos la lista orginal
                System.out.println("Lista mutable después de la modificación: " + modifiedList);// y la lista modificada

                    // Ejemplo de inmutabilidad con funciones
                    String immutableString = "Hola";
//funcion lamda
                    Function<String, String> anadirSigno= s -> s + "!";

                    String modificarCadena = anadirSigno.apply(immutableString);

                    System.out.println("Cadena inmutable original: " + immutableString);
                    System.out.println("Cadena inmutable después de la modificación: " + immutableString);
                    System.out.println("Nueva cadena después de la modificación: " + modificarCadena);
            }
        }


