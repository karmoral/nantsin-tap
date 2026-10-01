public class Producto {
    private String handle;
    private String title;
    private String bodyHtml;
    private String productCategory;
    private double variantPrice;
    private String imageSrc;

    // Constructores, Getters y Setters
    public Producto(String handle, String title, String bodyHtml, String productCategory, double variantPrice, String imageSrc) {
        this.handle = handle;
        this.title = title;
        this.bodyHtml = bodyHtml;
        this.productCategory = productCategory;
        this.variantPrice = variantPrice;
        this.imageSrc = imageSrc;
    }

    public String getTitle() { return title; }
    public String getBodyHtml() { return bodyHtml; }
    public String getProductCategory() { return productCategory; }
    public double getVariantPrice() { return variantPrice; }
    public String getImageSrc() { return imageSrc; }
}
