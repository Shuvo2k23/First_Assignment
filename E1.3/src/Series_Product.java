public class Series_Product {
    private int ans = 1;
    public int Mul(int last){
        for(int index = 1;index<=last;index++)
            ans = ans*index;
        return ans;
    }
}
