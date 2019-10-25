package com.sujungp.lifecycletestapp

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

/**
 * Created by sujung26 on 2019-10-25.
 */
class HahaDialogFragment : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("sujung", "[Fragment] onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("sujung", "[Fragment] onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("sujung", "[Fragment] onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("sujung", "[Fragment] onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("sujung", "[Fragment] onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sujung", "[Fragment] onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sujung", "[Fragment] onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sujung", "[Fragment] onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("sujung", "[Fragment] onDestroyView")
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

//        return activity?.let {
//            val builder = AlertDialog.Builder(it)
//            builder.setMessage(R.string.dialog_fire_missiles)
//                .setPositiveButton(R.string.fire,
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // FIRE ZE MISSILES!
//                    })
//                .setNegativeButton(R.string.cancel,
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // User cancelled the dialog
//                    })
//            // Create the AlertDialog object and return it
//            builder.create()
//        } ?: throw IllegalStateException("Activity cannot be null")

        return activity?.let {
            AlertDialog.Builder(it).apply {
                setMessage("다이얼로그 Fragment")
                setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
            }.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}