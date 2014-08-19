package com.example.singleactivityapp;

import com.example.singleactivityapp.InterFragmentCommunication.GreetingsFragment.GreetingsFragmentCommunicator;
import com.example.singleactivityapp.Utils.FacebookInterface;
import com.example.singleactivityapp.base.DrawerActivityInterface;
import com.example.singleactivityapp.base.HostActivityInterface;
import com.example.singleactivityapp.persistentUI_Fragment.ListFragment.ListFragmentCommunicator;

public interface HomeInterface
extends HostActivityInterface,
		DrawerActivityInterface,
		FacebookInterface,
		GreetingsFragmentCommunicator,
		ListFragmentCommunicator
{}