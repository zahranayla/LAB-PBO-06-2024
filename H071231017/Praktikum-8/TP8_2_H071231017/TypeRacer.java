package TP8_2_H071231017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> rareContestant = new ArrayList<>();
    private ArrayList<Result> rareStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }
    public ArrayList<Typer> getRareContestant() {
        return rareContestant;
    }

    // word by Yusuf Syam, Silahkan diubah jika dirasa kurang bijak
    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public void setNewWordsToType(){
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4) menambahkan typer yg selesai ke racestanding
    public void addResult(Result result) {
        rareStanding.add(result);
    }

    private void printRaceStanding(){
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO (5) utk menampilkan klasemen akhir
        rareStanding.sort(Comparator.comparingInt(Result::getFinishTime));
        for (int i = 0; i < rareStanding.size(); i++) {
            System.out.println((i + 1) + ". " + rareStanding.get(i).getName() + " = " + rareStanding.get(i).getFinishTime() + " detik");
        }
    }

    // TODO (6) menjalankan 
    public void startRace() {
        for (Typer typer : rareContestant) {//mengiterasi objek typer daqlam daftar rare
            typer.start();
        }
    }

    // TODO (7)
    public void displayRaceStandingPeriodically() throws InterruptedException {
        boolean allTypersFinished = false;
        while (!allTypersFinished) {
            Thread.sleep(2000);
            for (Typer ty : rareContestant) {
                System.out.println(String.format("-%s\t=> %s", ty.getBotName(), ty.getWordsTyped()));
            }
            if (rareContestant.size() == rareStanding.size()) {
                allTypersFinished = true;
            }
        }
        //TODO (8)
        printRaceStanding();
    }
}
