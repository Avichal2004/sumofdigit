
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 4589;
        int n=0;
        int sum =0;
        while(x!=0){
            n=x%10;
            sum+=n;
            x=x/10;
        }
        System.out.println(sum);

    }
}