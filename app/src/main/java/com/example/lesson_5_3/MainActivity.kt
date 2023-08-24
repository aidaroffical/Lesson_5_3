import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_5_3.FirstFragment
import com.example.lesson_5_3.R
import com.example.lesson_5_3.dataBinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, FirstFragment()).commit()
    }
}