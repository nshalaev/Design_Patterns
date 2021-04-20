package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UIPanel extends BaseUIItem {

    private final List<UIItem> uiItems;

    public UIPanel() {
        this.uiItems = new ArrayList<>();
    }

    public void add(UIItem uiItem) {
        if (isNotPanel(uiItem)) {
            this.uiItems.add(uiItem);
        }
    }

    @Override
    public void draw() {
        super.draw();
        this.uiItems.forEach(UIItem::draw);
    }

    public List<UIItem> getUiItems() {
        return uiItems;
    }

    private boolean isNotPanel(UIItem uiItem) {
        return !(uiItem instanceof UIPanel);
    }
}
