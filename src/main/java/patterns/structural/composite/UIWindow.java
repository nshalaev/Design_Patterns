package patterns.structural.composite;

public class UIWindow extends UIPanel {

    @Override
    public void add(UIItem uiItem) {
        if (isNotWindow(uiItem)) {
            getUiItems().add(uiItem);
        }
    }

    private boolean isNotWindow(UIItem uiItem) {
        return !(uiItem instanceof UIWindow);
    }
}
