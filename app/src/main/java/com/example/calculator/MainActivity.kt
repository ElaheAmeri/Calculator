package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    var numberInput1:String=""
    var operation :String=""
    var numberInput2:String=""
    var result:Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    fun selectBtn(view:View) {
        view as Button
        binding.editTextBord.setText(addNumberToEditText(view))
    }
    fun addNumberToEditText(btn:Button):String{
        when(btn.id){
            binding.btn0.id ->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="0"
                }else {
                    numberInput1 +="0"
                }
                Toast.makeText(this,"0",Toast.LENGTH_SHORT).show()
            }
            binding.btn1.id ->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="1"
                }else {
                    numberInput1 +="1"
                }
                Toast.makeText(this,"1",Toast.LENGTH_SHORT).show()
            }
            binding.btn2.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="2"
                }else {
                    numberInput1 +="2"
                }
                Toast.makeText(this,"2",Toast.LENGTH_SHORT).show()
            }
            binding.btn3.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="3"
                }else {
                    numberInput1 +="3"
                }
                Toast.makeText(this,"3",Toast.LENGTH_SHORT).show()
            }
            binding.btn4.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="4"
                }else {
                    numberInput1 +="4"
                }
                Toast.makeText(this,"4",Toast.LENGTH_SHORT).show()
            }
            binding.btn5.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="5"
                }else {
                    numberInput1 +="5"
                }
                Toast.makeText(this,"5",Toast.LENGTH_SHORT).show()
            }
            binding.btn6.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="6"
                }else {
                    numberInput1 +="6"
                }
                Toast.makeText(this,"6",Toast.LENGTH_SHORT).show()
            }
            binding.btn7.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="7"
                }else {
                    numberInput1 +="7"
                }
                Toast.makeText(this,"7",Toast.LENGTH_SHORT).show()
            }
            binding.btn8.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="8"
                }else {
                    numberInput1 +="8"
                }
                Toast.makeText(this,"8",Toast.LENGTH_SHORT).show()
            }
            binding.btn9.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="9"
                }else {
                    numberInput1 +="9"
                }
                Toast.makeText(this,"9",Toast.LENGTH_SHORT).show()
            }
            binding.btnDesimalPoint.id->{
                if (numberInput1=="0" || numberInput1 =="" ){
                    numberInput1="0."
                }else {
                    numberInput1 +="."
                }
                Toast.makeText(this,".",Toast.LENGTH_SHORT).show()
            }
        }
        return numberInput1
    }
    fun operator (view: View):String{
        view as Button
        when(view.id){
            binding.btnDiv.id->{
                operation="/"
            }
            binding.btnSub.id->{
                operation="-"
            }
            binding.btnSum.id->{
                operation="+"
            }
            binding.btnMul.id->{
                operation="*"
            }
        }
        return operation
    }
    fun delet(view: View){
        binding.editTextBord.setText("0")
        binding.textViewResult.setText("0")
    }
    fun equal(view: View){

        when(operation){
            "/"->{
                if (numberInput2!="0.0") {
                    result = numberInput1.toDouble() / numberInput2.toDouble()
                }else{
                    binding.editTextBord.setText("infinit")
                }
            }
            "+"->{
                result =numberInput1.toDouble() + numberInput2.toDouble()
            }
            "-"->{
                result = numberInput1.toDouble() - numberInput2.toDouble()
            }
            "*"->{
                result = numberInput1.toDouble() * numberInput2.toDouble()
            }
        }
        binding.textViewResult.setText(result.toString())
    }

}