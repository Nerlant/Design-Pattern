import java.util.ArrayList;
import java.util.List;

public class CompositePart extends Component
{
    List<Component> components;

    CompositePart(Component component)
    {
        components = new ArrayList<>();
        weight = 0;
        addComponent(component);
    }

    public void addComponent(Component component)
    {
        components.add(component);
        weight += component.getWeight();
    }
}
