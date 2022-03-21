// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HybridRunbookWorkerLegacyResponse {
    /**
     * Gets or sets the assigned machine IP address.
     * 
     */
    private final @Nullable String ip;
    /**
     * Last Heartbeat from the Worker
     * 
     */
    private final @Nullable String lastSeenDateTime;
    /**
     * Gets or sets the worker machine name.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets or sets the registration time of the worker machine.
     * 
     */
    private final @Nullable String registrationTime;

    @CustomType.Constructor
    private HybridRunbookWorkerLegacyResponse(
        @CustomType.Parameter("ip") @Nullable String ip,
        @CustomType.Parameter("lastSeenDateTime") @Nullable String lastSeenDateTime,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("registrationTime") @Nullable String registrationTime) {
        this.ip = ip;
        this.lastSeenDateTime = lastSeenDateTime;
        this.name = name;
        this.registrationTime = registrationTime;
    }

    /**
     * Gets or sets the assigned machine IP address.
     * 
    */
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * Last Heartbeat from the Worker
     * 
    */
    public Optional<String> getLastSeenDateTime() {
        return Optional.ofNullable(this.lastSeenDateTime);
    }
    /**
     * Gets or sets the worker machine name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets or sets the registration time of the worker machine.
     * 
    */
    public Optional<String> getRegistrationTime() {
        return Optional.ofNullable(this.registrationTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridRunbookWorkerLegacyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String lastSeenDateTime;
        private @Nullable String name;
        private @Nullable String registrationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridRunbookWorkerLegacyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.lastSeenDateTime = defaults.lastSeenDateTime;
    	      this.name = defaults.name;
    	      this.registrationTime = defaults.registrationTime;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder lastSeenDateTime(@Nullable String lastSeenDateTime) {
            this.lastSeenDateTime = lastSeenDateTime;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder registrationTime(@Nullable String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }        public HybridRunbookWorkerLegacyResponse build() {
            return new HybridRunbookWorkerLegacyResponse(ip, lastSeenDateTime, name, registrationTime);
        }
    }
}
