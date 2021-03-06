/*
 * Copyright 2018 Massimo Neri <hello@mneri.me>
 *
 * This file is part of mariadb-proto.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.mneri.mariadb.proto;

public final class CharacterSet {
    //@formatter:off
    public static final int BIG5_CHINESE_CI          = 1;
    public static final int LATIN2_CZECH_CS          = 2;
    public static final int DEC8_SWEDISH_CI          = 3;
    public static final int CP850_GENERAL_CI         = 4;
    public static final int LATIN1_GERMAN1_CI        = 5;
    public static final int HP8_ENGLISH_CI           = 6;
    public static final int KOI8R_GENERAL_CI         = 7;
    public static final int LATIN1_SWEDISH_CI        = 8;
    public static final int LATIN2_GENERAL_CI        = 9;
    public static final int SWE7_SWEDISH_CI          = 10;
    public static final int ASCII_GENERAL_CI         = 11;
    public static final int UJIS_JAPANESE_CI         = 12;
    public static final int SJIS_JAPANESE_CI         = 13;
    public static final int CP1251_BULGARIAN_CI      = 14;
    public static final int LATIN1_DANISH_CI         = 15;
    public static final int HEBREW_GENERAL_CI        = 16;
    public static final int TIS620_THAI_CI           = 18;
    public static final int EUCKR_KOREAN_CI          = 19;
    public static final int LATIN7_ESTONIAN_CS       = 20;
    public static final int LATIN2_HUNGARIAN_CI      = 21;
    public static final int KOI8U_GENERAL_CI         = 22;
    public static final int CP1251_UKRAINIAN_CI      = 23;
    public static final int GB2312_CHINESE_CI        = 24;
    public static final int GREEK_GENERAL_CI         = 25;
    public static final int CP1250_GENERAL_CI        = 26;
    public static final int LATIN2_CROATIAN_CI       = 27;
    public static final int GBK_CHINESE_CI           = 28;
    public static final int CP1257_LITHUANIAN_CI     = 29;
    public static final int LATIN5_TURKISH_CI        = 30;
    public static final int LATIN1_GERMAN2_CI        = 31;
    public static final int ARMSCII8_GENERAL_CI      = 32;
    public static final int UTF8_GENERAL_CI          = 33;
    public static final int CP1250_CZECH_CS          = 34;
    public static final int UCS2_GENERAL_CI          = 35;
    public static final int CP866_GENERAL_CI         = 36;
    public static final int KEYBCS2_GENERAL_CI       = 37;
    public static final int MACCE_GENERAL_CI         = 38;
    public static final int MACROMAN_GENERAL_CI      = 39;
    public static final int CP852_GENERAL_CI         = 40;
    public static final int LATIN7_GENERAL_CI        = 41;
    public static final int LATIN7_GENERAL_CS        = 42;
    public static final int MACCE_BIN                = 43;
    public static final int CP1250_CROATIAN_CI       = 44;
    public static final int UTF8MB4_GENERAL_CI       = 45;
    public static final int UTF8MB4_BIN              = 46;
    public static final int LATIN1_BIN               = 47;
    public static final int LATIN1_GENERAL_CI        = 48;
    public static final int LATIN1_GENERAL_CS        = 49;
    public static final int CP1251_BIN               = 50;
    public static final int CP1251_GENERAL_CI        = 51;
    public static final int CP1251_GENERAL_CS        = 52;
    public static final int MACROMAN_BIN             = 53;
    public static final int UTF16_GENERAL_CI         = 54;
    public static final int UTF16_BIN                = 55;
    public static final int UTF16LE_GENERAL_CI       = 56;
    public static final int CP1256_GENERAL_CI        = 57;
    public static final int CP1257_BIN               = 58;
    public static final int CP1257_GENERAL_CI        = 59;
    public static final int UTF32_GENERAL_CI         = 60;
    public static final int UTF32_BIN                = 61;
    public static final int UTF16LE_BIN              = 62;
    public static final int BINARY                   = 63;
    public static final int ARMSCII8_BIN             = 64;
    public static final int ASCII_BIN                = 65;
    public static final int CP1250_BIN               = 66;
    public static final int CP1256_BIN               = 67;
    public static final int CP866_BIN                = 68;
    public static final int DEC8_BIN                 = 69;
    public static final int GREEK_BIN                = 70;
    public static final int HEBREW_BIN               = 71;
    public static final int HP8_BIN                  = 72;
    public static final int KEYBCS2_BIN              = 73;
    public static final int KOI8R_BIN                = 74;
    public static final int KOI8U_BIN                = 75;
    public static final int LATIN2_BIN               = 77;
    public static final int LATIN5_BIN               = 78;
    public static final int LATIN7_BIN               = 79;
    public static final int CP850_BIN                = 80;
    public static final int CP852_BIN                = 81;
    public static final int SWE7_BIN                 = 82;
    public static final int UTF8_BIN                 = 83;
    public static final int BIG5_BIN                 = 84;
    public static final int EUCKR_BIN                = 85;
    public static final int GB2312_BIN               = 86;
    public static final int GBK_BIN                  = 87;
    public static final int SJIS_BIN                 = 88;
    public static final int TIS620_BIN               = 89;
    public static final int UCS2_BIN                 = 90;
    public static final int UJIS_BIN                 = 91;
    public static final int GEOSTD8_GENERAL_CI       = 92;
    public static final int GEOSTD8_BIN              = 93;
    public static final int LATIN1_SPANISH_CI        = 94;
    public static final int CP932_JAPANESE_CI        = 95;
    public static final int CP932_BIN                = 96;
    public static final int EUCJPMS_JAPANESE_CI      = 97;
    public static final int EUCJPMS_BIN              = 98;
    public static final int CP1250_POLISH_CI         = 99;
    public static final int UTF16_UNICODE_CI         = 101;
    public static final int UTF16_ICELANDIC_CI       = 102;
    public static final int UTF16_LATVIAN_CI         = 103;
    public static final int UTF16_ROMANIAN_CI        = 104;
    public static final int UTF16_SLOVENIAN_CI       = 105;
    public static final int UTF16_POLISH_CI          = 106;
    public static final int UTF16_ESTONIAN_CI        = 107;
    public static final int UTF16_SPANISH_CI         = 108;
    public static final int UTF16_SWEDISH_CI         = 109;
    public static final int UTF16_TURKISH_CI         = 110;
    public static final int UTF16_CZECH_CI           = 111;
    public static final int UTF16_DANISH_CI          = 112;
    public static final int UTF16_LITHUANIAN_CI      = 113;
    public static final int UTF16_SLOVAK_CI          = 114;
    public static final int UTF16_SPANISH2_CI        = 115;
    public static final int UTF16_ROMAN_CI           = 116;
    public static final int UTF16_PERSIAN_CI         = 117;
    public static final int UTF16_ESPERANTO_CI       = 118;
    public static final int UTF16_HUNGARIAN_CI       = 119;
    public static final int UTF16_SINHALA_CI         = 120;
    public static final int UTF16_GERMAN2_CI         = 121;
    public static final int UTF16_CROATIAN_CI        = 122;
    public static final int UTF16_UNICODE_520_CI     = 123;
    public static final int UTF16_VIETNAMESE_CI      = 124;
    public static final int UCS2_UNICODE_CI          = 128;
    public static final int UCS2_ICELANDIC_CI        = 129;
    public static final int UCS2_LATVIAN_CI          = 130;
    public static final int UCS2_ROMANIAN_CI         = 131;
    public static final int UCS2_SLOVENIAN_CI        = 132;
    public static final int UCS2_POLISH_CI           = 133;
    public static final int UCS2_ESTONIAN_CI         = 134;
    public static final int UCS2_SPANISH_CI          = 135;
    public static final int UCS2_SWEDISH_CI          = 136;
    public static final int UCS2_TURKISH_CI          = 137;
    public static final int UCS2_CZECH_CI            = 138;
    public static final int UCS2_DANISH_CI           = 139;
    public static final int UCS2_LITHUANIAN_CI       = 140;
    public static final int UCS2_SLOVAK_CI           = 141;
    public static final int UCS2_SPANISH2_CI         = 142;
    public static final int UCS2_ROMAN_CI            = 143;
    public static final int UCS2_PERSIAN_CI          = 144;
    public static final int UCS2_ESPERANTO_CI        = 145;
    public static final int UCS2_HUNGARIAN_CI        = 146;
    public static final int UCS2_SINHALA_CI          = 147;
    public static final int UCS2_GERMAN2_CI          = 148;
    public static final int UCS2_CROATIAN_CI         = 149;
    public static final int UCS2_UNICODE_520_CI      = 150;
    public static final int UCS2_VIETNAMESE_CI       = 151;
    public static final int UCS2_GENERAL_MYSQL500_CI = 159;
    public static final int UTF32_UNICODE_CI         = 160;
    public static final int UTF32_ICELANDIC_CI       = 161;
    public static final int UTF32_LATVIAN_CI         = 162;
    public static final int UTF32_ROMANIAN_CI        = 163;
    public static final int UTF32_SLOVENIAN_CI       = 164;
    public static final int UTF32_POLISH_CI          = 165;
    public static final int UTF32_ESTONIAN_CI        = 166;
    public static final int UTF32_SPANISH_CI         = 167;
    public static final int UTF32_SWEDISH_CI         = 168;
    public static final int UTF32_TURKISH_CI         = 169;
    public static final int UTF32_CZECH_CI           = 170;
    public static final int UTF32_DANISH_CI          = 171;
    public static final int UTF32_LITHUANIAN_CI      = 172;
    public static final int UTF32_SLOVAK_CI          = 173;
    public static final int UTF32_SPANISH2_CI        = 174;
    public static final int UTF32_ROMAN_CI           = 175;
    public static final int UTF32_PERSIAN_CI         = 176;
    public static final int UTF32_ESPERANTO_CI       = 177;
    public static final int UTF32_HUNGARIAN_CI       = 178;
    public static final int UTF32_SINHALA_CI         = 179;
    public static final int UTF32_GERMAN2_CI         = 180;
    public static final int UTF32_CROATIAN_CI        = 181;
    public static final int UTF32_UNICODE_520_CI     = 182;
    public static final int UTF32_VIETNAMESE_CI      = 183;
    public static final int UTF8_UNICODE_CI          = 192;
    public static final int UTF8_ICELANDIC_CI        = 193;
    public static final int UTF8_LATVIAN_CI          = 194;
    public static final int UTF8_ROMANIAN_CI         = 195;
    public static final int UTF8_SLOVENIAN_CI        = 196;
    public static final int UTF8_POLISH_CI           = 197;
    public static final int UTF8_ESTONIAN_CI         = 198;
    public static final int UTF8_SPANISH_CI          = 199;
    public static final int UTF8_SWEDISH_CI          = 200;
    public static final int UTF8_TURKISH_CI          = 201;
    public static final int UTF8_CZECH_CI            = 202;
    public static final int UTF8_DANISH_CI           = 203;
    public static final int UTF8_LITHUANIAN_CI       = 204;
    public static final int UTF8_SLOVAK_CI           = 205;
    public static final int UTF8_SPANISH2_CI         = 206;
    public static final int UTF8_ROMAN_CI            = 207;
    public static final int UTF8_PERSIAN_CI          = 208;
    public static final int UTF8_ESPERANTO_CI        = 209;
    public static final int UTF8_HUNGARIAN_CI        = 210;
    public static final int UTF8_SINHALA_CI          = 211;
    public static final int UTF8_GERMAN2_CI          = 212;
    public static final int UTF8_CROATIAN_CI         = 213;
    public static final int UTF8_UNICODE_520_CI      = 214;
    public static final int UTF8_VIETNAMESE_CI       = 215;
    public static final int UTF8_GENERAL_MYSQL500_CI = 223;
    public static final int UTF8MB4_UNICODE_CI       = 224;
    public static final int UTF8MB4_ICELANDIC_CI     = 225;
    public static final int UTF8MB4_LATVIAN_CI       = 226;
    public static final int UTF8MB4_ROMANIAN_CI      = 227;
    public static final int UTF8MB4_SLOVENIAN_CI     = 228;
    public static final int UTF8MB4_POLISH_CI        = 229;
    public static final int UTF8MB4_ESTONIAN_CI      = 230;
    public static final int UTF8MB4_SPANISH_CI       = 231;
    public static final int UTF8MB4_SWEDISH_CI       = 232;
    public static final int UTF8MB4_TURKISH_CI       = 233;
    public static final int UTF8MB4_CZECH_CI         = 234;
    public static final int UTF8MB4_DANISH_CI        = 235;
    public static final int UTF8MB4_LITHUANIAN_CI    = 236;
    public static final int UTF8MB4_SLOVAK_CI        = 237;
    public static final int UTF8MB4_SPANISH2_CI      = 238;
    public static final int UTF8MB4_ROMAN_CI         = 239;
    public static final int UTF8MB4_PERSIAN_CI       = 240;
    public static final int UTF8MB4_ESPERANTO_CI     = 241;
    public static final int UTF8MB4_HUNGARIAN_CI     = 242;
    public static final int UTF8MB4_SINHALA_CI       = 243;
    public static final int UTF8MB4_GERMAN2_CI       = 244;
    public static final int UTF8MB4_CROATIAN_CI      = 245;
    public static final int UTF8MB4_UNICODE_520_CI   = 246;
    public static final int UTF8MB4_VIETNAMESE_CI    = 247;
    public static final int GB18030_CHINESE_CI       = 248;
    public static final int GB18030_BIN              = 249;
    public static final int GB18030_UNICODE_520_CI   = 250;
    //@formatter:on

    private CharacterSet() {
    }
}
