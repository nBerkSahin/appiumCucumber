@scroll
  Feature: Api demos
    Scenario: Scroll and click
      Given App telefonda acilsin
      When kullanici API demos tiklasin
      When kullanıcı Views e tıklasın
      Then kullanıcı switches tıklasın

    @single
    Scenario: UIscrollable ile
      Given App telefonda acilsin
      When kullanici API demos tiklasin
      When kullanıcı Views e tıklasın
      Then  kullanici UiScrolable ile Switches tiklasin

    @WebView
    Scenario: UIscrollable ile
      Given App telefonda acilsin
      When kullanici API demos tiklasin
      When kullanıcı Views e tıklasın
      Then  kullanici UiScrolable ile WebView tiklasin