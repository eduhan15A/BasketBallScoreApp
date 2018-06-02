package com.mtw.eduardolujan.basketballcounterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val teamA:Team = Team()
    val teamB:Team = Team()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun updateScore(){
        txtScoreA.text = teamA.totalPoints.toString()
        txtScoreB.text = teamB.totalPoints.toString()
    }

    fun btnReset(view: View) {
        teamA.resetPoints()
        teamB.resetPoints()
        updateScore()
    }

    fun btn3PA(view: View) {
        teamA.treePointsBasket()
        updateScore()
    }

    fun btn2PA(view: View) {
        teamA.twoPointsBasket()
        updateScore()
    }

    fun btnFTA(view: View) {
        teamA.onePointsBasket()
        updateScore()
    }

    fun btn3PB(view: View) {
        teamB.treePointsBasket()
        updateScore()

    }

    fun btn2PB(view: View) {

        teamB.twoPointsBasket()
        updateScore()
    }

    fun btnFTB(view: View) {
        teamB.onePointsBasket()
        updateScore()

    }




}
