// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PartnerRegionInfoResponse {
    /**
     * Geo location of the partner managed instances.
     * 
     */
    private final @Nullable String location;
    /**
     * Replication role of the partner managed instances.
     * 
     */
    private final String replicationRole;

    @CustomType.Constructor
    private PartnerRegionInfoResponse(
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("replicationRole") String replicationRole) {
        this.location = location;
        this.replicationRole = replicationRole;
    }

    /**
     * Geo location of the partner managed instances.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Replication role of the partner managed instances.
     * 
    */
    public String getReplicationRole() {
        return this.replicationRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerRegionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private String replicationRole;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerRegionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.replicationRole = defaults.replicationRole;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder replicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }        public PartnerRegionInfoResponse build() {
            return new PartnerRegionInfoResponse(location, replicationRole);
        }
    }
}
