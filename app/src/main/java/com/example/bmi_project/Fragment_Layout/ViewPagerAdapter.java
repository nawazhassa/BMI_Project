package com.example.bmi_project.Fragment_Layout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new ChatsFragment();
            case 1: return new CallsFragment();
            case 2: return new logsFragment();
            default: return new ChatsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
