/*
Question 4
[Java Programming]
[25 Marks] 
Sherlock Holmes was your colleague in 2SH4 this semester then he got an internship in DroneX, a startup working in drones. 
Specifically, Sherlock was in the team developing the software for Drone Swarm: A project that involves an array of drones flying cooperatively. 
Sherlock's manager asked him to write a method for automatic safety checking of the swarm such that it monitors the flying swarm of drones and determines if any two drones 
(or more) are possible to collide. 
Sherlock goes back to his 2SH4 notes and looks for some hints. 
He found that he wrote a Circle class (you find it in the MyCircle.java file), which he can use to model 
the safety zone of each drone. 
Then, he writes the following prototype of the method:
String SafteyAlert(Circle[] swarm)
which takes as input an array of Circle objects and returns a String as follows:
- "Red": if at least two circles intersect
- "Yellow": If no circles intersect AND at least two circles become tangential
- "Green" : if there are no tangential or intersecting circles at all
Afterwards, Sherlock was stuck, he seeks your help. 
(a) [12 Marks] You are required to help him by completing the implementation of the SafetyAlert method below.
(b) [13 Marks] You are then required to help Sherlock test his method on the swarm of 100 drones in the main method below. 
HINT: Sherlock tells you the following information:
**Two safety zones of two drones are:
- "not intersecting" (Green) if the summation of their radii is smaller than the distance between their centers. 
- "tangential" (Yellow) if the summation of their radii is exactly equal to the distance between their centers. 
- "intersecting" (Red) if the summation of their radii is larger than the distance between their centers.
 
*/

public class DroneSafetyZone //define class
{
    
    
    public String SafteyAlert(MyCircle[] swarm){
        
        int intersectCircle = 0; //define variables
        int tangentCircle = 0;
 
        for (MyCircle circle: swarm) {
            for (MyCircle rerun: swarm) {
                if (rerun.equals(circle)) {//breal is implemented to ensure no circle is compared to itself
                    break;
                }//nested for loop implemented to go through array of circles in order to compare them to one another
                
                double radialSum = rerun.getRadius() + circle.getRadius();  //sum of the radius of two different circles
                
		double centDistance = circle.getCentre().distanceTo(rerun.getCentre()); //total distance between the centers of two circles
                
                if (radialSum > centDistance) {
                    intersectCircle++;
                }//a check to see if two circles intersect
                
		
		else if (radialSum == centDistance) {
                    tangentCircle++;
                }//a check to see if two circles are tangent
            }
        }
        
        if (intersect > 0) {
            return "Red";
        }// radii larger than distance between centers
        
	else if (intersect !=0 &&tangent > 0) {
            return "Yellow";
        
	//summation of radii is exactly equal to distance between centers
	}
        else {
            return "Green"; 
        }//not intersecting
    }




    public static void main(String[] args) {
        DroneSafetyZone test = new DroneSafetyZone();
        int radlength = 12;//radius
        MyCircle[] dronetest = new  MyCircle[100]; //100 drones
        for(int a =0; a<100;a++){
            dronetest[a] = new MyCircle(radlength, a*20,0);
    
        }//test cases of 100 drones implemented using for loop
    
    
        System.out.println(test.SafteyAlert(dronetest)); //print result
        
        
        
    }
