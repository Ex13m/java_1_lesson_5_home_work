package geekbrains.java_1.lesson_5.animals;

/**
 * Created by Ex13m on 25.07.2016.
 */
public  class Cat extends Animals{

    public Cat(
              String name ,
              int distance_run ,
              int distance_swim ,
              int altitude_jump)  {
          super(name,
          distance_run,
          distance_swim,
          altitude_jump);
    }

    @Override
    public void cantSwim (){System.out.println(name + " не смогла переплыть озеро ибо не умеет плавать.");}
    @Override
    public void canSwim (){System.out.println(name + " не смогла переплыть озеро ибо не умеет плавать.");}
}
