package it.polimi.ingsw.day3;

public abstract class SecureString {

    private String s;

    public SecureString(String s){
        this.s = s;
    }

    public void securePrint(Object o){

        if(isSafe(o))
            System.out.println(s);
        else
            System.out.println("Error");

    }

    abstract protected boolean isSafe(Object o);


    public static void main(String[] args){

        CapabilitySecureString s =
                new CapabilitySecureString("Hello!");

        s.securePrint(null);

        Object o = s.getCapability();

        s.securePrint(null);

        s.securePrint(o);

        s.securePrint(s.getCapability());

    }

}
