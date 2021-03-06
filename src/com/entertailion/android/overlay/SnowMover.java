/*
 * Copyright (C) 2009 The Android Open Source Project
 * Copyright (C) 2012 ENTERTAILION LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.entertailion.android.overlay;

import android.content.Context;
import android.graphics.Bitmap;

/**
 * A simple runnable that updates the position of each sprite on the screen
 * every frame by applying a very simple gravity simulation.
 */
public class SnowMover extends FallingMover {
	private static final String LOG_CAT = "SnowMover";

	public SnowMover(Context context, int width, int height, int count,
			boolean config) {
		super(context, width, height, count, config);
	}

	@Override
	public Bitmap[] getBitmaps() {
		Bitmap[] bitmaps = new Bitmap[10];
		bitmaps[0] = loadBitmap(R.drawable.snow1);
		bitmaps[1] = loadBitmap(R.drawable.snow2);
		bitmaps[2] = loadBitmap(R.drawable.snow3);
		bitmaps[3] = loadBitmap(R.drawable.snow4);
		bitmaps[4] = loadBitmap(R.drawable.snow5);
		bitmaps[5] = loadBitmap(R.drawable.snow6);
		bitmaps[6] = loadBitmap(R.drawable.snow7);
		bitmaps[7] = loadBitmap(R.drawable.snow8);
		bitmaps[8] = loadBitmap(R.drawable.snow9);
		bitmaps[9] = loadBitmap(R.drawable.snow10);
		return bitmaps;
	}

}
