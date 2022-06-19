package net.caffeinemc.gfx.api.device;

public final class RenderDeviceProperties {
    /**
     * The required alignment for offsets used by uniform buffer bindings. Always a power-of-two.
     */
    public final int uniformBufferOffsetAlignment;

    /**
     * The required alignment for offsets used by storage buffer bindings. Always a power-of-two.
     */
    public final int storageBufferOffsetAlignment;

    /**
     * Determines whether glMultiDrawElementsIndirect should use glMultiDrawElementsIndirectCountARB
     * to bypass driver issues.
     */
    public final boolean useMDICountEmulation;

    public RenderDeviceProperties(
            int uniformBufferOffsetAlignment,
            int storageBufferOffsetAlignment,
            boolean useMDICountEmulation
    ) {
        this.uniformBufferOffsetAlignment = uniformBufferOffsetAlignment;
        this.storageBufferOffsetAlignment = storageBufferOffsetAlignment;
        this.useMDICountEmulation = useMDICountEmulation;
    }
}
