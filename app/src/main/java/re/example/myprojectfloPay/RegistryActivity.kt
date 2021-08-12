package re.example.myprojectfloPay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import splitties.activities.start
import splitties.toast.toast

class RegistryActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth

        auth.signOut()

        val btConnecter = findViewById<Button>(R.id.BT_connecter)
        val etUtilisateur = findViewById<EditText>(R.id.ET_utilisateur)
        val etMdp = findViewById<EditText>(R.id.ET_mdp)
        val btCreer = findViewById<Button>(R.id.BT_creer)

        btConnecter.text = "S'inscrire"
        btCreer.text = "Se connecter"

        btCreer.setOnClickListener {
            start<MainActivity>()
        }
        btConnecter.setOnClickListener {
            val email = etUtilisateur.text.toString()
            val password = etMdp.text.toString()
            if (email.isEmpty() or password.isEmpty()) {
                toast("Remplissez les deux champs")
            } else auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful){
                    val user = auth.currentUser
                        toast("Enregistrement OK")
                        user?.sendEmailVerification()
                            ?.addOnCompleteListener { task ->
                            toast("Un message de vérification vous à été envoyé")
                            }
                        }
                    else
                        toast("Erreur")
                    val myintent = Intent(this,MainActivity2::class.java)
                    myintent.putExtra("Adresse Mail",email)
                    myintent.putExtra("Mot de passe",password)
                    startActivity(myintent,)

                }

            }
        }


}

