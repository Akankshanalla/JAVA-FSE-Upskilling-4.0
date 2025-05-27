class Car {
    String make,model;
    int year;
    void displayDetails(){
        System.out.println("Make: "+make+", Model: "+model+", Year: "+year);
    }
    public static void main(String[] a){
        Car c1=new Car();
        c1.make="Toyota";c1.model="Camry";c1.year=2020;
        c1.displayDetails();
        Car c2=new Car();
        c2.make="Honda";c2.model="Civic";c2.year=2022;
        c2.displayDetails();
    }
}