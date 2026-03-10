public class ClassNilaiMahasiswa19 {

    ClassMahasiswa19 ListMhs[];

    ClassNilaiMahasiswa19(ClassMahasiswa19 m[]){
        ListMhs = m;
    }
    int maxUTS(int l, int r){
        if(l == r){
            return ListMhs[l].uts;
        }
        int mid = (l + r) / 2;
        int lmax = maxUTS(l, mid);
        int rmax = maxUTS(mid+1, r);
        if(lmax > rmax){
            return lmax;
        }else{
            return rmax;
        }
    }
    int minUTS(int l, int r){
        if(l == r){
            return ListMhs[l].uts;
        }
        int mid = (l + r) / 2;
        int lmin = minUTS(l, mid);
        int rmin = minUTS(mid+1, r);
        if(lmin < rmin){
            return lmin;
        }else{
            return rmin;
        }
    }
    double rataUAS(){
        double total = 0;

        for(int i = 0; i < ListMhs.length; i++){
            total += ListMhs[i].uas;
        }
        return total / ListMhs.length;
    }
}
    
