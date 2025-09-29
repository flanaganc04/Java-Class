public class CumulativeSums {
private int total;
private int[] ary =  {1,4,5, 7, 9, 10, 100};
private int counter = ary.length - 1;

    public void computeSum() {

        if (counter == 0) {
        
            total(ary[counter]);
            System.out.println(getTotal());
        }
        else {

            total(ary[counter]);
            decreaseCounter();
            computeSum();
            
        }
        
    }

    public void total(int n) {
        total += n;
    }

    public int getTotal() {
        return total;
    }

    public void decreaseCounter() {
    counter = counter - 1;
    }

    public static void main(String[] args) {
        
    }
}