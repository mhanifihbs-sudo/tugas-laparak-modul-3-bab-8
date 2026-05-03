public class Burung implements MakhlukHidup {
    
    @Override
    public void makan() {
        System.out.println("Burung makan biji-bijian mematuk dengan paruh.");
    }

    @Override
    public void berjalan() {
        System.out.println("Burung berjalan dengan 2 kaki melompat dan bisa terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya: Cuit cuit!");
    }
}