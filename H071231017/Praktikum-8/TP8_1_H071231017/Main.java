package TP8_1_H071231017;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static int jumlahData = 4;
    private static int berhasil; //jumlah data yang berhasil

    public static void main(String[] args) {
        System.out.println(String.format("Start Load %d data", jumlahData));
        ExecutorService executorPribadi = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        UiThread ui = new UiThread();

        for (int i = 1; i <= jumlahData; i++) {
            executorPribadi.execute(ui);
            Bot bot = new Bot();
            executor.execute(bot);

        }
        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        ui.stopProgram();
        executorPribadi.shutdown();
        while(!executorPribadi.isTerminated()){

        }
        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + UiThread.jumlah + "s");
        
        if (berhasil == jumlahData) {   //semua dta berhasil dimuat
            System.out.println("All Data Is Successfully Loaded");
        } else {
            int gagal = jumlahData - berhasil;
            System.out.println(String.format("%d Data Successfully loaded & %d Data failed to load", berhasil, gagal));

        }
    }

    public static synchronized void dataBerhasil() {
        berhasil++;   //maka nilai berhasil akan ditambah 1 setiap kali dipnggil
    }
}

//informasi waktu loading 
class Bot extends Thread {

    public void run() {
        int waktuEksekusi = TaskTimeHelper.getTaskExecutionTime();
        if (waktuEksekusi < 4) {
            try {
                Thread.sleep(waktuEksekusi * 1000);
                Main.dataBerhasil();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Request Timeout");
        }

    }
}


//waktu eksekusi acak
class UiThread extends Thread {
    private boolean yes = true;
    public static int jumlah;

    @Override
    public void run() {
        while (yes) {
            try {
                jumlah++;
                Thread.sleep(1000);
                System.out.println(String.format("Loading... (%ds)", jumlah));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopProgram(){
        yes = false;
    }

}


//menghasilkan nilai waktu acak
class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1; //nilai acak dari 0-5 +1 = 1-6
    }
}