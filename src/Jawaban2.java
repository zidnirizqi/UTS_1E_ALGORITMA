public class Jawaban2 {
    public static void main(String[]args) {
        float [] myNumber = new float[] {2.34F, 4.56F, 67.89F};
        PembulatanKata(myNumber);
    }

    public static void PembulatanKata(float [] myNumber){
        System.out.println(Math.ceil(myNumber[0]));
        System.out.println(Math.ceil(myNumber[1]));
        System.out.println(Math.ceil(myNumber[2]));
    }
}
