package Queue;
/**
 *
 * @author Fadil
 */
public class Queue {
     private int first;
    private int last;
    private NilaiMatkul[] data = new NilaiMatkul [10];
    Queue(){
        for (int a = 0; a < 10; a++){
            data [a] = new NilaiMatkul();
        }   
    }
    void setFirst(int first){
        this.first =first;
    }
     
    int getFirst(){
        return first;
    }
    int getLast(){
        return last;        
    }
    void createEmpty(){
        first = -1;
        last = -1;
    }
    boolean isEmpty(){
        boolean hasil = false;
        if(first == -1){
            hasil = true;
        }
    return hasil;    
    }
    
    boolean isFull(){
        boolean hasil = false;
        if(last == 9){
            hasil = true;
        }
        return hasil;
    }
    
    void add(String nim, String nama, double nilai){
        if(isEmpty()== true){
            last = 0;
            first = 0;
            data [0].setNim(nim);
            data [0].setNama(nama);
            data [0].setNilai(nilai);
        }
        else{
            if(isFull () != true ){
                last = last +1;
                data [last].setNim(nim);
                data [last].setNama(nama);
                data [last].setNilai(nilai);
            }
        }
    }
    void del(){
        if(last == 0){
            first = -1;
            last = -1;
        }
        else{
            int i;
            for (i=(first + 1); i <= last; i++){
                data[i-1].setNim(data[i].getNim());
                data[i-1].setNama(data[i].getNama());
                data[i-1].setNilai(data[i].getNilai());
            }
            last = last -1;
        }
    }
    
    void printQueue(){
        if(first != -1){
            System.out.println("-----------isi queue-----------");
            int i;
            for(i= last; i >= first; i--){
                System.out.println("===========================");
                System.out.println("elemen ke-1  :"+i);
                System.out.println("Nim  :" + data[i].getNim());
                System.out.println("Nama  :" + data[i].getNama());
                System.out.println("Nilai  :" +data[i].getNilai());
            }
            System.out.println("-------------------------");
        }
        else{
            System.out.println("queue kosong");
        }
    }
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}