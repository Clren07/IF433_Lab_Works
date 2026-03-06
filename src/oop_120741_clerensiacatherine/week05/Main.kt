package oop_120741_clerensiacatherine.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== Aktivitas Pegawai ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDMM:${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    println("--------------------")
    }

    //Task 1
    val math = MathHelper()
    println(math.hitungLuas(4))        // persegi
    println(math.hitungLuas(5,3))      // persegi panjang
    println(math.hitungLuas(7.0))

    //Task 2
    val EWallet = EWallet("Clerensia", 50000.0)
    val creditCard = CreditCard("Clerensia", 100000.0)
    val paymentMethod : List<PaymentMethod> = listOf(EWallet, creditCard)

    for (paymentMethod in paymentMethod){
        paymentMethod.processPayment(75000.0)
    }
}