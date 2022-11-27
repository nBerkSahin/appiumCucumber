@ExpandableList
  Feature: API Demos
    Scenario: expandable list check
      Given App telefonda acilsin
      When kullanici "API Demos" tiklasin
      When kullanici "Views" tiklasin
      When kullanici "Expandable Lists" tiklasin
      When kullanici "1. Custom Adapter" tiklasin
      When kullanici "People Names" tiklasin
      When kullanici Arnold basili tuttugunda
      Then popup ciktigini onayla