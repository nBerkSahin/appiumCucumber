package pages;

import pages.android.*;
import pages.ios.AlertViewsPage;
import stepdefinitions.ExpandableList;


public class AllPages {

     //parametresiz contractor olustur
    public AllPages(){}
    //her page class return type ile private instance olusturduk;
    private APIDemosPage apiDemosPage;
    private MainPage mainPage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private PreferencePage preferencePage;
    private SwitchPage switchPage;
    private DateWidget dateWidget;
    private ExpandableListPage expandableListPage;
    private SpinnerPage spinnerPage;

    //======== burdan asagisi ios pageleri
    private AlertViewsPage alertViewsPage;
//    private IOSSwitchPage iosSwitchPage;
//    private PickerViewPage pickerViewPage;

    //her page klass icin public method olsuturp obje olustracagiz
    public APIDemosPage apiDemosPage(){
        if (apiDemosPage == null){
            apiDemosPage = new APIDemosPage();
        }
        return apiDemosPage;
    }
    public MainPage mainPage(){
        if (mainPage == null){
            mainPage =  new MainPage();
        }
        return mainPage;
    }

    public PreferencePage preferencePage(){
        if (preferencePage== null){
            preferencePage = new PreferencePage();
        }
        return preferencePage;
    }

    public PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage == null){
            preferenceDependenciesPage = new PreferenceDependenciesPage();
        }
        return preferenceDependenciesPage;
    }

    public SwitchPage switchPage() {
        if (switchPage == null){
            switchPage = new SwitchPage();
        }
        return switchPage;
    }

    public DateWidget dateWidget(){
        if (dateWidget == null){
            dateWidget = new DateWidget();
        }
        return dateWidget;

    }

    public ExpandableListPage expandableListPage(){
        if (expandableListPage == null){
            expandableListPage = new ExpandableListPage();
        }
        return expandableListPage;
    }
    public SpinnerPage spinnerPage(){
        if (spinnerPage == null){
            spinnerPage = new SpinnerPage();
        }
        return spinnerPage;
    }
    public AlertViewsPage alertViewsPage(){
        if (alertViewsPage == null){
            alertViewsPage = new AlertViewsPage();
        }
        return alertViewsPage;
    }



}
