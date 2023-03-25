package com.example.AgungSeptiana203040102.scanners

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.AgungSeptiana203040102.model.PendaftaranAwal
import com.example.AgungSeptiana203040102.persistences.PendaftaranAwalDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class  PengelolaanPendaftaranViewModel @Inject constructor(private val
pendaftaranAwalDao: PendaftaranAwalDao) : ViewModel() {
    val list : LiveData<List<PendaftaranAwal>> = pendaftaranAwalDao.loadAll()

    suspend fun insert(id: String,
                       nik: String,
                       nama: String,
                       tempatLahir: String,
                       tglLahir: String,
                       alamat: String,
                       noHp: String) {
        val item = PendaftaranAwal(id, nik, nama, tempatLahir, tglLahir, alamat, noHp)
        pendaftaranAwalDao.insertAll(item)
    }
}