package extra1.override;

public class OverrideMainClass {

    public static void main (String[] args) {
        
        // Create the new Object of OverrideSubClass
        OverrideSubClass subClass = new OverrideSubClass();
        // Call overridden method hello()
        subClass.hello();
    }
}
