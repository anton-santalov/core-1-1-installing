public class Main {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();

        FilesManagement.createDirectory("Games", log);

        FilesManagement.createDirectory("Games/src", log);
        FilesManagement.createDirectory("Games/res", log);
        FilesManagement.createDirectory("Games/savegames", log);
        FilesManagement.createDirectory("Games/temp", log);

        FilesManagement.createDirectory("Games/src/main", log);
        FilesManagement.createDirectory("Games/src/test", log);

        FilesManagement.createFile("Games/src/main/Main.java", log);
        FilesManagement.createFile("Games/src/main/Utils.java", log);

        FilesManagement.createDirectory("Games/res/drawables", log);
        FilesManagement.createDirectory("Games/res/vectors", log);
        FilesManagement.createDirectory("Games/res/icons", log);

        FilesManagement.createFile("Games/temp/temp.txt", log);

        FilesManagement.writeLogToFile("Games/temp/temp.txt", log);
    }
}
