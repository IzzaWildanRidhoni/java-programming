public class App {
    public static void main(String[] args) throws Exception {
        char[] dicodigChars = {'d','i','c','o','d','i','n','g'};
        String dicodiString = new String(dicodigChars);
        System.out.println(dicodiString);

        String dicoding = "dicoding";

        // mengetahui panjang string
        int length = dicoding.length();
        System.out.println(length);

        // mengambil karakter dari sebuah string
        char result = dicoding.charAt(7);
        System.out.println(result);
        

    }
}
