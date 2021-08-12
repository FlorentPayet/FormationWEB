package re.example.myprojectfloPay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import splitties.activities.start
import splitties.toast.toast

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth
        val btConnecter = findViewById<Button>(R.id.BT_connecter)
        val etUtilisateur = findViewById<EditText>(R.id.ET_utilisateur)
        val etMdp = findViewById<EditText>(R.id.ET_mdp)
        val btCreer = findViewById<Button>(R.id.BT_creer)

        btCreer.setOnClickListener {
            start<RegistryActivity>()
        }
        btConnecter.setOnClickListener {
            val email = etUtilisateur.text.toString()
            val password = etMdp.text.toString()
            if (email.isEmpty()or password.isEmpty()){
                toast("Remplissez les deux champs")
            }
            else
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        toast("Enregistrement OK")
                        //val user = auth.currentUser
                    } else {
                        // If sign in fails, display a message to the user.

                       toast("Echec d'authentification")

                    }
                }
        }
    }
}
/*
//MAINACTIVITY2
val cpt = intent.getIntExtra("Compteur",0)
//MAINACTIVITY
val cpt = 2
val myintent = Intent(this,MainActivity2::class.java)
myintent.putExtra("Compteur",cpt)
startActivity(myintent)
*/