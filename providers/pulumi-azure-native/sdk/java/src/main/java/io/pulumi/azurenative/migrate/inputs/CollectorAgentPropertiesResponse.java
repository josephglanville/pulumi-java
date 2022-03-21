// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.CollectorBodyAgentSpnPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CollectorAgentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CollectorAgentPropertiesResponse Empty = new CollectorAgentPropertiesResponse();

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    @Import(name="lastHeartbeatUtc", required=true)
      private final String lastHeartbeatUtc;

    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    @Import(name="spnDetails")
      private final @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails;

    public Optional<CollectorBodyAgentSpnPropertiesResponse> getSpnDetails() {
        return this.spnDetails == null ? Optional.empty() : Optional.ofNullable(this.spnDetails);
    }

    @Import(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public CollectorAgentPropertiesResponse(
        String id,
        String lastHeartbeatUtc,
        @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails,
        String version) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
        this.spnDetails = spnDetails;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private CollectorAgentPropertiesResponse() {
        this.id = null;
        this.lastHeartbeatUtc = null;
        this.spnDetails = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorAgentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String lastHeartbeatUtc;
        private @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorAgentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.spnDetails = defaults.spnDetails;
    	      this.version = defaults.version;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }
        public Builder spnDetails(@Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails) {
            this.spnDetails = spnDetails;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public CollectorAgentPropertiesResponse build() {
            return new CollectorAgentPropertiesResponse(id, lastHeartbeatUtc, spnDetails, version);
        }
    }
}
