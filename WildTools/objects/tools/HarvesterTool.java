package xyz.wildseries.wildtools.api.objects.tools;

public interface HarvesterTool extends Tool {

    int getRadius();

    String getActivationAction();

    void setActivationAction(String activateAction);

}
