package org.vaadin.appfoundation.test.view;

import org.vaadin.appfoundation.view.AbstractView;
import org.vaadin.appfoundation.view.ViewContainer;

public class MockViewContainer implements ViewContainer {

    private AbstractView<?> previouslyActivatedView = null;

    @Override
    public void activate(AbstractView<?> view) {
        setPreviouslyActivatedView(null);
    }

    public void setPreviouslyActivatedView(
            AbstractView<?> previouslyActivatedView) {
        this.previouslyActivatedView = previouslyActivatedView;
    }

    public AbstractView<?> getPreviouslyActivatedView() {
        return previouslyActivatedView;
    }

}