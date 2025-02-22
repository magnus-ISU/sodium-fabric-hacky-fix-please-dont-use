package net.caffeinemc.sodium.render.chunk.shader;

import net.caffeinemc.gfx.api.shader.BufferBlockType;
import net.caffeinemc.gfx.api.shader.ShaderBindingContext;
import net.caffeinemc.gfx.api.shader.BufferBlock;

/**
 * A forward-rendering shader program for chunks.
 */
public class ChunkShaderInterface {
    public final BufferBlock uniformCameraMatrices;
    public final BufferBlock uniformInstanceData;
    public final BufferBlock uniformFogParameters;

    public ChunkShaderInterface(ShaderBindingContext context) {
        this.uniformCameraMatrices = context.bindBufferBlock(BufferBlockType.UNIFORM, 0);
        this.uniformInstanceData = context.bindBufferBlock(BufferBlockType.UNIFORM, 1);
        this.uniformFogParameters = context.bindBufferBlock(BufferBlockType.UNIFORM, 2);
    }
}
