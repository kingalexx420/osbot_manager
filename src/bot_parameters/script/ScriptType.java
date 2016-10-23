package bot_parameters.script;

public enum ScriptType {
    LOCAL,
    SDN;

    @Override
    public String toString() {
        char[] name = name().toLowerCase().toCharArray();
        name[0] = Character.toUpperCase(name[0]);
        return new String(name);
    }
}
