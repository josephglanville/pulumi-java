// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationSecurityGroupResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityRuleResponse {
    private final String access;
    private final @Nullable String description;
    private final @Nullable String destinationAddressPrefix;
    private final @Nullable List<String> destinationAddressPrefixes;
    private final @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups;
    private final @Nullable String destinationPortRange;
    private final @Nullable List<String> destinationPortRanges;
    private final String direction;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable Integer priority;
    private final String protocol;
    private final String provisioningState;
    private final @Nullable String sourceAddressPrefix;
    private final @Nullable List<String> sourceAddressPrefixes;
    private final @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups;
    private final @Nullable String sourcePortRange;
    private final @Nullable List<String> sourcePortRanges;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"access","description","destinationAddressPrefix","destinationAddressPrefixes","destinationApplicationSecurityGroups","destinationPortRange","destinationPortRanges","direction","etag","id","name","priority","protocol","provisioningState","sourceAddressPrefix","sourceAddressPrefixes","sourceApplicationSecurityGroups","sourcePortRange","sourcePortRanges","type"})
    private SecurityRuleResponse(
        String access,
        @Nullable String description,
        @Nullable String destinationAddressPrefix,
        @Nullable List<String> destinationAddressPrefixes,
        @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups,
        @Nullable String destinationPortRange,
        @Nullable List<String> destinationPortRanges,
        String direction,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String protocol,
        String provisioningState,
        @Nullable String sourceAddressPrefix,
        @Nullable List<String> sourceAddressPrefixes,
        @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups,
        @Nullable String sourcePortRange,
        @Nullable List<String> sourcePortRanges,
        @Nullable String type) {
        this.access = Objects.requireNonNull(access);
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = Objects.requireNonNull(direction);
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.protocol = Objects.requireNonNull(protocol);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
        this.type = type;
    }

    public String getAccess() {
        return this.access;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDestinationAddressPrefix() {
        return Optional.ofNullable(this.destinationAddressPrefix);
    }
    public List<String> getDestinationAddressPrefixes() {
        return this.destinationAddressPrefixes == null ? List.of() : this.destinationAddressPrefixes;
    }
    public List<ApplicationSecurityGroupResponse> getDestinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups == null ? List.of() : this.destinationApplicationSecurityGroups;
    }
    public Optional<String> getDestinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }
    public List<String> getDestinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }
    public String getDirection() {
        return this.direction;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getSourceAddressPrefix() {
        return Optional.ofNullable(this.sourceAddressPrefix);
    }
    public List<String> getSourceAddressPrefixes() {
        return this.sourceAddressPrefixes == null ? List.of() : this.sourceAddressPrefixes;
    }
    public List<ApplicationSecurityGroupResponse> getSourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups == null ? List.of() : this.sourceApplicationSecurityGroups;
    }
    public Optional<String> getSourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }
    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String description;
        private @Nullable String destinationAddressPrefix;
        private @Nullable List<String> destinationAddressPrefixes;
        private @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups;
        private @Nullable String destinationPortRange;
        private @Nullable List<String> destinationPortRanges;
        private String direction;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String protocol;
        private String provisioningState;
        private @Nullable String sourceAddressPrefix;
        private @Nullable List<String> sourceAddressPrefixes;
        private @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups;
        private @Nullable String sourcePortRange;
        private @Nullable List<String> sourcePortRanges;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroups = defaults.destinationApplicationSecurityGroups;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroups = defaults.sourceApplicationSecurityGroups;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.type = defaults.type;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        public Builder setDestinationAddressPrefixes(@Nullable List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }

        public Builder setDestinationApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
            return this;
        }

        public Builder setDestinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder setDestinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder setSourceAddressPrefixes(@Nullable List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }

        public Builder setSourceApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
            return this;
        }

        public Builder setSourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder setSourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public SecurityRuleResponse build() {
            return new SecurityRuleResponse(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroups, destinationPortRange, destinationPortRanges, direction, etag, id, name, priority, protocol, provisioningState, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroups, sourcePortRange, sourcePortRanges, type);
        }
    }
}
