package kr.miraresoft.miraebook.enumtype;

public enum LocationType {
	IT ("it","itå"),
	FICTION ("it","itå");
	
    private String code;
    private String description;
    
    LocationType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    
}
