package ed.u2.model;

public class ItemInventario implements Comparable<ItemInventario> {
    public String idProducto;
    public String insumo;
    public int stock;

    public ItemInventario(String idProducto, String insumo, String stock) {
        this.idProducto = idProducto;
        this.insumo = insumo;
        //paseamos el string stock a entero
        this.stock = Integer.parseInt(stock);
    }

    public ItemInventario(String idProducto, String insumo, int stock) {
        this.idProducto = idProducto;
        this.insumo = insumo;
        this.stock = stock;
    }
    public String getIdProducto() {
        return idProducto;
    }
    public String getInsumo() {
        return insumo;
    }
    public int getStock() {
        return stock;
    }


    @Override
    public int compareTo(ItemInventario otroItem) {
        return this.stock - otroItem.stock;
    }
    @Override
    public String toString() {
        return "ItemInventario{" +
                "id='" + idProducto + '\'' +
                ", insumo='" + insumo + '\'' +
                ", stock=" + stock +
                '}';
    }
}

