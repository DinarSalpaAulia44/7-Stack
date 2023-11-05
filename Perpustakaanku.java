import java.util.Stack;

class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int kategori;

    public Buku(String judul, String pengarang, String penerbit, int tahun, int kategori){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
    }
}


public class Perpustakaanku {
    public static void main(String[] args) {

        Stack<Buku> DaftarBuku = new Stack<>();

        DaftarBuku.push(new Buku(" Organisasi & Arsitektur komputer ", " Maman Abdurrohman ", " Informatika Bandung ", 2015, 1));
        DaftarBuku.push(new Buku( " Rekayasa Perangkat Lunak ", " B.Ladjamudin ", " Al Bahra ", 2006 , 1));
        DaftarBuku.push(new Buku( " Pengenalan Komputer ", " Jogiyanto Hartono ", " ANDI ", 2000 , 1));
        DaftarBuku.push(new Buku("Emotional Quality Manajement", "Anthony Dio Martin", "ARGA", 2000 , 2));
        DaftarBuku.push(new Buku(" Saksi Mata ", " Seno Gumira Ajidarma ", " Areksa ", 2003 , 3));
        DaftarBuku.push(new Buku(" Dallergut ", " Lee Miye ", " baca ", 2020 , 3));
        DaftarBuku.push(new Buku(" Khotbah Jum'at Sepanjang Masa ", " Ust. Mohammad farhad ", " Amelia ", 2005 , 4));

        System.out.println("====================================================================================================================");
        System.out.println("    Daftar Buku yang Tersedia ");
        System.out.println("====================================================================================================================");
        System.out.println("No\tJudul\tAuthor\tPenerbit\tTahun\tKategori");
        System.out.println("====================================================================================================================");

        int bukuTeknik = 0;
        int bukuManajemen = 0;
        int bukuFiksi = 0;
        int bukuLainnya = 0;
        int bukuLawas = 0;
        int bukuBaru = 0;

        while (!DaftarBuku.isEmpty()) {
            Buku buku = DaftarBuku.pop();
            System.out.println(buku.judul + "\t" + buku.pengarang + "\t" + buku.penerbit + "\t" + buku.tahun + "\t" + kategoriToString(buku.kategori));
            if (buku.kategori == 1){
                bukuTeknik++;
            } else if (buku.kategori == 2) {
                bukuManajemen++;
            }else if (buku.kategori == 3) {
                bukuFiksi++;
            }else{
                bukuLainnya++;
            }

            if (buku.tahun < 2004) {
                bukuLawas++;
            }else {
                bukuBaru++;
            }
        }

        System.out.println(" Jumlah buku yang tersedia: " + (bukuTeknik + bukuManajemen + bukuFiksi + bukuLainnya));
        System.out.println("Buku Teknik: " + bukuTeknik);
        System.out.println("Buku Manajemen: " + bukuManajemen);
        System.out.println("Buku Fiksi: " + bukuFiksi);
        System.out.println("Buku Lainnya: " + bukuLainnya);
        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);
        

        
    }

    private static String kategoriToString(int kategori) {
        switch (kategori) {
            case 1 :
            return "Teknik";
            case 2 :
            return "Manajemen";
            case 3 :
            return "Fiksi";
            default :
            return "Lainnya";
        }
    }
    
}
