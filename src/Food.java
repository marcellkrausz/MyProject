public class Food {

    private String foodname;
    private String foodtype;
    private int bmitype;

    public Food (String foodname,String foodtype,int bmitype){

            this.foodname=foodname;
            this.foodtype=foodtype;
            this.bmitype=bmitype;

        }


    public int getBmiType() {
        return this.bmitype;
    }
    public String getFoodName(){
        return this.foodname;
    }
}
