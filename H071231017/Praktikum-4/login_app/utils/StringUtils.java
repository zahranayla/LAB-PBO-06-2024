package utils;

public class StringUtils {
    public static String generateNickName(String fullName) {
        // Memisahkan nama lengkap menjadi array kata
        String[] words = fullName.split(" ");

        // Mengembalikan nickName berdasarkan aturan yang diberikan
        if (words.length == 1) {
            // Jika fullName hanya terdiri dari satu kata, maka nickName adalah fullName itu sendiri
            return words[0];
        } else {
            // Jika fullName terdiri dari lebih dari satu kata, maka nickName adalah kata kedua dari fullName
            return words[1];
        }
    }
}

