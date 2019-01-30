// Generated by Dagger (https://google.github.io/dagger).
package com.example.contacts.dagger;

import com.example.contacts.ApiCaller;
import com.example.contacts.ApiCaller_MembersInjector;
import com.example.contacts.contacts.ContactsPresenter;
import com.example.contacts.contacts.ContactsPresenter_MembersInjector;
import com.example.contacts.dagger.module.NetworkModule;
import com.example.contacts.dagger.module.NetworkModule_ProvideApiCaller$app_debugFactory;
import com.example.contacts.dagger.module.NetworkModule_ProvideOkHttpClient$app_debugFactory;
import com.example.contacts.dagger.module.NetworkModule_ProvideRetrofit$app_debugFactory;
import com.example.contacts.dagger.module.NetworkModule_ProvideRetrofitSMS$app_debugFactory;
import com.example.contacts.network.Client;
import com.example.contacts.network.SMS;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class DaggerAppComponent implements AppComponent {
  private Provider<OkHttpClient> provideOkHttpClient$app_debugProvider;

  private Provider<Client> provideRetrofit$app_debugProvider;

  private Provider<SMS> provideRetrofitSMS$app_debugProvider;

  private Provider<ApiCaller> provideApiCaller$app_debugProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideOkHttpClient$app_debugProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideOkHttpClient$app_debugFactory.create(builder.networkModule));
    this.provideRetrofit$app_debugProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetrofit$app_debugFactory.create(
                builder.networkModule, provideOkHttpClient$app_debugProvider));
    this.provideRetrofitSMS$app_debugProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetrofitSMS$app_debugFactory.create(
                builder.networkModule, provideOkHttpClient$app_debugProvider));
    this.provideApiCaller$app_debugProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideApiCaller$app_debugFactory.create(builder.networkModule));
  }

  @Override
  public void inject(ApiCaller apiCaller) {
    injectApiCaller(apiCaller);
  }

  @Override
  public void inject(ContactsPresenter presenter) {
    injectContactsPresenter(presenter);
  }

  private ApiCaller injectApiCaller(ApiCaller instance) {
    ApiCaller_MembersInjector.injectClient(instance, provideRetrofit$app_debugProvider.get());
    ApiCaller_MembersInjector.injectSms(instance, provideRetrofitSMS$app_debugProvider.get());
    return instance;
  }

  private ContactsPresenter injectContactsPresenter(ContactsPresenter instance) {
    ContactsPresenter_MembersInjector.injectApiCaller(
        instance, provideApiCaller$app_debugProvider.get());
    return instance;
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private Builder() {}

    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
