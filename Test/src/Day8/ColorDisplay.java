package Day8;

import java.util.Random;

class ColorDisplay implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();

    @Override
    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String selectedColour = colours[index];
            System.out.println("Generated Colour: " + selectedColour);

            if (selectedColour.equalsIgnoreCase("red")) {
                System.out.println("Red matched. Stopping thread.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        ColorDisplay colourTask = new ColorDisplay();
        Thread colorThread = new Thread(colourTask);
        colorThread.start();
    }
}

