package syzygy.demo;

public class Demo {

	public static void clearScreen() {
        // ANSI escape code to clear screen (2J) and move cursor to top-left (H)
        System.out.print("\033[H\033[2J");
        System.out.flush(); // Flush the output stream to ensure immediate execution
    }
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Content before clearing...");
        Thread.sleep(2000); 
        clearScreen();
        System.out.println("Content after clearing. This text is at the top.");

	}

}
