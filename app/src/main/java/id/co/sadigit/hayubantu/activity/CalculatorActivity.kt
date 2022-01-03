package id.co.sadigit.hayubantu.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.co.sadigit.hayubantu.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}