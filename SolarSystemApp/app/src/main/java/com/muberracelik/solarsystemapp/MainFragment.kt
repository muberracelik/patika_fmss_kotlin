package com.muberracelik.solarsystemapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.muberracelik.solarsystemapp.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainFragment : Fragment(R.layout.activity_main){

    private lateinit var fragmentMainBinding : FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MarsApi.retrofitService.getProperties().enqueue(object : Callback<List<SolarSystemModel>> {
            override fun onResponse(call: Call<List<SolarSystemModel>>, response: Response<List<SolarSystemModel>>) {
                response.body()?.let { Log.v("Patika", it[0].img_src)}
                if (response.isSuccessful){
                    val countryList = response.body()!!
                    Log.d("Response", "countrylist size : ${countryList.size}")
                    mars_recycler.apply {
                        setHasFixedSize(true)
                        layoutManager = GridLayoutManager(requireContext(),2)
                        adapter = SolarSystemAdapter(response.body()!!)
                    }
                }
            }

            override fun onFailure(call: Call<List<SolarSystemModel>>, t: Throwable) {
                TODO("Not yet implemented")
                Log.v("Patika", t.message.toString())
            }

        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentMainBinding = FragmentMainBinding.inflate(inflater)


        return fragmentMainBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentMainBinding.apply {

        }
    }

}