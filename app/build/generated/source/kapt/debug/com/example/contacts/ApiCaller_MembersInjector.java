// Generated by Dagger (https://google.github.io/dagger).
package com.example.contacts;

import com.example.contacts.network.Client;
import com.example.contacts.network.SMS;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ApiCaller_MembersInjector implements MembersInjector<ApiCaller> {
  private final Provider<Client> clientProvider;

  private final Provider<SMS> smsProvider;

  public ApiCaller_MembersInjector(Provider<Client> clientProvider, Provider<SMS> smsProvider) {
    this.clientProvider = clientProvider;
    this.smsProvider = smsProvider;
  }

  public static MembersInjector<ApiCaller> create(
      Provider<Client> clientProvider, Provider<SMS> smsProvider) {
    return new ApiCaller_MembersInjector(clientProvider, smsProvider);
  }

  @Override
  public void injectMembers(ApiCaller instance) {
    injectClient(instance, clientProvider.get());
    injectSms(instance, smsProvider.get());
  }

  public static void injectClient(ApiCaller instance, Client client) {
    instance.client = client;
  }

  public static void injectSms(ApiCaller instance, SMS sms) {
    instance.sms = sms;
  }
}
