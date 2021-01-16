import java.awt.Color;

public class InfectedState extends HealthyState {

    public InfectedState(SocialObject socialObject) {
        super(socialObject);
        color = Color.RED;
    }

    @Override
    public void update(int delta) {
        super.update(delta);
        if (so.getLifetime() >= sc.getHospitalArrival() && !sc.hospitalFull()) {
            so.setState(so.getInHospitalState());
            so.setLifetime(0);
            sc.updateLabel("hospitalized", 1);
            sc.updateLabel("infected", -1);
            sc.updateLog("An individual went to hospital.");
        }

        else if (so.getLifetime() >= sc.getInfectedLifetime()) {
            so.setState(so.getDeadState());
            sc.updateLabel("dead", 1);
            sc.updateLabel("infected", -1);
            sc.updateLog("An individual died.");
        }
    }

    @Override
    public boolean checkCollision(SocialObject other) {
        return collides(other);
    }
}
