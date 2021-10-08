# dimens
屏幕万能适配方案
## 描述
```
把宽度平分750份，把每份当作一个像素，为了使视图不变形，高度也使用x值；另外字体大小，也请用x值
1.0 版本采用分辨率适配（单位px）
2.0 版本采用swdp适配（单位dp），使得适配更广泛，文件更少；同时增加了m负值
```
## 使用方式
```
1. add it in your root build.gradle at the end of repositories:
    allprojects {
	repositories {
	    ...
	    maven { url 'https://www.jitpack.io' }
	}
    }
2. add the dependency
    dependencies {
	implementation 'com.github.i-farmer:dimens:2.0.0'
    }
3. to use
    a.布局之中 @dimen/x30 或 @dimen/m30
    b.代码之中 R.dimen.x30 或 R.dimen.m30
    
```
## 缺点
```
不支持x750以上的值
```
