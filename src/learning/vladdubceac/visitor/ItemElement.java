package learning.vladdubceac.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
