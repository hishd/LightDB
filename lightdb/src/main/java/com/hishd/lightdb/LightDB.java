package com.hishd.lightdb;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

/**
 * Class That uses android's SharedPreferences to store the data
 */

public class LightDB {

    /**
     * Android's SharedPreferences instance
     * Android's SharedPreferences Editor instance
     */
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    /**
     * Instance for the singleton class
     */
    private static LightDB instance;

    /**
     * Initialize the constructor and returns the instance to make it singleton
     *
     * @param name The name of the Database that stores all the key - values pairs
     * @param context Context of the current Android Application
     * @return
     */
    public static LightDB getInstance(String name, Context context) {
        if(instance == null) {
            instance = new LightDB(name, context);
        }

        return instance;
    }

    /**
     * Constructor for the LightDB Class that initialize the SharedPreferences and the Editor instances
     *
     * @param name The name of the Database that stores all the key - values
     * @param context Context of the current Android Application
     */
    private LightDB(String name, Context context){
        sharedPreferences = context.getSharedPreferences(name,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    /**
     * Method to save Boolean values for a specified key
     *
     * @param key The name of the key that the boolean value is stores
     * @param value The value referenced to the key
     */
    public void saveBoolean(String key, boolean value){
        editor.putBoolean(key,value);
        editor.apply();
    }

    /**
     * Method to store integer values for a specified key
     *
     * @param key The name of the key that the integer value is stored
     * @param value The value referenced to the key
     */
    public void saveInt(String key, int value){
        editor.putInt(key,value);
        editor.apply();
    }

    /**
     * Method to store float values for a specified key
     *
     * @param key The name of the key that the float value is stored
     * @param value The value referenced to the key
     */
    public void saveFloat(String key, float value){
        editor.putFloat(key,value);
        editor.apply();
    }

    /**
     * Method to store long values for a specified key
     *
     * @param key The name of the key that the long value is stored
     * @param value The value referenced to the key
     */
    public void saveLong(String key, long value){
        editor.putLong(key,value);
        editor.apply();
    }

    /**
     * Method to store String values for a specified key
     *
     * @param key The name of the key that the String value is stored
     * @param value The value referenced to the key
     */
    public void saveString(String key, String value){
        editor.putString(key,value);
        editor.apply();
    }

    /**
     * Method to store list of keys along with their long values, this method will iterate through
     * the passed parameter Map and store each key with its value
     *
     * @param map The Map that stores all the keys and values
     */
    public void saveLongList(Map<String,Long> map){
        for(Map.Entry<String,Long> entry : map.entrySet()){
            editor.putLong(entry.getKey(),entry.getValue());
            editor.apply();
        }
    }

    /**
     * Method to store list of keys along with their float values, this method will iterate through
     * the passed parameter Map and store each key with its value
     *
     * @param map The Map that stores all the keys and values
     */
    public void saveFloatList(Map<String,Float> map){
        for(Map.Entry<String,Float> entry : map.entrySet()){
            editor.putFloat(entry.getKey(),entry.getValue());
            editor.apply();
        }
    }

    /**
     * Method to store list of keys along with their integer values, this method will iterate through
     * the passed parameter Map and store each key with its value
     *
     * @param map The Map that stores all the keys and values
     */
    public void saveIntList(Map<String,Integer> map){
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            editor.putInt(entry.getKey(),entry.getValue());
            editor.apply();
        }
    }

    /**
     * Method to store list of keys along with their boolean values, this method will iterate through
     * the passed parameter Map and store each key with its value
     *
     * @param map The Map that stores all the keys and values
     */
    public void saveBooleanList(Map<String,Boolean> map){
        for(Map.Entry<String,Boolean> entry : map.entrySet()){
            editor.putBoolean(entry.getKey(),entry.getValue());
            editor.apply();
        }
    }

    /**
     * Method to store list of keys along with their String values, this method will iterate through
     * the passed parameter Map and store each key with its value
     *
     * @param map The Map that stores all the keys and values
     */
    public void saveStringList(Map<String,String> map){
        for(Map.Entry<String,String> entry : map.entrySet()){
            editor.putString(entry.getKey(),entry.getValue());
            editor.apply();
        }
    }

    /**
     * Method use to remove and clears all the keys and values on the Database
     */
    public void removeAll(){
        editor.clear();
        editor.apply();
    }

    /**
     * Method to remove a specific key along with its value
     *
     * @param key The name of the key
     */
    public void removeValue(String key){
        editor.remove(key);
        editor.apply();
    }

    /**
     * Method that searches the existence of a specific key
     *
     * @param key The name of the key
     * @return Returns true or false based on the existence of a specific key
     */
    public boolean contains(String key){
        return sharedPreferences.contains(key);
    }

    /**
     * Method that finds and returns a specific Boolean value with referenced to the key
     *
     * @param key The name of the key with referenced to the value
     * @return Returns the actual value if it exists otherwise returns false
     */
    public boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key,false);
    }

    /**
     * Method that finds and returns a specific Integer value with referenced to the key
     *
     * @param key The name of the key with referenced to the value
     * @return Returns the actual value if it exists otherwise returns 0
     */
    public int getInt(String key){
        return sharedPreferences.getInt(key,0);
    }

    /**
     * Method that finds and returns a specific Float value with referenced to the key
     *
     * @param key The name of the key with referenced to the value
     * @return Returns the actual value if it exists otherwise returns 0
     */
    public float getFloat(String key){
        return sharedPreferences.getFloat(key,0);
    }

    /**
     * Method that finds and returns a specific Long value with referenced to the key
     *
     * @param key The name of the key with referenced to the value
     * @return Returns the actual value if it exists otherwise returns 0
     */
    public long getLong(String key){
        return sharedPreferences.getLong(key,0);
    }

    /**
     * Method that finds and returns a specific String value with referenced to the key
     *
     * @param key The name of the key with referenced to the value
     * @return Returns the actual value if it exists otherwise returns null
     */
    public String getString(String key){
        return sharedPreferences.getString(key,null);
    }
}
