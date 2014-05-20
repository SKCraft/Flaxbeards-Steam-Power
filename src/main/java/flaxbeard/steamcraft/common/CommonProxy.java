package flaxbeard.steamcraft.common;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import flaxbeard.steamcraft.Steamcraft;
import flaxbeard.steamcraft.packet.SteamcraftServerPacketHandler;


public class CommonProxy
{
    public void registerRenderers()
    {
   	 	Steamcraft.channel.register(new SteamcraftServerPacketHandler());

    }
    
    public void spawnBreakParticles(World world, float x, float y, float z, Block blokc, float xv, float yv, float zv) {}
}