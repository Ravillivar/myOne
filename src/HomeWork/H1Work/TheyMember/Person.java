package HomeWork.H1Work.TheyMember;

public class Person implements Member {
    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Person (String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }
    @Override
    public int run(){
        String message = "Человек " + name + "бежит дистанцию " + maxRunLength;
        System.out.println (message);
        return maxRunLength;
    }
    @Override
    public int jump(){
        String message = "Человек " + name + "прыгает в высоту " + jumpHeight;
        System.out.println (message);
        return jumpHeight;
    }

}
