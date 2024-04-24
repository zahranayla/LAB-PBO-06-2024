import java.util.ArrayList;
import java.util.Scanner;
import models.Profile;
import utils.StringUtils;

public class Main {
    private static ArrayList<String> listUsernames = new ArrayList<>();
    private static ArrayList<String> listPasswords = new ArrayList<>();
    private static ArrayList<Profile> listUserProfiles = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = sc.nextInt();
        sc.nextLine(); // Membersihkan karakter newline dari buffer
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            default:
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        int userIndex = listUsernames.indexOf(username);
        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();
            boolean isPasswordMatch = listPasswords.get(userIndex).equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfiles.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username tidak ditemukan");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        String username;
        do {
            System.out.print("> ");
            username = sc.nextLine();
            if (username.isEmpty()) {
                System.out.println("Username tidak boleh kosong!");
            } else if (listUsernames.contains(username)) {
                System.out.println("Username sudah digunakan, coba yang lain!");
                username = "";
            }
        } while (username.isEmpty());

        System.out.println("Password (minimal 8 karakter)");
        String password;
        do {
            System.out.print("> ");
            password = sc.next(); // Menggunakan sc.next() untuk membaca password
            if (password.length() < 8) {
                System.out.println("Password harus minimal 8 karakter!");
            }
        } while (password.length() < 8);

        // Sisipkan sc.nextLine() untuk membersihkan karakter newline dari buffer
        sc.nextLine();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        Profile profile = new Profile(fullName, age, hobby, StringUtils.generateNickName(fullName));

        listUsernames.add(username);
        listPasswords.add(password);
        listUserProfiles.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Umur\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-------------------------");
    }
}
