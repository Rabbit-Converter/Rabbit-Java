package org.rabbitconverter.rabbit;/*
 * Copyright (c) 2015 org.rabbitconverter.rabbit.Rabbit Converter
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by @saturngod on 23/1/15.
 *
 * Ported as a JAVA/Gradle library by @yelinaung on 10/07/15.
 */
public final class Rabbit {

  /**
   * Convert Unicode texts to Zawgyi texts
   *
   * @param input Unicode input strings
   * @return Converted Zawgyi strings
   */
  public static String uni2zg(String input) {

    String rule =
        "[{from:\"င\u103A္\",to:\"\u1064\"},{from:\"္တ\u103D\",to:\"\u1096\"},{from:\"န(?=[ူ\u103D\u103Eု္])\",to:\"\u108F\"},{from:\"\u102B\u103A\",to:\"\u105A\"},{from:\"ဋ္ဌ\",to:\"\u1092\"},{from:\"ိံ\",to:\"\u108E\"},{from:\"၎င\u103Aး\",to:\"၎\"},{from:\"[ဥဉ](?=[္ုူ])\",to:\"\u106A\"},{from:\"[ဥဉ](?=[\u103A])\",to:\"ဥ\"},{from:\"ည(?=[္ုူ\u103D])\",to:\"\u106B\"},{from:\"(္[က-အ])ု\",to:\"$1\u1033\"},{from:\"(္[က-အ])ူ\",to:\"$1\u1034\"},{from:\"္က\",to:\"\u1060\"},{from:\"္ခ\",to:\"\u1061\"},{from:\"္ဂ\",to:\"\u1062\"},{from:\"္ဃ\",to:\"\u1063\"},{from:\"္စ\",to:\"\u1065\"},{from:\"္ဇ\",to:\"\u1068\"},{from:\"္ဈ\",to:\"\u1069\"},{from:\"ည(?=[္ုူ])\",to:\"\u106B\"},{from:\"္ဋ\",to:\"\u106C\"},{from:\"္ဌ\",to:\"\u106D\"},{from:\"ဍ္ဍ\",to:\"\u106E\"},{from:\"ဎ္ဍ\",to:\"\u106F\"},{from:\"္ဏ\",to:\"\u1070\"},{from:\"္တ\",to:\"\u1071\"},{from:\"္ထ\",to:\"\u1073\"},{from:\"္ဒ\",to:\"\u1075\"},{from:\"္ဓ\",to:\"\u1076\"},{from:\"္ဓ\",to:\"\u1076\"},{from:\"္န\",to:\"\u1077\"},{from:\"္ပ\",to:\"\u1078\"},{from:\"္ဖ\",to:\"\u1079\"},{from:\"္ဗ\",to:\"\u107A\"},{from:\"္ဘ\",to:\"\u107B\"},{from:\"္မ\",to:\"\u107C\"},{from:\"္လ\",to:\"\u1085\"},{from:\"\u103F\",to:\"\u1086\"},{from:\"(\u103C)\u103E\",to:\"$1\u1087\"},{from:\"\u103D\u103E\",to:\"\u108A\"},{from:\"(\u1064)([ေ]?)([\u103C]?)([က-အ])ိ\",to:\"$2$3$4\u108B\"},{from:\"(\u1064)([ေ]?)([\u103C]?)([က-အ])ီ\",to:\"$2$3$4\u108C\"},{from:\"(\u1064)([ေ]?)([\u103C]?)([က-အ])ံ\",to:\"$2$3$4\u108D\"},{from:\"(\u1064)([ေ]?)([\u103C]?)([က-အ])\",to:\"$2$3$4$1\"},{from:\"ရ(?=[ုူ\u103D\u108A])\",to:\"\u1090\"},{from:\"ဏ္ဍ\",to:\"\u1091\"},{from:\"ဋ္ဋ\",to:\"\u1097\"},{from:\"([က-အ\u108Fဩ\u1090])([\u1060-\u1069\u106C\u106D\u1070-\u107C\u1085\u108A])?([\u103B-\u103E]*)?ေ\",to:\"ေ$1$2$3\"},{from:\"([က-အဩ])([\u1060-\u1069\u106C\u106D\u1070-\u107C\u1085])?(\u103C)\",to:\"$3$1$2\"},{from:\"\u103A\",to:\"္\"},{from:\"\u103B\",to:\"\u103A\"},{from:\"\u103C\",to:\"\u103B\"},{from:\"\u103D\",to:\"\u103C\"},{from:\"\u103E\",to:\"\u103D\"},{from:\"\u103Dု\",to:\"\u1088\"},{from:\"([ုူနရ\u103C\u108A\u103D\u1088])([ဲံ]{0,1})့\",to:\"$1$2\u1095\"},{from:\"ု\u1095\",to:\"ု\u1094\"},{from:\"([နရ])([ဲံိီ\u108B\u108C\u108D\u108E])့\",to:\"$1$2\u1095\"},{from:\"\u1095္\",to:\"\u1094္\"},{from:\"([\u103A\u103B])([က-အ])([ံိီ\u108B\u108C\u108D\u108E]?)ု\",to:\"$1$2$3\u1033\"},{from:\"([\u103A\u103B])([က-အ])([ံိီ\u108B\u108C\u108D\u108E]?)ူ\",to:\"$1$2$3\u1034\"},{from:\"\u103Aု\",to:\"\u103A\u1033\"},{from:\"\u103A([ံိီ\u108B\u108C\u108D\u108E])ု\",to:\"\u103A$1\u1033\"},{from:\"([\u103A\u103B])([က-အ])ူ\",to:\"$1$2\u1034\"},{from:\"\u103Aူ\",to:\"\u103A\u1034\"},{from:\"\u103A([ံိီ\u108B\u108C\u108D\u108E])ူ\",to:\"\u103A$1\u1034\"},{from:\"\u103Dူ\",to:\"\u1089\"},{from:\"\u103B([ကဃဆဏတထဘယလယသဟ])\",to:\"\u107E$1\"},{from:\"\u107E([ကဃဆဏတထဘယလယသဟ])([\u103C\u108A])([ဲံိီ\u108B\u108C\u108D\u108E])\",to:\"\u1084$1$2$3\"},{from:\"\u107E([ကဃဆဏတထဘယလယသဟ])([\u103C\u108A])\",to:\"\u1082$1$2\"},{from:\"\u107E([ကဃဆဏတထဘယလယသဟ])([\u1033\u1034]?)([ဲံိီ\u108B\u108C\u108D\u108E])\",to:\"\u1080$1$2$3\"},{from:\"\u103B([က-အ])([\u103C\u108A])([ဲံိီ\u108B\u108C\u108D\u108E])\",to:\"\u1083$1$2$3\"},{from:\"\u103B([က-အ])([\u103C\u108A])\",to:\"\u1081$1$2\"},{from:\"\u103B([က-အ])([\u1033\u1034]?)([ဲံိီ\u108B\u108C\u108D\u108E])\",to:\"\u107F$1$2$3\"},{from:\"\u103A\u103D\",to:\"\u103D\u103A\"},{from:\"\u103A([\u103C\u108A])\",to:\"$1\u107D\"},{from:\"([\u1033\u1034])\u1094\",to:\"$1\u1095\"}]";

    return replaceWithRule(rule, input);
  }

