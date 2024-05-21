package TP8_2_H071231017;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;
    
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }
    public void setBotName(String botName) {
        this.botName = botName;
    }
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }
    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }
    public String getWordsTyped() {
        return wordsTyped;
    }
    public String getBotName() {
        return botName;
    }
    public double getWpm() {
        return wpm;
    }

    @Override
    public void run(){
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO (1) 1 kata dlm milidetik
        long howLongToType = (long) (6000/wpm * wordsToType.length);

        // TODO (2) 
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                addWordsTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordsTyped("(Selesai)");

        // TODO (3)
        int finishTime = (int) howLongToType / 100;
        Result result = new Result(botName, finishTime);
        typeRacer.addResult(result);
    }
}
