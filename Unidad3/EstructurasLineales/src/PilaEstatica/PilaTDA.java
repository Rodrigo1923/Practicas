package PilaEstatica;
	
public interface PilaTDA<T>{
	//La interfas me indica que voy a hacer
	public boolean isEmpty();
	
	public T pop();
	
	public void push(T dato);
	
	public T peek();
	
	public void freePila();
	
}
