@switch
  Feature: APIDEMOS
    Scenario: Switch element
      Given App telefonda acilsin
      When kullanici API demos tiklasin
      When kullanici Preference tiklasin
      When kullanici Switch tiklasin
      And ilk switch butonu acik olmali
      Then ilk switch butonunun acik oldugunu onayla

      Scenario: switch elementler
        And ilk switch butonu kapali olmali
        #Then ilk switch butonunun kapali oldugunu onayla
        And ikinci switch butonu acik olmali
        Then screenshot al

