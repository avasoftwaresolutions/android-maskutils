[![](https://jitpack.io/v/avasoftwaresolutions/android-maskutils.svg)](https://jitpack.io/#avasoftwaresolutions/android-maskutils)


# Android MaskUtils

This library is intended for EditText masking with some of the most common Brazilian mask patterns. As such, this library is targeted at Brazilian apps and it's not so useful for international use-cases.

# Installation

In your build.gradle (project), make sure you added the jitpack repository.
```
allprojects {
    repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}
```

Then add the dependency to your build.gradle (module).
```
dependencies {
    implementation 'com.github.avasoftwaresolutions:android-maskutils:1.0.0'
 }
```

# Usage

Usage of the library is mostly self explanatory.

```
MaskUtils.cpfMask(editText);                                // Mask for CPF
MaskUtils.cnpjMask(editText);                               // Mask for CNPJ
MaskUtils.cpfCnpjMask(editText);                            // Mask for fields that might receive either a CPF or a CNPJ
MaskUtils.cepMask(editText);                                // Mask for CEP
MaskUtils.phoneMask(editText);                              // Mask for phone numbers
MaskUtils.moneyMask(editText);                              // Mask for money
MaskUtils.customMask(editText, "##.##.##-####");            // Mask for setting a custom pattern, using '#' for characters
```

It's highly recommended to use the masks along with set inputType fields, to prevent unexpected characters.

# License

MIT License

Copyright (c) 2019 AVA Software Solutions

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
