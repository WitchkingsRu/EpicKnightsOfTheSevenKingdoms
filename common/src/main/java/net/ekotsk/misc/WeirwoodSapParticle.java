package net.ekotsk.misc;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;

public class WeirwoodSapParticle extends TextureSheetParticle {

    protected WeirwoodSapParticle(ClientLevel level, double x, double y, double z) {
        super(level, x, y, z);
        this.gravity = 0.05F;
        this.lifetime = 60 + this.random.nextInt(20);
        this.rCol = 0.7F;
        this.gCol = 0.1F;
        this.bCol = 0.1F;
        this.scale(1.0F);
        this.hasPhysics = true;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.removed) {
            this.xd *= 0.95;
            this.zd *= 0.95;
        }
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet sprites) {
            this.sprites = sprites;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientLevel level,
                                       double x, double y, double z,
                                       double xSpeed, double ySpeed, double zSpeed) {
            WeirwoodSapParticle particle = new WeirwoodSapParticle(level, x, y, z);
            particle.pickSprite(sprites);
            return particle;
        }
    }
}

