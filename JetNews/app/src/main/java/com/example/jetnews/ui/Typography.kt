/*
 * Copyright 2019 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jetnews.ui

import androidx.ui.core.sp
import androidx.ui.material.MaterialTypography
import androidx.ui.text.TextStyle
import androidx.ui.text.font.Font
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontWeight

val regular = Font("montserrat_regular.ttf")
val medium = Font("montserrat_medium.ttf", FontWeight.w500)
val semibold = Font("montserrat_semibold.ttf", FontWeight.w600)

val appFontFamily = FontFamily(fonts = listOf(regular, medium, semibold))

val bodyFontFamily = FontFamily(fonts = listOf(
    Font("domine_regular.ttf"),
    Font("domine_bold", FontWeight.bold)
))

val typography = MaterialTypography(
    h6 = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.w600,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.w600,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.w500,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = bodyFontFamily,
        fontWeight = FontWeight.normal,
        fontSize = 16.sp

    ),
    body2 = TextStyle(
        fontFamily = appFontFamily,
        fontSize = 14.sp
    ),
    overline = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.w500,
        fontSize = 12.sp
    )
)
