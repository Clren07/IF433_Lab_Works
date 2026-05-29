package oop_120741_clerensiacatherine.week14
import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi + I/O + Notifikasi sekali
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")
        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// =======================
// Repository Interface
// =======================

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// =======================
// CSV Repository
// =======================

class CsvOrderRepository(private val fileName: String) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {

        File(fileName).bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice,$customerType\n")
        }
    }
}

// =======================
// Notification Interface
// =======================

interface NotificationService {
    fun sendNotification(itemName: String)
}

// =======================
// Email Notifier
// =======================

class EmailNotifier : NotificationService {

    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// =======================
// Pricing Strategy
// =======================

interface PricingStrategy {
    fun calculate(price: Double): Double
}

// Regular Customer Pricing

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}

// VIP Customer Pricing

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

// =======================
// Safe Order Processor
// =======================

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy,
        customerType: String
    ) {

        // Tidak perlu when lagi
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification(itemName)
    }
}

// =======================
// Main
// =======================

fun main() {

    val repo = CsvOrderRepository("orders.csv")

    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repo, notifier)

    // VIP Customer
    processor.processOrder(
        "Laptop",
        10000000.0,
        VipPricing(),
        "VIP"
    )

    // Regular Customer
    processor.processOrder(
        "Mouse",
        200000.0,
        RegularPricing(),
        "REGULAR"
    )
}