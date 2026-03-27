package oop_120741_clerensiacatherine.week07

fun processEvent(event: BattleState) {
        when (event) {
            is BattleState.MonsterEncounter -> {
                println("Monster muncul: ${event.monsterName}")
            }

            is BattleState.LootDropped -> {
                println("Dapat item: ${event.item.name} (Rarity: ${event.item.rarity})")
            }

            is BattleState.GameOver -> {
                println("Game Over: ${event.reason}")
            }

            BattleState.SafeZone -> {
                println("Kamu berada di zona aman.")
            }
        }
    }

