package com.pluralsight;

public class Moped extends Vehicle{

    boolean hasHelmetStorage;

    public boolean isHasHelmetStorage() {
        return hasHelmetStorage;
    }

    public void setHasHelmetStorage(boolean hasHelmetStorage) {
        this.hasHelmetStorage = hasHelmetStorage;
    }
    public void storeHelmet(){
        this.hasHelmetStorage = true;
    }
}
