package TP6_1;

abstract class Dog implements Move{
    int position, averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void describe();   //mendeklas=rasikan metod describe yg nantinya akan diimpelementasi oleh kelas" turunan
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Pitbull adalah ras anjing yang kuat dan berotot dan memiliki panjang " + averageLength + "cm");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Siberian Husky adalah ras anjing yang lincah dan memiliki bulu tebal dan memiliki panjang " + averageLength + "cm");
    }
    
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Bulldog adalah ras anjing yang kuat dan pendek yang memiliki hidung pesek dan memiliki panjang " + averageLength + "cm");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("German Shepherd berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("German Shepherd adalah ras anjing yang cerdas dan setia dan memiliki panjang " + averageLength + "cm");
    }
    
}