package HomeWork.H1Work.Obstacles;

import HomeWork.H1Work.TheyMember.Member;

public class Wall implements Obstracle {

    private final int height;

    public Wall (int height){
        this.height = height;
    }
    @Override
    public boolean pass (Member member){
        if (member.jump() > height) {
            System.out.println ("Участник " + member + " смог перепрыгнуть");
            return true;
        }
        else {
            System.out.println ("Учасник " + member +"Не смог перепрыгнуть стену" + height);
            return false;
        }
    }
}
