class starPrinting{
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int star = n;
        while(row<=n){
            int i = 1;
            while(i <= star){
                System.out.println("*");
                i++;
            }
            row++;
            System.out.println();
        }
    }
}