package geekbrains.java_1.lesson_5.animals;

/**
 * Created by Ex13m on 25.07.2016.
 */
public class Animals {

    String name;

    int distance_run ;
    int distance_swim ;
    int altitude_jump ;

    public Animals (
            String name,
            int distance_run,
            int distance_swim,
            int altitude_jump){
        this.name=name;
        this.distance_run=distance_run ;
        this.distance_swim=distance_swim;
        this.altitude_jump=altitude_jump;
    }

    public void canRun  (){System.out.println(name + " смогла пересечь песчаный каньон.");}
    public void canSwim (){System.out.println(name + " смогла переплыть озеро.");}
    public void canJump (){System.out.println(name + " смогла перскочить через заборчик смерти.");}

    public void cantRun  (){System.out.println(name + " не смогла пересечь песчаный каньон.");}
    public void cantSwim (){System.out.println(name + " не смогла переплыть озеро.");}
    public void cantJump (){System.out.println(name + " не смогла перскочить через заборчик смерти.");}


    public int getDistance_run() {return distance_run;}
    public int getDistance_swim(){return distance_swim;}
    public int getAltitude_jump() {return altitude_jump;}



}

