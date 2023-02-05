public class MyList <T>{
    private int capacity;
    private T[] list;
    private T[] listTemp;
    private int dimensionSize;

    public void setList(){
        this.list=(T[]) new Object[this.capacity];
    }
    public void increaseCapasity(){
        this.listTemp=(T[]) new Object[this.capacity];
        for (int i=0;i<this.list.length;i++){
            this.listTemp[i]=this.list[i];
        }
        this.list=this.listTemp;
    }
    public MyList(int capacity){
        this.capacity=capacity;
        this.setList();
    }
    //Kapasitesini belirttik burada
    public MyList(){
        this.capacity=10;
        this.setList();
    }
    //Dizinin kapasitesini verir.
    public int getCapacity(){
        return capacity;
    }
    //Dizinin eleman sayısını verir.
    public  int size(){
        return this.dimensionSize;
    }

    public void sizeCalc(){
        int count=0;
        for (int i=0;i<this.list.length;i++){
            if (this.list[i]!=null){
                count++;
            }
        }
        this.dimensionSize=count;
    }
    //Kapasite uzunluktan büyükse değişiklik yapma değilse iki katına çıart.
    public void add(T data){
        if (this.size()<this.capacity){
            list[this.dimensionSize]=data;
            this.sizeCalc();
        }else {
            this.capacity=this.capacity*2;
            this.increaseCapasity();
            this.add(data);
        }
    }
    //to String sınıfını override ettik.Listeyi ekrana bastıracak.
    @Override
    public String toString(){
        System.out.println("[");
        for (T x:list){
            if (x!=null){
                System.out.println(x+", ");
            }
        }
        System.out.println("]");
        return "";
    }
    //Verilen indeksteki değeri döndürür.
    public T get(int idx){
        T x=this.list[idx];
        return x;

    }
    //Verilen indisteki veriyi silme ve silinen indis sonrasındakileri sola doğru kaydırma işlemi.
    public void remove(int idx){
        replaceForRemove(idx);
        this.dimensionSize--;
    }
    public void replaceForRemove(int idx){
        T[] listTemp2=this.list;
        this.list[idx]=null;
        for (int i=0;i<listTemp2.length-1;i++){
            if (idx==0){
                this.list[i]=listTemp2[i+1];
            } else if (idx!=0 && i<idx) {
                this.list[i]=listTemp2[i];
            } else if (idx!=0 && i>idx) {
                this.list[i]=listTemp2[i+1];
            }
        }
    }
    //Verilen indisteki veriyi yenisi ile değiştirme işlemi yapılır. Geçersiz indis girilirse null döndürür.
    public void set(int idx,T data){
        this.list[idx]=data;
    }
    //Parametrede verilen nesnenin listedeki indeksini verir.Yoksa - değerini döndürür.
    public int indexOf(T data){
        for (int i=0;i<this.list.length;i++){
            if (data==this.list[i]){
                return i;
            }
        }
        return -1;
    }
    //Belirtilen ögenin listedeki son indeksini verir.Nesne listede yoksa -1 döndürür.
    public int lastIndexOf(T data){
        int lastIdx =-1;
        for (int i = 0; i<this.list.length;i++ ){
            if (data ==this.list[i]){
                lastIdx = i;
            }
        }
        return lastIdx;
    }
    //Liste boşsa 0 döndürür.
    public boolean isEmpty(){
        if (this.size()==0)return true;
        else return false;
    }
    //Listedeki öğeleri aynı sırayla bir array haline getirir.
    public Object[] toArray(){
        Object[] tempObject =new Object[this.list.length];
        for (int i =0;i<this.list.length;i++){
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }
    //Parametrede verilen indeks aralığına ait bir liste döndürür.
    public MyList<T> subList(int x, int y){
        MyList<T> sub =new MyList<>(y-x+1);
        for (int i=x;i<=y;i++){
            sub.add((T)this.list[i]);
        }
        return sub;
    }
    // Parametrede verilen değerlerin dizide olup olmadığını söyler.
    public boolean contains(T data){
        for (int i=0;i<this.list.length;i++){
            if (data ==this.list[i]){
                return true;
            }
        }
        return false;
    }
    // Listedeki bütün ögeleri siler ,boş liste haline getirir.
    public void clear(){
        for (int i=0;i<this.list.length;i++){
            this.list[i] =null;
        }
    }
}
