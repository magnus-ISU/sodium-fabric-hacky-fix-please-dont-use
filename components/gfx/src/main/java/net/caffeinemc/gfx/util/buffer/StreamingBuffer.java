package net.caffeinemc.gfx.util.buffer;

import net.caffeinemc.gfx.api.buffer.Buffer;

import java.nio.ByteBuffer;

public interface StreamingBuffer {
    long getDeviceUsedMemory();

    long getDeviceAllocatedMemory();

    void delete();

    Buffer getBufferObject();

    int getAlignment();

    WritableSection getSection(int frameIndex);

    WritableSection getSection(int frameIndex, int extraSize, boolean copyContents);

    interface WritableSection {
        ByteBuffer getView();

        long getDeviceOffset();

        void flushFull();

        void flushPartial();

        void reset();
    }
}
