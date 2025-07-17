import java.util.ArrayList;

/** ADT เก็บตัวเลขจำนวนเต็มต่าง ๆ โดยที่เรียงจากมากไปน้อย เเละห้ามมี Null หรือตัวเลขซ้ำ
 */
public class IntegerSet {

    ArrayList<Integer> Number ; 
    // Rep Invariant (RI):
    //- Integer in Number เรียงจากน้อยไปมาก
    //- Integer in Number ห้ามมี null
    //- Integer in Number ห้ามมี ตัวเลขซ้ำ

    // AF(Number) - เซตของจำนวนเลขทั้งหมดที่อยู่ใน Array

    /**
     * Constructor เริ่มต้น สร้างเซตว่าง
     */
    public IntegerSet () {
        Number = new ArrayList<>();
        checkRep();
    }

    /**
     * ตรวจสอบว่า Rep Invariant ว่าตัวเลขเป็น Null หรือเรียงจากมากไปน้อยไหม
     */
    private void checkRep(){
        for (int i = 0; i < Number.size() - 1; i++) {
            if (Number.get(i) == null || Number.get(i+1) == null) {
                throw new RuntimeException("Null value is not allowed");
            }
            else if (Number.get(i) >= Number.get(i+1)) {
                throw new RuntimeException("Rep invariant violated!");
            }
        }
    }

    /**
     * เพิ่มเลข
     * @param x เลขที่ต้องการเพิ่มเข้าเซต
     */
    public void add(Integer x){
        if (x == null) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        else if (!this.contains(x)) {
            Number.add(x);
            Number.sort(null);
        }
        checkRep();
    }

    /**
     * ลบตัวอักษรออกจากเซต
     * @param x ตัวอักษรที่ต้องการลบออกจากเซต
     */
    public void remove(Integer x) {
        Number.remove(x);
        checkRep();
    }

    /**
     * ตรวจสอบว่ามีตัวอักษรนี้อยู่ในเซตหรือไม่
     * @param x ตัวอักษรที่ต้องการตรวจสอบ
     * @return เป็นจริงเมื่อมีตัวเลขอยู่ในเซต เเละเป็นเท็จหากไม่มี
     */
    boolean contains(Integer x) {
        return Number.indexOf(x) != -1;
    }

    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size() {
        return Number.size();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < Number.size(); i++) {
            sb.append(Number.get(i));
            if (i < Number.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}