  /**
   * Convert Zawgyi texts to Unicode texts
   *
   * @param input Zawgyi input strings
   * @return Converted Unicode strings
   */
  public static String zg2uni(String input) {

    String rule =
        "[{from:\"(\u103D|\u1087)\",to:\"\u103E\"},{from:\"\u103C\",to:\"\u103D\"},{from:\"(\u103B|\u107E|\u107F|\u1080|\u1081|\u1082|\u1083|\u1084)\",to:\"\u103C\"},{from:\"(\u103A|\u107D)\",to:\"\u103B\"},{from:\"္\",to:\"\u103A\"},{from:\"\u106A\",to:\"ဉ\"},{from:\"\u106B\",to:\"ည\"},{from:\"\u106C\",to:\"္ဋ\"},{from:\"\u106D\",to:\"္ဌ\"},{from:\"\u106E\",to:\"ဍ္ဍ\"},{from:\"\u106F\",to:\"ဍ္ဎ\"},{from:\"\u1070\",to:\"္ဏ\"},{from:\"(\u1071|\u1072)\",to:\"္တ\"},{from:\"\u1060\",to:\"္က\"},{from:\"\u1061\",to:\"္ခ\"},{from:\"\u1062\",to:\"္ဂ\"},{from:\"\u1063\",to:\"္ဃ\"},{from:\"\u1065\",to:\"္စ\"},{from:\"\u1068\",to:\"္ဇ\"},{from:\"\u1069\",to:\"္ဈ\"},{from:\"/(\u1073|\u1074)/g\",to:\"္ထ\"},{from:\"\u1075\",to:\"္ဒ\"},{from:\"\u1076\",to:\"္ဓ\"},{from:\"\u1077\",to:\"္န\"},{from:\"\u1078\",to:\"္ပ\"},{from:\"\u1079\",to:\"္ဖ\"},{from:\"\u107A\",to:\"္ဗ\"},{from:\"\u107C\",to:\"္မ\"},{from:\"\u1085\",to:\"္လ\"},{from:\"\u1033\",to:\"ု\"},{from:\"\u1034\",to:\"ူ\"},{from:\"\u103F\",to:\"ူ\"},{from:\"\u1086\",to:\"\u103F\"},{from:\"ံ\u1088\",to:\"\u1088ံ\"},{from:\"\u1088\",to:\"\u103Eု\"},{from:\"\u1089\",to:\"\u103Eူ\"},{from:\"\u108A\",to:\"\u103D\u103E\"},{from:\"([က-အ])\u1064\",to:\"င\u103A္$1\"},{from:\"([က-အ])\u108B\",to:\"င\u103A္$1ိ\"},{from:\"([က-အ])\u108C\",to:\"င\u103A္$1ီ\"},{from:\"([က-အ])\u108D\",to:\"င\u103A္$1ံ\"},{from:\"\u108E\",to:\"ိံ\"},{from:\"\u108F\",to:\"န\"},{from:\"\u1090\",to:\"ရ\"},{from:\"\u1091\",to:\"ဏ္\u1091\"},{from:\"မာ(\u107B|\u1093)\",to:\"မ္ဘာ\"},{from:\"(\u107B|\u1093)\",to:\"္ဘ\"},{from:\"(\u1094|\u1095)\",to:\"့\"},{from:\"\u1096\",to:\"္တ\u103D\"},{from:\"\u1097\",to:\"ဋ္ဋ\"},{from:\"\u103C([က-အ])([က-အ])?\",to:\"$1\u103C$2\"},{from:\"([က-အ])\u103C\u103A\",to:\"\u103C$1\u103A\"},{from:\"ေ([က-အ])(\u103E)?(\u103B)?\",to:\"$1$2$3ေ\"},{from:\"([က-အ])ေ([\u103B\u103C\u103D\u103E]+)\",to:\"$1$2ေ\"},{from:\"ဲ\u103D\",to:\"\u103Dဲ\"},{from:\"\u103D\u103B\",to:\"\u103B\u103D\"},{from:\"\u103A့\",to:\"့\u103A\"},{from:\"ု(ိ|ီ|ံ|့)ု\",to:\"ု$1\"},{from:\"ုု\",to:\"ု\"},{from:\"(ု|ူ)(ိ|ီ)\",to:\"$2$1\"},{from:\"(\u103E)(\u103B|့)\",to:\"$2$1\"},{from:\"ဥ(\u103A|ာ)\",to:\"ဉ$1\"},{from:\"ဦ\",to:\"ဦ\"},{from:\"စ\u103B\",to:\"ဈ\"},{from:\"ံ(ု|ူ)\",to:\"$1ံ\"},{from:\"ေ့\u103E\",to:\"\u103Eေ့\"},{from:\"ေ\u103Eာ\",to:\"\u103Eော\"},{from:\"\u105A\",to:\"\u102B\u103A\"},{from:\"ေ\u103B\u103E\",to:\"\u103B\u103Eေ\"},{from:\"(ိ|ီ)(\u103D|\u103E)\",to:\"$2$1\"},{from:\"ာ္([က-အ])\",to:\"္$1ာ\"},{from:\"\u103Cင\u103A္([က-အ])\",to:\"င\u103A္$1\u103C\"},{from:\"္\u103C\u103A္([က-အ])\",to:\"\u103A္$1\u103C\"},{from:\"\u103C္([က-အ])\",to:\"္$1\u103C\"},{from:\"ံ္([က-အ])\",to:\"္$1ံ\"},{from:\"\u1092\",to:\"ဋ္ဌ\"},{from:\"၎\",to:\"၎င\u103Aး\"},{from:\"၀(\u102B|ာ|ံ)\",to:\"ဝ$1\"},{from:\"ဥ္\",to:\"ဉ္\"},{from:\"([က-အ])\u103Cေ\u103D\",to:\"$1\u103C\u103Dေ\"},{from:\"([က-အ])\u103Dေ\u103B\",to:\"$1\u103B\u103Dေ\"},{from:\"([က-အ])ေ(္[က-အ])\",to:\"$1$2ေ\"}]";

    return replaceWithRule(rule, input);
  }

  private static String replaceWithRule(String rule, String output) {

    try {
      JSONArray rule_array = new JSONArray(rule);
      int max_loop = rule_array.length();

      //because of JDK 7 bugs in Android
      output = output.replace("null", "\uFFFF\uFFFF");

      for (int i = 0; i < max_loop; i++) {

        JSONObject obj = rule_array.getJSONObject(i);
        String from = obj.getString("from");
        String to = obj.getString("to");

        output = output.replaceAll(from, to);
        output = output.replace("null", "");
      }
    } catch (JSONException e) {
      e.printStackTrace();
    }

    output = output.replace("\uFFFF\uFFFF", "null");
    return output;
  }
}
