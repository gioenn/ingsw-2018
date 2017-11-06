package it.polimi.ingsw.day3;

public class CapabilitySecureString extends SecureString {

    private Object capability;
    private boolean capabilityEmitted;

    public CapabilitySecureString(String s) {
        super(s);
        capabilityEmitted = false;
        capability = null;
    }

    public Object getCapability() {

        if (capabilityEmitted)
            return null;

        capability = new Object();
        capabilityEmitted = true;

        return capability;
    }

    @Override
    protected boolean isSafe(Object o){
        return o == capability;
    }

}
