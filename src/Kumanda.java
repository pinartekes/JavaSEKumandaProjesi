
import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String> {
    private ArrayList<String> kanallar = new ArrayList<String>();
    public class KumandaIterator implements Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            if (index > kanallar.size()) {
                return false;
            } else {
                return true;
            }
        }
        @Override
        public String next() {
            String kanal = kanallar.get(index);
            index++;
            return kanal;
        }
    }
    public void kanalEkle(String kanal) {
        kanallar.add(kanal);
    }
    public void kanalSil(String kanal) {
        if (kanallar.contains(kanal)) {
            System.out.println("Kanal Kaldirildi...");
            kanallar.remove(kanal);
        } else {
            System.out.println("Kanal Bulunamadi...");
        }
    }
    public int kanalSayisi() {
        return kanallar.size();
    }
    public void kanallariGoster(Kumanda kumanda) {
        if (kanallar.size() == 0) {
            System.out.println(">>Kanal Sayisi 0");
        } else {
            for (String kanal : kanallar) {
                System.out.println(">>Kanal : " + kanal);
            }
        }
    }
    @Override
    public Iterator<String> iterator() {
        return new KumandaIterator();
    }
}
