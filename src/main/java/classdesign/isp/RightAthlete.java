package classdesign.isp;

public interface RightAthlete {
    void compete();
}

interface SwimmingAthlete extends  RightAthlete {
    void swim();
}

interface JumpingAthlete extends RightAthlete {
    void jump();
}