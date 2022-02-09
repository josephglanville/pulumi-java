// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.IPVersion;
import io.pulumi.azurenative.network.enums.IpAllocationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpAllocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpAllocationArgs Empty = new IpAllocationArgs();

    @InputImport(name="allocationTags")
    private final @Nullable Input<Map<String,String>> allocationTags;

    public Input<Map<String,String>> getAllocationTags() {
        return this.allocationTags == null ? Input.empty() : this.allocationTags;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="ipAllocationName")
    private final @Nullable Input<String> ipAllocationName;

    public Input<String> getIpAllocationName() {
        return this.ipAllocationName == null ? Input.empty() : this.ipAllocationName;
    }

    @InputImport(name="ipamAllocationId")
    private final @Nullable Input<String> ipamAllocationId;

    public Input<String> getIpamAllocationId() {
        return this.ipamAllocationId == null ? Input.empty() : this.ipamAllocationId;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    @InputImport(name="prefixLength")
    private final @Nullable Input<Integer> prefixLength;

    public Input<Integer> getPrefixLength() {
        return this.prefixLength == null ? Input.empty() : this.prefixLength;
    }

    @InputImport(name="prefixType")
    private final @Nullable Input<Either<String,IPVersion>> prefixType;

    public Input<Either<String,IPVersion>> getPrefixType() {
        return this.prefixType == null ? Input.empty() : this.prefixType;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,IpAllocationType>> type;

    public Input<Either<String,IpAllocationType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IpAllocationArgs(
        @Nullable Input<Map<String,String>> allocationTags,
        @Nullable Input<String> id,
        @Nullable Input<String> ipAllocationName,
        @Nullable Input<String> ipamAllocationId,
        @Nullable Input<String> location,
        @Nullable Input<String> prefix,
        @Nullable Input<Integer> prefixLength,
        @Nullable Input<Either<String,IPVersion>> prefixType,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Either<String,IpAllocationType>> type) {
        this.allocationTags = allocationTags;
        this.id = id;
        this.ipAllocationName = ipAllocationName;
        this.ipamAllocationId = ipamAllocationId;
        this.location = location;
        this.prefix = prefix;
        this.prefixLength = prefixLength == null ? Input.ofNullable(0) : prefixLength;
        this.prefixType = prefixType;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.type = type;
    }

    private IpAllocationArgs() {
        this.allocationTags = Input.empty();
        this.id = Input.empty();
        this.ipAllocationName = Input.empty();
        this.ipamAllocationId = Input.empty();
        this.location = Input.empty();
        this.prefix = Input.empty();
        this.prefixLength = Input.empty();
        this.prefixType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> allocationTags;
        private @Nullable Input<String> id;
        private @Nullable Input<String> ipAllocationName;
        private @Nullable Input<String> ipamAllocationId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> prefix;
        private @Nullable Input<Integer> prefixLength;
        private @Nullable Input<Either<String,IPVersion>> prefixType;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Either<String,IpAllocationType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAllocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationTags = defaults.allocationTags;
    	      this.id = defaults.id;
    	      this.ipAllocationName = defaults.ipAllocationName;
    	      this.ipamAllocationId = defaults.ipamAllocationId;
    	      this.location = defaults.location;
    	      this.prefix = defaults.prefix;
    	      this.prefixLength = defaults.prefixLength;
    	      this.prefixType = defaults.prefixType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAllocationTags(@Nullable Input<Map<String,String>> allocationTags) {
            this.allocationTags = allocationTags;
            return this;
        }

        public Builder setAllocationTags(@Nullable Map<String,String> allocationTags) {
            this.allocationTags = Input.ofNullable(allocationTags);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpAllocationName(@Nullable Input<String> ipAllocationName) {
            this.ipAllocationName = ipAllocationName;
            return this;
        }

        public Builder setIpAllocationName(@Nullable String ipAllocationName) {
            this.ipAllocationName = Input.ofNullable(ipAllocationName);
            return this;
        }

        public Builder setIpamAllocationId(@Nullable Input<String> ipamAllocationId) {
            this.ipamAllocationId = ipamAllocationId;
            return this;
        }

        public Builder setIpamAllocationId(@Nullable String ipamAllocationId) {
            this.ipamAllocationId = Input.ofNullable(ipamAllocationId);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setPrefixLength(@Nullable Input<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder setPrefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Input.ofNullable(prefixLength);
            return this;
        }

        public Builder setPrefixType(@Nullable Input<Either<String,IPVersion>> prefixType) {
            this.prefixType = prefixType;
            return this;
        }

        public Builder setPrefixType(@Nullable Either<String,IPVersion> prefixType) {
            this.prefixType = Input.ofNullable(prefixType);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,IpAllocationType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,IpAllocationType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public IpAllocationArgs build() {
            return new IpAllocationArgs(allocationTags, id, ipAllocationName, ipamAllocationId, location, prefix, prefixLength, prefixType, resourceGroupName, tags, type);
        }
    }
}
