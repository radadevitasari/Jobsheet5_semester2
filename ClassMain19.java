public class ClassMain19 {
    public static void main(String[] args) {
         ClassMahasiswa19 mhs[] = {
            new ClassMahasiswa19("Ahmad","220101001",2022,78,82),
            new ClassMahasiswa19("Budi","220101002",2022,85,88),
            new ClassMahasiswa19("Cindy","220101003",2021,90,87),
            new ClassMahasiswa19("Dian","220101004",2021,76,79),
            new ClassMahasiswa19("Eko","220101005",2023,92,95),
            new ClassMahasiswa19("Fajar","220101006",2020,88,85),
            new ClassMahasiswa19("Gina","220101007",2023,80,83),
            new ClassMahasiswa19("Hadi","220101008",2020,82,84)
        };
        ClassNilaiMahasiswa19 nm = new ClassNilaiMahasiswa19(mhs);
        System.out.println("Nilai UTS Tertinggi : " + nm.maxUTS(0, mhs.length-1));
        System.out.println("Nilai UTS Terendah  : " + nm.minUTS(0, mhs.length-1));
        System.out.println("Rata-rata Nilai UAS : " + nm.rataUAS());
    }
}
    
