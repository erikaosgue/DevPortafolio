package com.erikaosgue.devportafolio.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.erikaosgue.devportafolio.view.AboutFragment
import com.erikaosgue.devportafolio.view.ContactFragment
import com.erikaosgue.devportafolio.view.SkillsFragment
import com.erikaosgue.devportafolio.view.WorkFragment

var arrayList: ArrayList<Fragment> = arrayListOf(AboutFragment(), WorkFragment(), SkillsFragment(), ContactFragment())
var arrayListTitle: ArrayList<String> = arrayListOf("ABOUT", "WORK", "SKILSS", "CONTACT")

class DevPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return arrayList.size

    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return arrayList[0]
            1 -> return arrayList[1]
            2 -> return arrayList[2]
            3 -> return arrayList[3]
        }
        return null!!
    }

    override fun getPageTitle(position: Int): CharSequence? {

        when(position) {

            0 -> return arrayListTitle[0]
            1 -> return arrayListTitle[1]
            2 -> return arrayListTitle[2]
            3 -> return arrayListTitle[3]
        }
        return null
    }
}