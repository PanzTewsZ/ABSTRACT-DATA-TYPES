import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> Numbers ;
    // Rep Invariant (RI):
    //
    //
    //Abstraction Function (AF):

    /**
     * Constructor เริ่มต้นสร้างเซตว่าง
     */
    public IntegerSet() {
       Numbers = new ArrayList<>();
       CheckRep();
    }

    /**
     * ตรวจสอบ Rep Invariant เป็นจริงไหม
     */
    private void CheckRep() {
        if (Numbers.size() != 0) {
            for (int i = 0 ; i < Numbers.size()-1 ; i++) {
                if (Numbers.get(i) >= Numbers.get(i+1)) {
                  throw new RuntimeException("Rep invariant violated!");
                }
            }
        }
    }

    /**
     * 
     * @param
     */
    public void add(Integer x) {
        if (!this.contains(x)) {
            Numbers.add(x);
            Numbers.sort(null);
        }
        CheckRep();
    }


/**
 *
 * @param m
 * @return
 */
    public boolean contains(int m) {
        return Numbers.indexOf(m) != 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < Numbers.size(); i++) {
            sb.append(Numbers.get(i));
            if (i <Numbers.size()-1 ) {
                sb.append(",");
            }
        }
        sb.append("]");
        return Numbers.toString();
    }
   
}