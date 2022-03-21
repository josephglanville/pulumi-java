// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.CreationDataResponse;
import io.pulumi.azurenative.containerservice.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSnapshotResult {
    /**
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     * 
     */
    private final @Nullable CreationDataResponse creationData;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The type of a snapshot. The default is NodePool.
     * 
     */
    private final @Nullable String snapshotType;
    /**
     * The system metadata relating to this snapshot.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("creationData") @Nullable CreationDataResponse creationData,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("snapshotType") @Nullable String snapshotType,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.creationData = creationData;
        this.id = id;
        this.location = location;
        this.name = name;
        this.snapshotType = snapshotType;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     * 
    */
    public Optional<CreationDataResponse> getCreationData() {
        return Optional.ofNullable(this.creationData);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of a snapshot. The default is NodePool.
     * 
    */
    public Optional<String> getSnapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }
    /**
     * The system metadata relating to this snapshot.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CreationDataResponse creationData;
        private String id;
        private String location;
        private String name;
        private @Nullable String snapshotType;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationData = defaults.creationData;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.snapshotType = defaults.snapshotType;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder creationData(@Nullable CreationDataResponse creationData) {
            this.creationData = creationData;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSnapshotResult build() {
            return new GetSnapshotResult(creationData, id, location, name, snapshotType, systemData, tags, type);
        }
    }
}
