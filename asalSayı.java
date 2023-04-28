public class asalSayı {
    public static void main(String[] args) {
        for(int i = 100; i > 1;i--){
            boolean asalmi = true;
            for(int j = 2; j < i;j++){
                if(i%j==0){
                    asalmi=false;
                }

            }
        if(asalmi){
            System.out.print(i+ " ");
        }

        }
    }
}
