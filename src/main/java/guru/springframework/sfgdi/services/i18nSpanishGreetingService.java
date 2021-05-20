package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - ES";
  }
}
