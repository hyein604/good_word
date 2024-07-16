package com.hyein.goodwords

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("좌절은 짧게 대책은 빠르게")
        sentenceList.add("R = VD")
        sentenceList.add("성공은 준비된 자가 기회를 만났을 때 이루어 진다.")
        sentenceList.add("왕관을 쓰려는 자, 그 무게를 견뎌라.")
        sentenceList.add("하루라도 독서를 하지 않으면 입에 가시가 돋는다.")
        sentenceList.add("결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다.")
        sentenceList.add("두 개의 화살을 갖지 마라. 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다.")
        sentenceList.add("뛰어난 말에게도 채찍이 필요하다.")

        val sentnece_adapter = ListViewAdapter(sentenceList)

        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentnece_adapter
    }
}