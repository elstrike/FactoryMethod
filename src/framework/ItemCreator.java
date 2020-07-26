package framework;

public abstract class ItemCreator {
    public Item create() { // void -> Item을 가져와야 하니깐 return하는 방식으로
        Item item;

        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    abstract protected void requestItemsInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();
}
