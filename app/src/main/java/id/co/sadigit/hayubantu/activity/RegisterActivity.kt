package id.co.sadigit.hayubantu.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.co.sadigit.hayubantu.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}