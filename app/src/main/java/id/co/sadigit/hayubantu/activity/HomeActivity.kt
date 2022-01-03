package id.co.sadigit.hayubantu.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.co.sadigit.hayubantu.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}