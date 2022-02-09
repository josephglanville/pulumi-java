// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HybridRunbookWorkerLegacyResponse {
    private final @Nullable String ip;
    private final @Nullable String lastSeenDateTime;
    private final @Nullable String name;
    private final @Nullable String registrationTime;

    @OutputCustomType.Constructor({"ip","lastSeenDateTime","name","registrationTime"})
    private HybridRunbookWorkerLegacyResponse(
        @Nullable String ip,
        @Nullable String lastSeenDateTime,
        @Nullable String name,
        @Nullable String registrationTime) {
        this.ip = ip;
        this.lastSeenDateTime = lastSeenDateTime;
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<String> getLastSeenDateTime() {
        return Optional.ofNullable(this.lastSeenDateTime);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
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

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setLastSeenDateTime(@Nullable String lastSeenDateTime) {
            this.lastSeenDateTime = lastSeenDateTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRegistrationTime(@Nullable String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }

        public HybridRunbookWorkerLegacyResponse build() {
            return new HybridRunbookWorkerLegacyResponse(ip, lastSeenDateTime, name, registrationTime);
        }
    }
}
