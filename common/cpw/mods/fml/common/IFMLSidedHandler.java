package cpw.mods.fml.common;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import cpw.mods.fml.common.modloader.BaseMod;
import cpw.mods.fml.common.modloader.ModProperty;

public interface IFMLSidedHandler
{
    Logger getMinecraftLogger();

    Object getMinecraftInstance();

    String getCurrentLanguage();

    Properties getCurrentLanguageTable();

    String getObjectName(Object minecraftObject);

    void profileStart(String profileLabel);

    void profileEnd();

    ModProperty getModLoaderPropertyFor(Field f);

    List<String> getAdditionalBrandingInformation();

    Side getSide();

    ProxyInjector findSidedProxyOn(BaseMod mod);

    void haltGame(String message, Throwable exception);
}
