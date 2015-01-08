/**
 * @file ClassPreamble.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 08/01/2014
 */
package com.samovich.java.specialized.annotations.type;

// import statement to use @Documented
import java.lang.annotation.Documented;
/**
 * Define the annotation type. It's define with interface by the at sign (@).
 * @ = AT, as in annotation type.
 */
@Documented
@interface ClassPreamble {

    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array;
    String[] reviewers();
}
