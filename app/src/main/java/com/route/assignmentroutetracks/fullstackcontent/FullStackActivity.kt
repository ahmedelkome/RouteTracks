package com.route.assignmentroutetracks.fullstackcontent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.assignmentroutetracks.R
import com.route.assignmentroutetracks.databinding.ActivityFullStackBinding
import com.route.assignmentroutetracks.databinding.ActivityIosBinding

class FullStackActivity : AppCompatActivity() {
    lateinit var binding: ActivityFullStackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFullStackBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.contentFullstack.text = "•HTML\t\n" +
                "•HTML 5 \n" +
                "•CSS\n" +
                "•CSS3\n" +
                "•SASS\n" +
                "•Bootstrap 4\n" +
                "•JavaScript\n" +
                "•Regular expressions\n" +
                "•ECMAScript 6\n" +
                "•JQuery\n" +
                "•angular 7\n" +
                "•fabric.js\n" +
                "•AJAX\n" +
                "•JSON\n" +
                "•Hosting and domains\n" +
                "•Freelancing tips and tricks\n" +
                "•PHP\n" +
                "•MYSQL\n" +
                "•MYSQL advanced queries and triggers\n" +
                "•OOP \n" +
                "•Design Patterns\n" +
                "•MVC\n" +
                "•laravel \n" +
                "•build Api , Api authentication\n" +
                "•connect wordpress with laravel\n" +
                "•build wordpress web service \n" +
                "•agile\n" +
                "•Scrum\n" +
                "•Software development process"
    }
}