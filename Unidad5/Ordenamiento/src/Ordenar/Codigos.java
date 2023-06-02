package Ordenar;
import java.util.ArrayList;

import java.util.*;
import Inter.Metodos;
import Tools.ToolsPanel;
import java.io.*;

public class Codigos<T> implements Metodos<T> {
	
	private int[] lista;
	private byte punt;

	public Codigos(int max) {
		lista = new int[max];
		punt = -1;
	}
	
	@Override
	public boolean arrayVacio() {
		return (punt == -1);
	}

	@Override
	public boolean espacioArray() {
		return (punt<lista.length-1);
	}

	@Override
	public void vaciarArray() {
		punt=-1;
	}

	@Override
	public void almacenaAleatorios(){
		vaciarArray();
		/*while(espacioArray()) {
			punt++;
			lista[punt]=generaRandom(10, 99);
		}*/
		lista[0]=23;
		lista[1]=-56;
		lista[2]=67;
		lista[3]=2;
		lista[4]=9;
		lista[5]=44;
		lista[6]=6;
		lista[7]=18;
		lista[8]=1;
		lista[9]=7;
		punt=9;
	}

	@Override
	public String impresionDatos() {
		String cad="";
		for(int i =0; i<=lista.length-1; i++) {
			cad+=i+"=["+lista[i]+"]\n";
		}
		return cad;
	}
//*****************************************************************************************************
	@Override
	public void burbujaSeñal() {
		int n = lista.length;
        boolean señal;
        
        for (int i = 0; i < n - 1; i++) {
            señal = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                    señal = true;
                }
            }
            
            if (!señal)
                break;
        }
	}
//*****************************************************************************************************
	@Override
	public void dobleBurbuja() {
		int left = 0;
        int right = lista.length - 1;
        boolean swapped = true;

        while (left < right && swapped) {
            swapped = false;

            for (int i = left; i < right; i++) {
                if (lista[i] > lista[i + 1]) {
                    swapp(i, i + 1);
                    swapped = true;
                }
            }
            
            right--;

            for (int i = right; i > left; i--) {
                if (lista[i] < lista[i - 1]) {
                    swapp(i, i - 1);
                    swapped = true;
                }
            }

            left++;
        }
        
	}
	
	private void swapp(int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
	
//*****************************************************************************************************
	@Override
	public void shellIncreDecre() {
		int n = lista.length;
        
       
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        
        while (h >= 1) {
            
            for (int i = h; i < n; i++) {
                int key = lista[i];
                int j = i;
                
                
                while (j >= h && lista[j - h] > key) {
                    lista[j] = lista[j - h];
                    j -= h;
                }
                
                lista[j] = key;
            }
            
            
            h /= 3;
        }
	}
//*****************************************************************************************************
	@Override
	public void seleDirecta() {
		int n = lista.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIndex]) {
                    minIndex = j;
                }
            }
            
            
            //
            //int temp = lista[minIndex];
            //lista[minIndex] = lista[i];
            //lista[i] = temp;
            swapp(minIndex,i);
        }
	}
//*****************************************************************************************************
	@Override
	public void inserDirecta() {
		int n = lista.length;
        
        for (int i = 1; i < n; i++) {
            int key = lista[i];
            int j = i - 1;
            
            
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
            }
            
            lista[j + 1] = key;
        }
	}
