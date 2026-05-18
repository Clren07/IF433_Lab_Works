package oop_120741_clerensiacatherine.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    // Validasi hardware dispenser
    if (isJammed) {
        throw DispenserJamException()
    }

    return availableGram - requestedGram
}