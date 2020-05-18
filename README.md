# Rabbit-Java

[![Build Status](https://travis-ci.org/Rabbit-Converter/Rabbit-Java.svg?branch=master)](https://travis-ci.org/Rabbit-Converter/Rabbit-Java) [ ![Download](https://api.bintray.com/packages/yelinaung/maven/rabbit/images/download.svg) ](https://bintray.com/yelinaung/maven/rabbit/_latestVersion)

Rabbit inJava

## Download

Download the [jar](http://jcenter.bintray.com/org/rabbit-converter/rabbit/rabbit/0.0.3/) or via Gradle

```groovy

// You can put it in your top-level build.gradle
// Or you might already be using jcenter
buildscript {
  repositories {
    jcenter()
  }
}

implementation('org.rabbit-converter.rabbit:rabbit:0.0.3') {
  exclude group: 'org.json', module: 'json'
}
```

or Maven

```xml
<dependency>
    <groupId>org.rabbit-converter.rabbit</groupId>
    <artifactId>rabbit</artifactId>
    <version>0.0.3</version>
</dependency>
```

## Usage

[Javadoc](http://www.rabbit-converter.org/Rabbit-Java)

```java
Rabbit.zg2uni("သီဟိုဠ္မွ ဉာဏ္ႀကီးရွင္သည္ အာယုဝဍ္ဎနေဆးၫႊန္းစာကို ဇလြန္ေဈးေဘးဗာဒံပင္ထက္ အဓိ႒ာန္လ်က္ ဂဃနဏဖတ္ခဲ့သည္။");  // return strings in uni
Rabbit.uni2zg("သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်သည် အာယုဝဍ်ဎနဆေးညွှန်းစာကို ဇလွန်ဈေးဘေးဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက် ဂဃနဏဖတ်ခဲ့သည်။");     // return strings in zg 
```

## Contributing

1. Fork it ( https://github.com/Rabbit-Converter/Rabbit-Java )
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new Pull Request


## License
MIT
