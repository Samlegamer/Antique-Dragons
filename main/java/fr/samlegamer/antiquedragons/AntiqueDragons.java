package fr.samlegamer.antiquedragons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import hunternif.mc.api.AtlasAPI;
import hunternif.mc.api.MarkerAPI;
import hunternif.mc.impl.atlas.registry.MarkerType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = AntiqueDragons.MODID)
@Mod.EventBusSubscriber(modid = AntiqueDragons.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AntiqueDragons
{
	public static final String MODID = "antiquedragons";
    private static final Logger LOGGER = LogManager.getLogger();
    private static final MarkerAPI api = AtlasAPI.getMarkerAPI();
    
    private static final ResourceLocation PATH_BRONZE = new ResourceLocation(MODID, "textures/gui/markers/dragon_bronze.png");
    private static final ResourceLocation PATH_RED = new ResourceLocation(MODID, "textures/gui/markers/dragon_red.png");
    private static final ResourceLocation PATH_GRAY = new ResourceLocation(MODID, "textures/gui/markers/dragon_gray.png");
    private static final ResourceLocation PATH_GREEN = new ResourceLocation(MODID, "textures/gui/markers/dragon_green.png");
    
    private static final ResourceLocation ID_BRONZE = new ResourceLocation(MODID, "dragon_bronze");
    private static final ResourceLocation ID_RED = new ResourceLocation(MODID, "dragon_red");
    private static final ResourceLocation ID_GRAY = new ResourceLocation(MODID, "dragon_gray");
    private static final ResourceLocation ID_GREEN = new ResourceLocation(MODID, "dragon_green");

    private static final ResourceLocation PATH_BLUE = new ResourceLocation(MODID, "textures/gui/markers/dragon_blue.png");
    private static final ResourceLocation PATH_SAPHIR = new ResourceLocation(MODID, "textures/gui/markers/dragon_saphir.png");
    private static final ResourceLocation PATH_WHITE = new ResourceLocation(MODID, "textures/gui/markers/dragon_white.png");
    private static final ResourceLocation PATH_SILVER = new ResourceLocation(MODID, "textures/gui/markers/dragon_silver.png");

    private static final ResourceLocation ID_BLUE = new ResourceLocation(MODID, "dragon_blue");
    private static final ResourceLocation ID_SAPHIR = new ResourceLocation(MODID, "dragon_saphir");
    private static final ResourceLocation ID_WHITE = new ResourceLocation(MODID, "dragon_white");
    private static final ResourceLocation ID_SILVER = new ResourceLocation(MODID, "dragon_silver");

    private static final ResourceLocation PATH_ELECTRIC = new ResourceLocation(MODID, "textures/gui/markers/dragon_electric.png");
    private static final ResourceLocation PATH_COPPER = new ResourceLocation(MODID, "textures/gui/markers/dragon_copper.png");
    private static final ResourceLocation PATH_AMETHYST = new ResourceLocation(MODID, "textures/gui/markers/dragon_amethyst.png");
    private static final ResourceLocation PATH_BLACK = new ResourceLocation(MODID, "textures/gui/markers/dragon_black.png");

    private static final ResourceLocation ID_ELECTRIC = new ResourceLocation(MODID, "dragon_electric");
    private static final ResourceLocation ID_COPPER = new ResourceLocation(MODID, "dragon_copper");
    private static final ResourceLocation ID_AMETHYST = new ResourceLocation(MODID, "dragon_amethyst");
    private static final ResourceLocation ID_BLACK = new ResourceLocation(MODID, "dragon_black");

	public AntiqueDragons()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		
		LOGGER.info("Dragon Markers Is Charged !");
        MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(FMLCommonSetupEvent event){}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		//Fire
        MarkerType Bronze = new MarkerType(PATH_BRONZE);
        MarkerType.register(ID_BRONZE, Bronze);
        MarkerType Red = new MarkerType(PATH_RED);
        MarkerType.register(ID_RED, Red);
        MarkerType Gray = new MarkerType(PATH_GRAY);
        MarkerType.register(ID_GRAY, Gray);
        MarkerType Green = new MarkerType(PATH_GREEN);
        MarkerType.register(ID_GREEN, Green);
        
        //Ice
        MarkerType Blue = new MarkerType(PATH_BLUE);
        MarkerType.register(ID_BLUE, Blue);
        MarkerType Saphir = new MarkerType(PATH_SAPHIR);
        MarkerType.register(ID_SAPHIR, Saphir);
        MarkerType Silver = new MarkerType(PATH_SILVER);
        MarkerType.register(ID_SILVER, Silver);
        MarkerType White = new MarkerType(PATH_WHITE);
        MarkerType.register(ID_WHITE, White);

        //Lightning
        MarkerType Copper = new MarkerType(PATH_COPPER);
        MarkerType.register(ID_COPPER, Copper);
        MarkerType Electric = new MarkerType(PATH_ELECTRIC);
        MarkerType.register(ID_ELECTRIC, Electric);
        MarkerType Amethyst = new MarkerType(PATH_AMETHYST);
        MarkerType.register(ID_AMETHYST, Amethyst);
        MarkerType Black = new MarkerType(PATH_BLACK);
        MarkerType.register(ID_BLACK, Black);
	}
}