//*****************************************************************************************************
	@Override
	public void binaria() {
		for (int i = 1; i < lista.length; i++) {
            int key = lista[i];
            int left = 0;
            int right = i - 1;
            
            while (left <= right) {
                int mid = (left + right) / 2;
                if (lista[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            for (int j = i - 1; j >= left; j--) {
                lista[j + 1] = lista[j];
            }
            
            lista[left] = key;
        }
	}
	
//*****************************************************************************************************
	@Override
	public void heapSort() {
		int n = lista.length;

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
            
        }

        
        for (int i = n - 1; i > 0; i--) {
            
            //int temp = lista[0];
            //lista[0] = lista[i];
            //lista[i] = temp;
            swapp(0,i);

            
            heapify(i, 0);
        }
	}

	private void heapify(int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        
        if (left < n && lista[left] > lista[largest]) {
            largest = left;
        }

        
        if (right < n && lista[right] > lista[largest]) {
            largest = right;
        }

        
        if (largest != i) {
        	
            //int temp = lista[i];
            //lista[i] = lista[largest];
            //lista[largest] = temp;
        	swapp(i,largest);

            
            heapify(n, largest);
        }
    }
//*****************************************************************************************************
	@Override
	public void quicksortRecursivo() {
		quickSort(0, punt);
	}
	
	private void quickSort(int low, int high) {
        if (low < high) {
            
            int pivotIndex = partition(low, high);

            
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }
	
	private int partition(int low, int high) {
       
        int pivot = lista[high];

        
        int i = low - 1;

        for (int j = low; j < high; j++) {
          
            if (lista[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }

        
        swap(i + 1, high);

        
        return i + 1;
    }
	
	private void swap(int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
//*****************************************************************************************************
	@Override
	public void radix() {
		int max = getMax();

        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(exp);
        }
	}
	
	private int getMax() {
        int max = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        return max;
    }
	
	private void countingSort(int exp) {
        int n = lista.length;
        int[] output = new int[n];
        int[] count = new int[10];

        
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        
        for (int i = 0; i < n; i++) {
            int digit = (lista[i] / exp) % 10;
            count[digit]++;
        }

        
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        
        for (int i = n - 1; i >= 0; i--) {
            int digit = (lista[i] / exp) % 10;
            output[count[digit] - 1] = lista[i];
            count[digit]--;
        }

        
        for (int i = 0; i < n; i++) {
            lista[i] = output[i];
        }
    }
//*****************************************************************************************************
	@Override
	public void intercalación() {
		String inputFile = "C:\\Users\\rous2\\eclipse-workspace\\Ordenamiento\\src\\Ordenar\\input.txt";
        String outputFile = "C:\\\\Users\\\\rous2\\\\eclipse-workspace\\\\Ordenamiento\\\\src\\\\Ordenar\\\\inter.txt";

        intercalationSort(inputFile, outputFile, 10);

        ToolsPanel.imprimePantalla("Ordenamiento por intercalaciÃ³n completado.");
	}
	
	private void intercalationSort(String inputFile, String outputFile, int blockSize) {
        try {
            // Abrir los archivos de entrada y salida
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Leer el primer bloque inicial
            int[] block = new int[blockSize];
            int numElements = readBlock(reader, block);

            // Ordenar y escribir los bloques hasta que se alcance el final del archivo
            while (numElements > 0) {
                mergeSort(block, 0, numElements - 1); // Aplicar Merge Sort al bloque actual
                writeBlock(writer, block, numElements); // Escribir el bloque ordenado en el archivo de salida

                // Leer el siguiente bloque
                numElements = readBlock(reader, block);
            }

            // Cerrar los archivos de entrada y salida
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid); // Ordenar la mitad izquierda
            mergeSort(arr, mid + 1, right); // Ordenar la mitad derecha

            merge(arr, left, mid, right); // Realizar la mezcla de los dos subarreglos ordenados
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copiar los elementos ordenados de vuelta al arreglo original
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    private int readBlock(BufferedReader reader, int[] block) throws IOException {
        int numElements = 0;
        String line;
        while (numElements < block.length && (line = reader.readLine()) != null) {
            block[numElements] = Integer.parseInt(line);
            numElements++;
        }
        return numElements;
    }

    private void writeBlock(BufferedWriter writer, int[] block, int numElements) throws IOException {
        for (int i = 0; i < numElements; i++) {
            writer.write(Integer.toString(block[i]));
            writer.newLine();
        }
    }
	
//*****************************************************************************************************
	@Override
	public void mezclaDirecta() {
		String inputFile = "C:\\Users\\rous2\\eclipse-workspace\\Ordenamiento\\src\\Ordenar\\input.txt";
        String outputFile = "C:\\\\Users\\\\rous2\\\\eclipse-workspace\\\\Ordenamiento\\\\src\\\\Ordenar\\\\mez_dir.txt";

        MesDirecta(inputFile, outputFile, 10);

        ToolsPanel.imprimePantalla("Ordenamiento por intercalaciÃ³n completado.");
	}
	
	private void MesDirecta(String inputFile, String outputFile, int blockSize) {
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            
            int[] block = new int[blockSize];
            int numElements = readBlockk(reader, block);

            while (numElements > 0) {
                mergeSortt(block, 0, numElements - 1);
                writeBlockk(writer, block, numElements); 

                
                numElements = readBlockk(reader, block);
            }

            
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mergeSortt(int[] arr, int left, int right) {
    	if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortt(arr, left, mid);
            mergeSortt(arr, mid + 1, right);
            mergee(arr, left, mid, right);
        }
    }

    private void mergee(int[] arr, int left, int mid, int right) {
    	int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i]<=rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private int readBlockk(BufferedReader reader, int[] block) throws IOException {
        int numElements = 0;
        String line;
        while (numElements < block.length && (line = reader.readLine()) != null) {
            block[numElements] = Integer.parseInt(line);
            numElements++;
        }
        return numElements;
    }

    private void writeBlockk(BufferedWriter writer, int[] block, int numElements) throws IOException {
        for (int i = 0; i < numElements; i++) {
            writer.write(Integer.toString(block[i]));
            writer.newLine();
        }
    }
//*****************************************************************************************************  
    public void mezclaNatural() {
    	
    	String archivoEntrada = "C:\\Users\\rous2\\eclipse-workspace\\Ordenamiento\\src\\Ordenar\\input.txt";
        String archivoSalida = "C:\\\\Users\\\\rous2\\\\eclipse-workspace\\\\Ordenamiento\\\\src\\\\Ordenar\\\\mez_dir.txt";

		mezclaNatural(archivoEntrada, archivoSalida, 10);
			
        ToolsPanel.imprimePantalla("Ordenamiento por intercalaciÃ³n completado.");
    	
    }
    
    private void mezclaNatural(String archivoEntrada, String archivoSalida, int bloque) {
        try {
        List<String> bloques = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
        String linea;
        while ((linea = br.readLine()) != null) {
            bloques.add(linea);
        }
        br.close();

        // Ordenar y combinar bloques
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            int i = 0;
            while (i < bloques.size() - 1) {
                List<String> bloque1 = leerBloque(bloques.get(i), bloque);
                List<String> bloque2 = leerBloque(bloques.get(i + 1), bloque);
                List<String> combinado = new ArrayList<>();
                int index1 = 0;
                int index2 = 0;

                while (index1 < bloque1.size() && index2 < bloque2.size()) {
                    if (bloque1.get(index1).compareTo(bloque2.get(index2)) <= 0) {
                        combinado.add(bloque1.get(index1));
                        index1++;
                    } else {
                        combinado.add(bloque2.get(index2));
                        index2++;
                    }
                }

                // Agregar los registros restantes
                while (index1 < bloque1.size()) {
                    combinado.add(bloque1.get(index1));
                    index1++;
                }
                while (index2 < bloque2.size()) {
                    combinado.add(bloque2.get(index2));
                    index2++;
                }

                // Escribir el bloque combinado en un archivo temporal
                String archivoTemporal = "temp" + i + ".txt";
                escribirBloque(archivoTemporal, combinado);

                // Actualizar la lista de bloques
                bloques.set(i, archivoTemporal);
                bloques.remove(i + 1);

                ordenado = false;
                i++;
            }
        }

        // Mover el bloque final al archivo de salida
        File archivoFinal = new File(archivoSalida);
        File bloqueFinal = new File(bloques.get(0));
        bloqueFinal.renameTo(archivoFinal);
        }catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
    }

    private List<String> leerBloque(String archivo, int bloque) throws IOException {
        List<String> registros = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        int contador = 0;
        while ((linea = br.readLine()) != null && contador < bloque) {
            registros.add(linea);
            contador++;
        }
        br.close();
        return registros;
    }

    private void escribirBloque(String archivo, List<String> bloque) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for (String registro : bloque) {
            bw.write(registro);
            bw.newLine();
        }
        bw.close();
    }
	
//*****************************************************************************************************
	
	private int generaRandom (int min, int max) {
		return (int)((max - min + 1) * Math.random()+ min);
	}
	
}
