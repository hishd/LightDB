# LightDB
[![](https://jitpack.io/v/hishd/LightDB.svg)](https://jitpack.io/#hishd/LightDB)


LightDB is a light weight Android Library that uses SharedPreferences to store key - value pairs.

## Installation

The simplest way to use LightDB is to add the library as dependency to your build.

```bash
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
    implementation 'com.github.hishd:LightDB:1.0.2'
}

```

## Usage

Initialize LightDB with Constructor.

```
LightDB lightDB = new LightDB("DB_NAME",Context);
```

Save Boolean Values
```
lightDB.saveBoolen("KEY_NAME",true);
```

Save Integer Values
```
lightDB.saveInt("KEY_NAME",1);
```

Save String Values
```
lightDB.saveString("KEYNAME","STRING_VALUE");
```

Save multiple String Key - Values
```
lightDB.saveStringList(Map<String,String> map);
```

Remove all Values with Keys
```
lightDB.removeAll();
```

Remove specific keys along with values
```
lightDB.removeValue("KEY");
```

Search the existence of a key
```
lightDB.contains("KEY");
```

Get a Boolean Value of a Key
```
lightDB.getBoolean("KEY");
```

Get a String Value of a Key
```
lightDB.getString("KEY");
```

Other Methods
```
lightDB.saveFloat("KEY_NAME",1);
lightDB.saveLong("KEY_NAME",1);
lightDB.saveLongList(Map<String,Long> map);
lightDB.saveFloatList(Map<String,Float> map);
lightDB.saveIntList(Map<String,Integer> map);
lightDB.saveBooleanList(Map<String,Boolean> map);
lightDB.getInt("KEY");
lightDB.getFloat("KEY");
lightDB.getLong("KEY");
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

