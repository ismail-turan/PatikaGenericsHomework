public class Main {
    public static void main(String[] args) {
        /* MyList<Integer>list=new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : "+ list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Dizideki Eleman Sayısı : "+list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Dizideki Eleman Sayısı : "+list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        MyList<Integer> list =new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("2. indisteki değer : "+list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0,100);
        System.out.println("2. indisteki değer : "+list.get(2));
        System.out.println(list.toString());
 */
        MyList<Integer> list=new MyList<>();
        System.out.println("Liste durumu : "+(list.isEmpty() ? "Boş" : "Dolu"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("Liste durumu : "+(list.isEmpty() ? "Boş" : "Dolu"));
        //Bulduğu ilk indexi verir .
        System.out.println("Indeks : " +list.indexOf(20));
        //Bulamazsa -1 döndürür.
        System.out.println("Indeks : " + list.indexOf(100));
        //Bulduğu son indeksi verir.
        System.out.println("Indeks : " + list.lastIndexOf(20));
        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi =list.toArray();
        System.out.println("Object dizisinin ilk elemanı : " +dizi[0]);
        // Liste veri türünde alt bir liste oluşturdu.
        MyList<Integer> altListem = list.subList(0,3);
        System.out.println(altListem.toString());
        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listede 20 değeri : " + list.contains(20));
        System.out.println("Listede 120 değeri : " + list.contains(120));
        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir.
        list.clear();
        System.out.print("Liste boşaltıldı : ");
        System.out.println(list.toString());
    }
}