import java.util.Scanner;

public class TP2_1_H071231017 {   //mendeklarasikan variabel
    String name;
    int age;
    boolean isMale;

    void setName(String name){     //utk mengatur dan mengmbil nilai dari variabel kelas
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){
        return this.isMale ? "Male" : "Female";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //utk bisa membaca inputan dri user

        TP2_1_H071231017 scan = new TP2_1_H071231017();
        
        System.out.print("Masukkan name: ");   //data yg diimput akan disimpan ke dlm variabel yg sesuai
        String name = scanner.nextLine();
        scan.setName(name);
        
        System.out.print("Masukkan age: ");
        int age = scanner.nextInt();
        scan.setAge(age);
        
        System.out.print("Masukkan gender (true for male, false for female): ");
        boolean isMale = scanner.nextBoolean();
        scan.setGender(isMale);

        System.out.println("\nName: " + scan.getName());
        System.out.println("Age: " + scan.getAge());
        System.out.println("Gender: " + scan.getGender());
        
        scanner.close(); // Menutup scanner setelah selesai menggunakan
    }
}
