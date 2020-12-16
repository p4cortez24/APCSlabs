
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int health; //a range between 0 and 100

    /**
     * Default Constructor for objects of class Dinosaur
     */
    public Dinosaur()
    {
        // initialise instance variables
        type = "Dino";
        age = 0;
        //write code that will assign a gender to this dino
        // 50% should be male and 50% should be female
        if (Math.random() > 0.5)
        {
            this.gender = "Male";
        }
        else
        {
            this.gender = "Female";
        }
        this.health = 10;
    }
    /**
     * Explicit constructor for the Dino class
     */

    public Dinosaur (String t)
    {
        this.type = t;
        this.age = 0;
        this.health = 10;
        //write code to set gender to male or female 50% of the time
    }

    /******** Getters **************/
    // Getters return the private instance data
    public String getType()
    {
        return this.type;
    }

    public String getGender()
    {
        return this.gender;
    }
    //public int getHealth()
    //make getter for gender
    public int getHealth()
    {
        return this.health;
    }

    public int getAge()
    {
        return this.age;
    }

    /******* Setters *************/

    public void setType(String t)
    {
        this.type = t;
    }

    public void setHealth(int h)
    {
        this.health = h;
    }

    public void setAge(int a)
    {
        this.age = a;
    }
    //make setter for gender
    public void setGender(String g)
    {
        this.gender = g;
    }

    public boolean equals(Dinosaur d)
    {
        //write code that will return true if two dinos are "equal"
        //return true if they're equal, false otherwise
        if (d.type.equals(this.type) && d.age==this.age)
        {
            if (Math.abs(d.getHealth()-this.health)<10)
                return true;
        }
        return false;
    }

    public void ageUp()
    {
        if(this.health > 0)
            {
                this.age++;
                if (this.age < 10)
                {
                    this.health+=10;
                }
                else if (25<=this.age && this.age<=30)
                {
                    this.health-=5;
                }
                else if (this.age>30)
                {
                    this.health-=10;
                }
                // if age is less than 10 health increases by 10
                
                //No change to health if age is between 10 and 24
                
                //Health decrease by 5 if age is between 25 and 30
                
                //Health decreases by 10 if age is greater than 30
                                              
            }   
        
    }

    //Return this Dino as a string
    public String toString()
    {
        String answer = this.type + " " + this.age + " " + this.health + " " + this.gender;
        return answer;
    }
}
