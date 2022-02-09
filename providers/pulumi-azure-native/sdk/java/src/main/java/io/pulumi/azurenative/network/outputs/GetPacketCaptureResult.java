// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.PacketCaptureFilterResponse;
import io.pulumi.azurenative.network.outputs.PacketCaptureStorageLocationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPacketCaptureResult {
    private final @Nullable Double bytesToCapturePerPacket;
    private final String etag;
    private final @Nullable List<PacketCaptureFilterResponse> filters;
    private final String id;
    private final String name;
    private final String provisioningState;
    private final PacketCaptureStorageLocationResponse storageLocation;
    private final String target;
    private final @Nullable Integer timeLimitInSeconds;
    private final @Nullable Double totalBytesPerSession;

    @OutputCustomType.Constructor({"bytesToCapturePerPacket","etag","filters","id","name","provisioningState","storageLocation","target","timeLimitInSeconds","totalBytesPerSession"})
    private GetPacketCaptureResult(
        @Nullable Double bytesToCapturePerPacket,
        String etag,
        @Nullable List<PacketCaptureFilterResponse> filters,
        String id,
        String name,
        String provisioningState,
        PacketCaptureStorageLocationResponse storageLocation,
        String target,
        @Nullable Integer timeLimitInSeconds,
        @Nullable Double totalBytesPerSession) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        this.etag = Objects.requireNonNull(etag);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.storageLocation = Objects.requireNonNull(storageLocation);
        this.target = Objects.requireNonNull(target);
        this.timeLimitInSeconds = timeLimitInSeconds;
        this.totalBytesPerSession = totalBytesPerSession;
    }

    public Optional<Double> getBytesToCapturePerPacket() {
        return Optional.ofNullable(this.bytesToCapturePerPacket);
    }
    public String getEtag() {
        return this.etag;
    }
    public List<PacketCaptureFilterResponse> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public PacketCaptureStorageLocationResponse getStorageLocation() {
        return this.storageLocation;
    }
    public String getTarget() {
        return this.target;
    }
    public Optional<Integer> getTimeLimitInSeconds() {
        return Optional.ofNullable(this.timeLimitInSeconds);
    }
    public Optional<Double> getTotalBytesPerSession() {
        return Optional.ofNullable(this.totalBytesPerSession);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPacketCaptureResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double bytesToCapturePerPacket;
        private String etag;
        private @Nullable List<PacketCaptureFilterResponse> filters;
        private String id;
        private String name;
        private String provisioningState;
        private PacketCaptureStorageLocationResponse storageLocation;
        private String target;
        private @Nullable Integer timeLimitInSeconds;
        private @Nullable Double totalBytesPerSession;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPacketCaptureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesToCapturePerPacket = defaults.bytesToCapturePerPacket;
    	      this.etag = defaults.etag;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageLocation = defaults.storageLocation;
    	      this.target = defaults.target;
    	      this.timeLimitInSeconds = defaults.timeLimitInSeconds;
    	      this.totalBytesPerSession = defaults.totalBytesPerSession;
        }

        public Builder setBytesToCapturePerPacket(@Nullable Double bytesToCapturePerPacket) {
            this.bytesToCapturePerPacket = bytesToCapturePerPacket;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFilters(@Nullable List<PacketCaptureFilterResponse> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStorageLocation(PacketCaptureStorageLocationResponse storageLocation) {
            this.storageLocation = Objects.requireNonNull(storageLocation);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTimeLimitInSeconds(@Nullable Integer timeLimitInSeconds) {
            this.timeLimitInSeconds = timeLimitInSeconds;
            return this;
        }

        public Builder setTotalBytesPerSession(@Nullable Double totalBytesPerSession) {
            this.totalBytesPerSession = totalBytesPerSession;
            return this;
        }

        public GetPacketCaptureResult build() {
            return new GetPacketCaptureResult(bytesToCapturePerPacket, etag, filters, id, name, provisioningState, storageLocation, target, timeLimitInSeconds, totalBytesPerSession);
        }
    }
}
