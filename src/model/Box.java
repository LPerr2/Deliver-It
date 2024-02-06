package model;

public class Box implements Parcel {
    /**
     * Get the weight of the parcel.
     *
     * @return the weight of the parcel
     */
    @Override
    public int getWeight() {
        return 0;
    }

    /**
     * Get the length of the parcel.
     *
     * @return the length of the parcel
     */
    @Override
    public int getLength() {
        return 0;
    }

    /**
     * Get the height of the parcel.
     *
     * @return the height of the parcel
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * Get the destination of the parcel.
     *
     * @return the destination of the parcel
     */
    @Override
    public String getDestination() {
        return null;
    }

    /**
     * Set the new length of the parcel.
     */
    @Override
    public void newLength() {

    }

    /**
     * Set the new height of the parcel.
     */
    @Override
    public void newHeight() {

    }
}
