package id.co.sadigit.hayubantu.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.co.sadigit.hayubantu.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}