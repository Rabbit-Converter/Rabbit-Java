# Rabbit-Java

[![Build Status](https://travis-ci.org/Rabbit-Converter/Rabbit-Java.svg?branch=master)](https://travis-ci.org/Rabbit-Converter/Rabbit-Java)

Rabbit inJava

## Download

Download the [jar](https://dl.bintray.com/yelinaung/maven/org/rabbit-converter/Rabbit/0.0.1/) or via Gradle


```groovy

// You can put it in your top-level build.gradle
// Or you might already be using jcenter
buildscript {
  repositories {
    jcenter()
  }
}

compile('org.rabbit-converter:Rabbit:0.0.1') {
  exclude group: 'org.json', module: 'json'
}
```

## Usage

```java
Rabbit.zg2uni("သီဟိုဠ္မွ ဉာဏ္ႀကီးရွင္သည္ အာယုဝဍ္ဎနေဆးၫႊန္းစာကို ဇလြန္ေဈးေဘးဗာဒံပင္ထက္ အဓိ႒ာန္လ်က္ ဂဃနဏဖတ္ခဲ့သည္။");  // return strings in uni
Rabbit.uni2zg("သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်သည် အာယုဝဍ်ဎနဆေးညွှန်းစာကို ဇလွန်ဈေးဘေးဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက် ဂဃနဏဖတ်ခဲ့သည်။");     // return strings in zg 
```


## TODO

- Sync to MavenCentral

## Contributing

1. Fork it ( https://github.com/Rabbit-Converter/Rabbit-Java )
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new Pull Request


## License
MIT
