package oop_120741_clerensiacatherine.week05

class Admin (nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan kommputer melayani administrasi.")
    }
    fun doAdminWork(){
        println("[$nama] sedang mmerekap data absensi mahasiswa.")
    }
}