public class Main {
    public static void main(String[] args) {
        int sashaAge = 22;
        int mishaAge = 18;
        int pashaAge = 23;

        int min, mid, max;

        min = sashaAge < mishaAge ? sashaAge : mishaAge;
        min = min < pashaAge ? min : pashaAge;

        max = sashaAge > mishaAge ? sashaAge : mishaAge;
        max = pashaAge > max ? pashaAge : max;

        mid = (pashaAge < max) && (pashaAge > min) ? pashaAge : sashaAge;
        mid = (mid < max) && (mid > min) ? mid : mishaAge;

        System.out.println("min: " + min);
        System.out.println("mid: " + mid);
        System.out.println("max: " + max);
    }
}
