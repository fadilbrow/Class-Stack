package Stack;
/**
 *
 * @author Fadil
 */
public class Stack {
   int top;
  NilaiMatkul[] data = new NilaiMatkul[10];
  
  Stack() {
      for (int i = 0; i < 10; i++) {
          data[i] = new NilaiMatkul();
      }
  }
  
  void setTop(int top){
      this.top = top;
  }
  int getTop(){
      return top;
  }

void createEmpty() {
    top = -1;
}

boolean isEmpty(){
     boolean hasil = false;
            
    if (top == -1) {
        hasil = true;
    }
    
    return hasil;
}

boolean isFull(){
    boolean hasil = false;
    
    if (top == data.length -1){
        hasil = true;
    }
    
    return hasil;
}
void push(String nim, String nama, double nilai){
    if (isFull() == true) {
    // jika stack penuh
    System.out.println("Stacknya penuh nih");
}
    else {
            if (isEmpty() == true) {
            //jika stack kosong
            top = 0;
            data[0].setNim (nim);
            data[0].setNama (nama);
            data[0].setNilai (nilai);
            }
            else {
            // jika stack tidak kosong
            top = top + 1;
            data[top].setNim (nim);
            data[top].setNama (nama);
            data[top].setNilai (nilai);
            }
            }
}

void pop() {
    if (top == 0) {
        // jika stack berisi satu elemen
        top = -1;
    } else {
        if (top != -1) {
            // jika stack tidak kosong
            top = top -1;
        }
    }
}

void printStack() {
    if (top != -1) {
        System.out.println("------------isi stack------------");
        int i;
        
        for (i = top; i >= 0; i--) {
            System.out.println("=================================");
            System.out.println("elemen ke-" + i);
            System.out.println("nim : " + data[i].getNim());
            System.out.println("nama : " + data[i].getNama());
            System.out.println("nilai : " + data[i].getNilai());
        }
            System.out.println("-------------------------------");
                    
    }
    else {
        // proses jika stacknya kosong
        System.out.println("stack kosong");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
