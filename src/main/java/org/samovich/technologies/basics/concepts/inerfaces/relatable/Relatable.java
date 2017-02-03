/**
 * @file Relatable.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/04
 */

package org.samovich.technologies.basics.concepts.inerfaces.relatable;

/**
 * This interface defines how to compare the size of objects.
 */
public interface Relatable {

    /*
     * This object calling isLargerThan and other must be instances of the same
     * class returns 1, 0, -1 if this is greater than, equal to, or less than
     * other.
     */
    public int isLargerThan (Relatable other);

}
