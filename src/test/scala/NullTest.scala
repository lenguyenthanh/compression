package org.lichess.compression.game

import org.specs2.mutable.*

class NullTest extends Specification:

//    "why null" in {
//      val pgn = "a4 c5 a5 c4 a6 c3 axb7 cxb2 bxa8=Q bxa1=K"
//      val pgnMoves = pgn.split(" ")
//      val encoded = Encoder.encode(pgnMoves)
//      println(encoded)
//      val decoded = Encoder.decode(encoded, pgnMoves.size)
//      pgnMoves must_== decoded.pgnMoves
//    }

  "slidingAttacks" in {
    val result = Bitboard.slidingAttacks(10, Bitboard.ALL, Bitboard.WHITE_PAWN_DELTAS)
    result must_=== 0xa0000L
  }
