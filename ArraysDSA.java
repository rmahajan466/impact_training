public class ArraysDSA {
    public static void main(String[] args) {

        // int[] rollNo = new int[30];
        // int j = 1;
        // for (int i = 0; i < rollNo.length; i++) {
        //     rollNo[i] = j;
        //     j++;
        // }
        // System.out.println("Values filled");
        // for (int k : rollNo) {
        //     System.out.println(k);
        // }
        int marks[] = {97,98,99};
        update(marks);
        //System.out.println(marks[0]);
        for (int j : marks){
            System.out.println(j);
        }
    }
    public static void update(int a[]) {
        for (int i = 0 ;i<a.length; i++)
        {
            a[i] = a[i]+1;
        }
    }
}
