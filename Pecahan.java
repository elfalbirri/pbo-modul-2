public class Pecahan {
    private int pembilang;
    private int penyebut;
    
    Pecahan(int pembilang, int penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }
    
    public String tambah(Pecahan A){
        Pecahan hasil = new Pecahan(0,0);
        if (A.penyebut == this.penyebut){
            hasil.pembilang = A.pembilang+this.pembilang;
        }
        else if (this.penyebut%A.penyebut==0){
            hasil.penyebut = this.penyebut;
            hasil.pembilang = this.pembilang+(A.pembilang*(this.penyebut/A.penyebut));
        }
        else if (A.penyebut%this.penyebut==0){
            hasil.penyebut = A.penyebut;
            hasil.pembilang = A.pembilang+(this.pembilang*(A.penyebut/this.penyebut));
        }
        else {
            hasil.penyebut = A.penyebut*this.penyebut;
            hasil.pembilang = (hasil.penyebut/A.penyebut*A.pembilang)+(hasil.penyebut/this.penyebut*this.pembilang);
        }
        if (hasil.pembilang%2==0 && hasil.penyebut%2==0){
            hasil.pembilang /= 2;
            hasil.penyebut /= 2;
        }
        return "pembilang : " + hasil.pembilang + "\npenyebut : " + hasil.penyebut;
    }

    /**
     * @return the pembilang
     */
    public int getPembilang() {
        return pembilang;
    }

    /**
     * @param pembilang the pembilang to set
     */
    public void setPembilang(int pembilang) {
        this.pembilang = pembilang;
    }

    /**
     * @return the penyebut
     */
    public int getPenyebut() {
        return penyebut;
    }

    /**
     * @param penyebut the penyebut to set
     */
    public void setPenyebut(int penyebut) {
        this.penyebut = penyebut;
    }
}
