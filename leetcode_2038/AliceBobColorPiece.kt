package leetcode_2038

class AliceBobColorPiece {
        fun winnerOfGame(colors: String): Boolean {
            var moveA = 0
            var moveB = 0
            var streakA = 0
            var streakB = 0

            for (i in 0 until colors.length) {
                if (colors[i] == 'A') {
                    streakA++
                    if (streakA >= 3) {
                        moveA++
                    }
                    streakB = 0 // Reset streak for player B
                } else {
                    streakB++
                    if (streakB >= 3) {
                        moveB++
                    }
                    streakA = 0 // Reset streak for player A
                }
            }

            return moveA > moveB
        }

}