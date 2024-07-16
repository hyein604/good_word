package com.hyein.goodwords

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.hyein.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding   // 데이터 바인딩
    private var isDouble = false     //onBackPressed에서 쓰임

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("좌절은 짧게 대책은 빠르게")
        sentenceList.add("R = VD")
        sentenceList.add("성공은 준비된 자가 기회를 만났을 때 이루어 진다.")
        sentenceList.add("왕관을 쓰려는 자, 그 무게를 견뎌라.")
        sentenceList.add("하루라도 독서를 하지 않으면 입에 가시가 돋는다.")
        sentenceList.add("결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다.")
        sentenceList.add("두 개의 화살을 갖지 마라. 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다.")
        sentenceList.add("뛰어난 말에게도 채찍이 필요하다.")

        sentenceList.random()


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.showAllSentenceBtn.setOnClickListener{
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
        binding.showRandomSentenceBtn.setOnClickListener{
            binding.goodWordTextArea.setText(sentenceList.random())
        }
    }

    // 뒤로가기 두번 누르면 종료
    override fun onBackPressed() {
        if(isDouble){
            finish()
        }
        isDouble = true
        Toast.makeText(this, "종료 하시려면 뒤로가기를 한번 더 누르세요", Toast.LENGTH_LONG).show()

        Handler().postDelayed(Runnable{
            isDouble = false
        },2000)
    }
}