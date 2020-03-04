public class Trainee {

    private int id;
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi;

    public Trainee(int id, String name,int age,double weight,double height){

            this.id=id;
            this.name=name;
            this.age=age;
            this.weight=weight;
            this.height=height;
            weight=weight;
            double heightInMeters = height / 100;
            double heightSquare = Math.pow(heightInMeters, 2);
            this.bmi=weight / heightSquare;

         }

      public void updateWeight(int weight){
            weight=weight;
            double heightInMeters = height / 100;
            double heightSquare = Math.pow(heightInMeters, 2);
            this.bmi= weight / heightSquare;
      }

    public double getBmi() {
        return bmi;
    }
}

