package com.team4element.library;

public class DeadZoneFilter {

	// Eliminates tiny drift from controllers via adding deadzones
	public static double inputFilter(double n, double t) {
		return Math.abs(n) > t ? n : 0;
	}
	
}
