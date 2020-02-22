
import threadsrunnable.ThreadsRunnable;
/**
 *
 * @author luis_
 */
public class Principal {
    public static void main(String[] args) {
        ThreadsRunnable miHilo = new ThreadsRunnable();
        ThreadsRunnable miHilo2 = new ThreadsRunnable();
        ThreadsRunnable miHilo3 = new ThreadsRunnable();
        ThreadsRunnable miHilo4 = new ThreadsRunnable();
        
        Thread proceso1;
        Thread proceso2;
        Thread proceso3;
        Thread proceso4;
        proceso1 = new Thread(miHilo, "Word");
        proceso2 = new Thread(miHilo2, "Excel");
        proceso3 = new Thread(miHilo3, "Paint");
        proceso4 = new Thread(miHilo4, "Power");
        
        proceso1.start();
        proceso2.start();
        proceso3.start();
        proceso4.start();
    }
}
