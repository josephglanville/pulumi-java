// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationClientDetailsResponse {
    /**
     * The client application Id.
     * 
     */
    private final @Nullable String applicationId;
    /**
     * The client Oid.
     * 
     */
    private final @Nullable String oid;
    /**
     * The client Puid
     * 
     */
    private final @Nullable String puid;

    @CustomType.Constructor
    private ApplicationClientDetailsResponse(
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("oid") @Nullable String oid,
        @CustomType.Parameter("puid") @Nullable String puid) {
        this.applicationId = applicationId;
        this.oid = oid;
        this.puid = puid;
    }

    /**
     * The client application Id.
     * 
    */
    public Optional<String> getApplicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * The client Oid.
     * 
    */
    public Optional<String> getOid() {
        return Optional.ofNullable(this.oid);
    }
    /**
     * The client Puid
     * 
    */
    public Optional<String> getPuid() {
        return Optional.ofNullable(this.puid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationClientDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String oid;
        private @Nullable String puid;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationClientDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.oid = defaults.oid;
    	      this.puid = defaults.puid;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder oid(@Nullable String oid) {
            this.oid = oid;
            return this;
        }
        public Builder puid(@Nullable String puid) {
            this.puid = puid;
            return this;
        }        public ApplicationClientDetailsResponse build() {
            return new ApplicationClientDetailsResponse(applicationId, oid, puid);
        }
    }
}
