// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.CollectorAgentPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CollectorPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CollectorPropertiesResponse Empty = new CollectorPropertiesResponse();

    @Import(name="agentProperties")
      private final @Nullable CollectorAgentPropertiesResponse agentProperties;

    public Optional<CollectorAgentPropertiesResponse> getAgentProperties() {
        return this.agentProperties == null ? Optional.empty() : Optional.ofNullable(this.agentProperties);
    }

    /**
     * Time when this collector was created. Date-Time represented in ISO-8601 format.
     * 
     */
    @Import(name="createdTimestamp", required=true)
      private final String createdTimestamp;

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * The ARM id of the discovery service site.
     * 
     */
    @Import(name="discoverySiteId")
      private final @Nullable String discoverySiteId;

    public Optional<String> getDiscoverySiteId() {
        return this.discoverySiteId == null ? Optional.empty() : Optional.ofNullable(this.discoverySiteId);
    }

    /**
     * Time when this collector was updated. Date-Time represented in ISO-8601 format.
     * 
     */
    @Import(name="updatedTimestamp", required=true)
      private final String updatedTimestamp;

    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public CollectorPropertiesResponse(
        @Nullable CollectorAgentPropertiesResponse agentProperties,
        String createdTimestamp,
        @Nullable String discoverySiteId,
        String updatedTimestamp) {
        this.agentProperties = agentProperties;
        this.createdTimestamp = Objects.requireNonNull(createdTimestamp, "expected parameter 'createdTimestamp' to be non-null");
        this.discoverySiteId = discoverySiteId;
        this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp, "expected parameter 'updatedTimestamp' to be non-null");
    }

    private CollectorPropertiesResponse() {
        this.agentProperties = null;
        this.createdTimestamp = null;
        this.discoverySiteId = null;
        this.updatedTimestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CollectorAgentPropertiesResponse agentProperties;
        private String createdTimestamp;
        private @Nullable String discoverySiteId;
        private String updatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentProperties = defaults.agentProperties;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.discoverySiteId = defaults.discoverySiteId;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
        }

        public Builder agentProperties(@Nullable CollectorAgentPropertiesResponse agentProperties) {
            this.agentProperties = agentProperties;
            return this;
        }
        public Builder createdTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }
        public Builder discoverySiteId(@Nullable String discoverySiteId) {
            this.discoverySiteId = discoverySiteId;
            return this;
        }
        public Builder updatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }        public CollectorPropertiesResponse build() {
            return new CollectorPropertiesResponse(agentProperties, createdTimestamp, discoverySiteId, updatedTimestamp);
        }
    }
}
