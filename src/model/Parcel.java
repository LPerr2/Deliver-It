package model;

public interface Parcel {

    /**
     * Get the weight of the parcel.
     * @return the weight of the parcel
     */
    int getWeight();

    /**
     * Get the length of the parcel.
     * @return the length of the parcel
     */
    int getLength();

    /**
     * Get the height of the parcel.
     * @return the height of the parcel
     */
    int getHeight();

    /**
     * Get the destination of the parcel.
     * @return the destination of the parcel
     */
    String getDestination();

    /**
     * Set the new length of the parcel.
     */
    void newLength();

    /**
     * Set the new height of the parcel.
     */
    void newHeight();
}
