package Storage;

public class Storage32 extends Storage {

    public Storage32(String info) {
        super(info);
    }

    @Override
    public String spec() {
        return "Max 32GB, " + toString();
    }
    
}
