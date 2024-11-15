package com.bugrahanozdemir.hw1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bugrahanozdemir.hw1.CommonSys.selectedItems
import com.bugrahanozdemir.hw1.databinding.ActivityCreateListBinding
import com.bugrahanozdemir.hw1.DisplayList


class CreateList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityCreateListBinding
        super.onCreate(savedInstanceState)
        binding = ActivityCreateListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFinish.setOnClickListener {
            val selectedType = when {
                binding.radioButtonAcili.isChecked -> "Salgam (acili)\n"
                binding.radioButtonAcisiz.isChecked -> "Salgam (acisiz\n)"
                else -> ""
            }
           /* var selectedItems = when {
                binding.checkBoxWater.isChecked -> "Water\n"
                binding.checkBoxCoke.isChecked -> "Coke\n"
                binding.checkBoxSalt.isChecked -> "Salt\n"
                binding.checkBoxBread.isChecked -> "Bread\n"
                binding.checkBoxTomatoes.isChecked -> "Tomatoes\n"
                binding.checkBoxPotatoes.isChecked -> "Potatoes\n"
                binding.checkBoxRice.isChecked -> "Rice\n"
                binding.radioButtonAcili.isChecked -> "Salgam (acili)\n"
                binding.radioButtonAcisiz.isChecked -> "Salgam (acisiz\n)"
                else -> "\n"
            */
            val selectedItems = selectedItems
            //selectedItems.add("Shop these items in the grocery store:")
            if (binding.switchBags.isChecked)
                selectedItems.add("Get extra grocery bags")
            if (binding.checkBoxWater.isChecked)
                selectedItems.add("Water")
            if (binding.checkBoxCoke.isChecked)
                selectedItems.add("Coke")
            if (binding.checkBoxSalt.isChecked)
                selectedItems.add("Salt")
            if (binding.checkBoxBread.isChecked)
                selectedItems.add("Bread")
            if (binding.checkBoxTomatoes.isChecked)
                selectedItems.add("Tomatoes")
            if (binding.checkBoxPotatoes.isChecked)
                selectedItems.add("Potatoes")
            if (binding.checkBoxRice.isChecked)
                selectedItems.add("Rice")
            when {
                binding.radioButtonAcili.isChecked -> selectedItems.add("Salgam (acili)")
                binding.radioButtonAcisiz.isChecked -> selectedItems.add("Salgam (acisiz)")
            }
            var seekbarValue = binding.seekBar.progress
            when (seekbarValue != 0) {
                true -> selectedItems.add(seekbarValue.toString())
                false -> TODO()
            }

            Toast.makeText(this, "items added to list", Toast.LENGTH_SHORT).show()
            finish()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("type", selectedType)
            startActivity(intent)
        }

    }
}