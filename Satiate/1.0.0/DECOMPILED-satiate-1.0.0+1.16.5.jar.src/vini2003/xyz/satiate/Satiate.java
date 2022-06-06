/*    */ package vini2003.xyz.satiate;
/*    */ 
/*    */ import net.fabricmc.api.ModInitializer;
/*    */ import net.minecraft.class_2960;
/*    */ import vini2003.xyz.satiate.registry.common.SatiateCommands;
/*    */ 
/*    */ public class Satiate implements ModInitializer {
/*    */   public static final String ID = "heal";
/*    */   
/*    */   public static class_2960 identifier(String path) {
/* 11 */     return new class_2960("heal", path);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onInitialize() {
/* 16 */     SatiateCommands.initialize();
/*    */   }
/*    */ }


/* Location:              /Users/alex/BAK/vini2003/Mods/Satiate/1.0.0/satiate-1.0.0+1.16.5.jar!/vini2003/xyz/satiate/Satiate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */