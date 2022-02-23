// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * DRA details.
 * 
 */
public final class DraDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DraDetailsResponse Empty = new DraDetailsResponse();

    /**
     * The health of the DRA.
     * 
     */
    @InputImport(name="health", required=true)
      private final String health;

    public String getHealth() {
        return this.health;
    }

    /**
     * The health errors.
     * 
     */
    @InputImport(name="healthErrors", required=true)
      private final List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors;
    }

    /**
     * The DRA Id.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The last heartbeat received from the DRA.
     * 
     */
    @InputImport(name="lastHeartbeatUtc", required=true)
      private final String lastHeartbeatUtc;

    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * The DRA name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The DRA version.
     * 
     */
    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public DraDetailsResponse(
        String health,
        List<HealthErrorResponse> healthErrors,
        String id,
        String lastHeartbeatUtc,
        String name,
        String version) {
        this.health = Objects.requireNonNull(health, "expected parameter 'health' to be non-null");
        this.healthErrors = Objects.requireNonNull(healthErrors, "expected parameter 'healthErrors' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private DraDetailsResponse() {
        this.health = null;
        this.healthErrors = List.of();
        this.id = null;
        this.lastHeartbeatUtc = null;
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DraDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String id;
        private String lastHeartbeatUtc;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DraDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public DraDetailsResponse build() {
            return new DraDetailsResponse(health, healthErrors, id, lastHeartbeatUtc, name, version);
        }
    }
}
