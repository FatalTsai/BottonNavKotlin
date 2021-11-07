package com.example.bottonnavkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottonnavkotlin.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
        navView.selectedItemId = R.id.navigation_home
         val mOnNavigationItemSelectedListener = navView.setOnItemSelectedListener  { menuItem ->
//             Log.i("tag","fuck")
             when (menuItem.itemId) {
                R.id.navigation_home -> {
                     Log.i("tag","navigation_home")

//                    val fragment = BlogFragment()
//                    supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
//                        .commit()
                    true

                }
                R.id.navigation_dashboard -> {
                    Log.i("tag","navigation_dashboard")
                    var it = Intent(this,Dashborad::class.java)
                    startActivity(it);
                    overridePendingTransition(0,0);
//                    val fragment = ChapterFragment()
//                    supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
//                        .commit()
                    true
                }
                R.id.navigation_notifications -> {
                    Log.i("tag","navigation_notifications")

//                    val fragment = StoreFragment()
//                    supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
//                        .commit()
                    true
                }
            }
            false
        }

        /*


        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener(){

            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Log.i("Tag", "click item"+item );
                switch (item.getItemId()){
                    case  R.id.dashborad:
                        startActivity(new Intent(getApplicationContext(),Dashborad.class));
                        overridePendingTransition(0,0);
                        return;

                    case  R.id.home:

                        return;

                    case  R.id.about:
                        startActivity(new Intent(getApplicationContext(),About.class));
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
        */



    }
}