/*Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
//Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 
'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. 
Now create an object for each of the subclasses and call their respective methods.*/
//author preetha




public class task5 {



    public static void main(String[] args) {

        Cats c = new Cats();

        c.cats();

        

        Dogs d = new Dogs();

        d.dogs();



    }  

}



abstract class Animals{



    abstract void cats();

    abstract void dogs();

}



class Cats extends Animals{

    

 

    public void cats(){

        System.out.println("Cat's Meow: ");

    }

   

    public void dogs(){}

}



class Dogs extends Animals{

    

  

    public void cats(){

        

    }

 

    public void dogs(){

    System.out.println("Dogs bark: ");

    }

} 

