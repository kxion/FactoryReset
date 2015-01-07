# FactoryReset
remove the key of android(/data/system/*.key)

用于当用户忘记锁屏密码（图案、pin等等），而无法解锁的时候。
在tf卡根目录新建文件夹factoryReset，然后插入手机，即可清除/data/system/*.key。
目前适用于全志设备。其他平台请自行调整相应目录获取系统环境变量，或者Environment.getExternalStorageDirectory()什么的。

请放在android源码目录中编译。
$ mm
如需要集成到系统里面，可以在/android/build/target/product/*.mk  某mk文件中加入 FactoryReset。
