package Camera;

public class Camera2 extends Camera {

    public Camera2(String info) {
        super(info);
    }

    @Override
    public String spec() {
        return "Opt. zoom x2, " + toString();
    }
    
}
