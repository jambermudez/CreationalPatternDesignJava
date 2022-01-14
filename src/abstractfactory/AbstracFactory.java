package abstractfactory;

public interface AbstracFactory<T> {

	T create(String type);
}
