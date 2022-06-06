/*    */ package vini2003.xyz.satiate.registry.common;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_2168;
/*    */ import net.minecraft.class_2170;
/*    */ 
/*    */ public class SatiateCommands {
/*    */   private static int satiate(CommandContext<class_2168> context) throws CommandSyntaxException {
/* 13 */     class_3222 class_3222 = ((class_2168)context.getSource()).method_9207();
/*    */     
/* 15 */     ((class_2168)context.getSource()).method_9211().execute(() -> player.method_7344().method_7580(20));
/*    */ 
/*    */ 
/*    */     
/* 19 */     return 1;
/*    */   }
/*    */   
/*    */   public static void initialize() {
/* 23 */     CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
/*    */           LiteralCommandNode<class_2168> heal = ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_2170.method_9247("satiate").requires(())).executes(SatiateCommands::satiate)).build();
/*    */           dispatcher.getRoot().addChild((CommandNode)heal);
/*    */         });
/*    */   }
/*    */ }


/* Location:              /Users/alex/BAK/vini2003/Mods/Satiate/1.0.0/satiate-1.0.0+1.16.5.jar!/vini2003/xyz/satiate/registry/common/SatiateCommands.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */