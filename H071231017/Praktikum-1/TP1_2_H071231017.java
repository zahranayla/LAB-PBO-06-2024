import java.util.Scanner;

public class Tp1_Numb2 {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String userinput = new String();  //menyimpan teks yg dimasukkan user

        try {
            System.out.println("Masukan Teks yang Ingin Di konversi: ");  //menjadi format 'titlecase'
            userinput = scanner.nextLine();   //utk membaca input string dri user
        } catch (Exception e) {
            System.out.println("Teks Tidak Valid!");
        }

        System.out.println(Title(userinput));  

    }

    public static String Title(String userinput) {   ////sebagai argumen  dan mengembalikan sebuah string 
        userinput = userinput.toLowerCase();
        char[] inputArray = userinput.toCharArray();  //yg memudahakan akses setiap karakter dlm string

        for (int i = 0; i < inputArray.length ; i++) {   //mengiterasi melaui setiap karakter dalam inputarray

            if(i == 0 || inputArray[i-1] == ' '){

                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }
        }
        String result = new String(inputArray);
        return result;     // menampilkan  sebagai output dri fungsi title 
    }





}