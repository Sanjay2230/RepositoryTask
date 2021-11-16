# Github Trending Repositories in Android

An Android App that lists the most trending repositories in Android from Github.

<img src="https://github.com/anitaa1990/Github-Trending-Repos/blob/master/media/1.gif" width="200" style="max-width:100%;">   <img src="https://github.com/anitaa1990/Github-Trending-Repos/blob/master/media/2.gif" width="200" style="max-width:100%;"></br></br>

#### App Features
* Users can view the most trending repositories in Android from Github.
* Users can search the repository based on name.
* Users can swipe to refresh to fetch the recent repositories


#### App Architecture 
Based on mvvm architecture and repository pattern.
 
 #### The app includes the following main components:

* A local database that servers as a single source of truth for data presented to the user. 
* A web api service.
* A repository that works with the database and the api service, providing a unified data interface.
* A ViewModel that provides data specific for the UI.
* The UI, which shows a visual representation of the data in the ViewModel.


#### App Packages
* <b>model</b> - contains 
    * <b>enity</b> - contains the db classes of table columns. 
    * <b>dao</b> - contains the db classes queries to fetch and insert record.
* <b>network</b> - contains the api classes to make api calls to FreshlyPressed server, using Retrofit.
* <b>ui</b> - contains classes needed to display Activity.
* <b>util</b> - contains classes needed to check the network connectivity, ui/ux animations.


#### App Specs
* Minimum SDK 21
* [Java8](https://java.com/en/download/faq/java8.xml) (in [master](https://github.com/Sanjay2230/RepositoryTask/new/maste) branch) & [Kotlin](https://kotlinlang.org/) (in [kotlin_support](https://github.com/anitaa1990/Github-Trending-Repos/tree/kotlin_support) branch)
* MVVM Architecture
* Android Architecture Components (LiveData, Lifecycle, ViewModel, Room Persistence Library, ConstraintLayout)
* [Retrofit 2](https://square.github.io/retrofit/) for API integration.
* [Gson](https://github.com/google/gson) for serialisation.
* [Okhhtp3](https://github.com/square/okhttp) for implementing interceptor, logging and mocking web server.
