package enums;

public enum FurColor {
    BLACK(1, "Black"),
    WHITE(2, "White"),
    ORANGE_TABBY(3, "Orange Tabby"),
    GRAY(4, "Gray"),
    BROWN(5, "Brown"),
    CALICO(6, "Calico"),
    SPOTTED(7, "Spotted");

    private final int codigo;
    private final String displayName;

    FurColor(int codigo, String displayName){
        this.codigo = codigo;
        this.displayName = displayName;
    }

    public int getCode(){
        return this.codigo;
    }

    public String getDisplayName(){
        return this.displayName;
    }

    public static FurColor fromCode(int codigo){
        for (FurColor color : values()){
            if(color.codigo == codigo) return color;
        }

        throw new IllegalArgumentException("Nenhuma cor encontrada para esse código: " + codigo);
    }
}
