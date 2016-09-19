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

package rtandroid.ballsort.blocks.color.space;

public class ColorLAB
{
    public double L = 0;
    public double A = 0;
    public double B = 0;

    public ColorLAB(double l, double a, double b)
    {
        L = l;
        A = a;
        B = b;
    }

    @Override
    public String toString()
    {
        return "LAB { " + L + ", " + A + ", " + B + " }";
    }
}
