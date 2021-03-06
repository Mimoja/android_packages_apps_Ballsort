/*
 * Copyright (C) 2016 RTAndroid Project
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

package rtandroid.ballsort.blocks.color;

import android.graphics.Color;

public enum ColorType
{
    BLACK(Color.BLACK),
    BLUE(Color.BLUE),
    GREEN(Color.GREEN),
    RED(Color.RED),
    YELLOW(Color.YELLOW),
    WHITE(Color.WHITE),
    EMPTY(Color.GRAY);

    private int mPaintColor = Color.GRAY;
    ColorType(int paint) { mPaintColor = paint; }

    public int getPaintColor() { return mPaintColor; }
    public int getDefaultColumn() { return ordinal(); }
}
