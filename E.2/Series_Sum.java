public class Series_Sum {
    private int ans = 0;
    public int sum(int last){
        for(int index = 1;index<=last; index++)
            ans = ans + index;
        return ans;
    }
}
