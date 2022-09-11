package School.enums;

import java.util.NoSuchElementException;

public enum CommandType {

    ADD(1,"Ekle"),
    DELETE(2,"Sil"),
    LIST(3,"Listele"),
    GUNCELLE(4,"Güncelle")
    ;

    private final Integer code;

    private final String name ;

    CommandType(Integer code, String name) {

        this.code = code;
        this.name = name;

    }

    public static CommandType findTypeByCode(Integer code){
        for (CommandType value : values()) {

            if (value.code.equals(code)){
                return value;
            }
        }
        throw new NoSuchElementException("Insan gibi code gir!");
    }
}
