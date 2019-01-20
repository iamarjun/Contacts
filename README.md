# Contacts
A simple comtacts app with OTP sending functionality using SMS API from TextLocal(https://www.textlocal.in/).

## About Code Base
* Entire code is written in pure kotlin.
* I went with Model View Presenter(MVP) design pattern as my main aim was Seperation Of Concern, also makes the code test friendly.
* I aslo followed the One Activity rule.
* I went with bottom nav bar instead of tab layout because smartphones are getting bigger and longer(18:9 aspect ratio) and one handed usage with tablayout is like performing hand gymnastics (of course we can argue over the fact that using viewpager would not require clicking on tabs, just swiping would get the job done, but yeah).

## Open Source Libraries Used

### Networking
* [okhttp](https://github.com/square/okhttp)
* [retrofit](https://github.com/square/retrofit)

### Database Related
* [Room](https://developer.android.com/topic/libraries/architecture/room)

### Async Programming
* [RxJava](https://github.com/ReactiveX/RxJava)
* [RxAndroid](https://github.com/ReactiveX/Rxandroid)

### Dependecy Injection
* [dagger](https://github.com/google/dagger)

### Misc
* [Gson](https://github.com/google/gson)
* [TextDrawable](https://github.com/amulyakhare/TextDrawable)
