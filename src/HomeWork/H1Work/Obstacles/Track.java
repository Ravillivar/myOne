package HomeWork.H1Work.Obstacles;

import HomeWork.H1Work.TheyMember.Member;

public class Track implements Obstracle {
    private final int length;

    public Track (int length){
        this.length = length;
    }
    @Override
    public boolean pass (Member member){
        if (member.jump() > length) {
            System.out.println ("Участник " + member + " смог пробежать дистанцию");
            return true;
        }
        else {
            System.out.println ("Учасник " + member +"Не смог пробежать" + length);
            return false;
        }
    }

}
