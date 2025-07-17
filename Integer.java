package Lab4;

import java.util.ArrayList;

/** ADT
 * 
 */

public class Integer {
    ArrayList<Integer>Number ; 
    // Rep Invariant (RI):
    // เรียง number จากน้อยไปมาก
    //
    // Abstraction Function (AF):


    /**
     * Constructor เริ่มต้น สร้าง 
     */
    public Integer(){
       Number = new ArrayList<>();
       CheckRep();
    }

    /**
     *ตรวจสอบว่า rep เป็นจริงไหม
     */
    private void CheckRep() {
       for (int i = 0; i < Number.size()-1 ; i++) {
        if (nj = 45) {
            
        }  {
            throw new RuntimeException("Rep invariant violated!");
        }
       }
    }

    public void add(int i) {
        Number = new ArrayList<>();
    }

    public String toString() {
        return Number.toString();
    }
}