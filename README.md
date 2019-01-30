# Contacts
A simple contacts app with OTP sending functionality using SMS API from TextLocal (https://www.textlocal.in/).

## About Code Base
* Entire code is written in pure kotlin.
* I went with Model View Presenter(MVP) design pattern as my main aim was Seperation Of Concern, also makes the code test friendly.
* I aslo followed the One Activity rule.
* I went with bottom nav bar instead of tab layout because smartphones are getting bigger and longer(18:9 aspect ratio) and one handed usage with tablayout is like performing hand gymnastics (of course we can argue over the fact that using viewpager would not require clicking on tabs, just swiping would get the job done, but yeah).
* I also used mockable.io to mock an api call, used objgen to create json response, hence the app works as if its hitting a real api to get all the contacts.

## Code Hierarchy
* I have gone with package per feature, so for every featue resides in their own package along with their dependent classes.

### contacts
This package contains the main fragment which contains the contacts list that gets display when app is opened along with the respective adapter and presenter classes.

ContactsFragment: Serves the purpose of diplaying the contacts list data.
ContactsAdapter: Adapter for the contacts list recycler view.
ContactsPresenter: All the business logic goes here, data manipulation, callbacks from api calls, etc.

### messages
This package contains the second fragment which holds the messages (otp in this case) sent to the user along with the respective adapter class and presenter class.

MessagesFragment: Server the purpose of displaying the messages that are stored in the db.
MessagesAdapter: Adpater for the list of messages send.

### dagger
This package contains all the classes responsible for DI (dependency injection), also contains a sub-package called module which defines which components are to be injected. The AppComponent class is response for handling all the injection.

### model
This package as the name suggests holds all the data classes (POJOs in case of java).

### netwrok
This package contains classes related to networking namely the interface responsible for api calls (these are a part of retrofit)

### room
This package contains database related classes, this package is named so because of the usage of the Room Persistence Library from Google which acts as an abstraction layer over SQLite for DB operation.

### utils
This package contains common utility classes which are often used around the whole project.

### Classes in root directory
And finally we have some classes in the root directory namely:
ApiCaller: This hosts all the API calls in one place.
ApiWrapper: Simple interfcae for making api calls.
App: The main class which initiates everything, right from the launch of the app.
BasePresenter and BaseView: Thes interface defines the base methods that are needed for the indivisual presenter and view classes that'll eventually inherit these.
Contract: This interface holds all the presenter and view interfaces of the entire app.
MainActivity: Just used as a staritng point.
ViewPagerAdapter: This viewpager adapter defines the viewpager used in the bottom nav bar. 


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
* [Mockable.io](https://www.mockable.io/)
* [ObjGen](http://www.objgen.com/json)

### Important Note
* The Trial pack of TextLocal only supports 10 messages (i've used some, please use judicially) and sms only gets send provided the receiving number is not under DND.
* As i'm using mockable.io for mockabing the contacts api, it has a some expiration time, in that case i'm using dummy response to populate the list.

### APK 
The APK file is in the path Contacts/app/build/outputs/apk/debug/
