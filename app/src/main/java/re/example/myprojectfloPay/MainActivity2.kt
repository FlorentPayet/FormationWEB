package re.example.myprojectfloPay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import splitties.activities.start
import splitties.toast.toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        auth = Firebase.auth


        val tvMdpuser = findViewById<TextView>(R.id.TV_mdpuser)
        val btCreer2 = findViewById<Button>(R.id.BT_creer2)
        val btConnecter2 = findViewById<Button>(R.id.BT_Connecter2)
        val tvMailuser = findViewById<TextView>(R.id.TV_mailuser)

        val email = intent.getStringExtra("Adresse Mail")
        tvMailuser.text = email.toString()
        val password = intent.getStringExtra("Mot de passe")
        tvMdpuser.text = password.toString()

        btCreer2.setOnClickListener {
            start<RegistryActivity>()
        }
        btConnecter2.setOnClickListener {
            start<MainActivity>()
        }

    }
}