package com.example.tapiwa.todoapp.Utils;

public class Constants {

    public static final String USERS_DB_PATH = "Users/";
    public static final String SHARED_PROJECTS_DB_PATH = "SharedProjects/";
    public static final String BACKUP_PATH = "BackUps/";
    public static final int PERSONAL_PROJECT_KEY_SIZE = 10;

    public Constants() {
        //required constructor
    }

    public static enum InputRequestType {
        RENAME_PROJECT,
        CREATE_NEW_PROJECT,
        NONE,
        ADD_GROUP_MEMBER,
        CREATE_NEW_TASK,
        RENAME_TASK
    }

}
