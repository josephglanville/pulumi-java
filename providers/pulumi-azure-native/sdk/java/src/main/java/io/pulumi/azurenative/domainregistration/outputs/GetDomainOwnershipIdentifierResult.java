// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.outputs;

import io.pulumi.azurenative.domainregistration.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainOwnershipIdentifierResult {
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Ownership Id.
     * 
     */
    private final @Nullable String ownershipId;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDomainOwnershipIdentifierResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ownershipId") @Nullable String ownershipId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.ownershipId = ownershipId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Ownership Id.
     * 
    */
    public Optional<String> getOwnershipId() {
        return Optional.ofNullable(this.ownershipId);
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainOwnershipIdentifierResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String ownershipId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainOwnershipIdentifierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.ownershipId = defaults.ownershipId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ownershipId(@Nullable String ownershipId) {
            this.ownershipId = ownershipId;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDomainOwnershipIdentifierResult build() {
            return new GetDomainOwnershipIdentifierResult(id, kind, name, ownershipId, systemData, type);
        }
    }
}
