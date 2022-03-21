// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RevocationDetailsResponse {
    /**
     * Indicates why a Certificate was revoked.
     * 
     */
    private final String revocationState;
    /**
     * The time at which this Certificate was revoked.
     * 
     */
    private final String revocationTime;

    @CustomType.Constructor
    private RevocationDetailsResponse(
        @CustomType.Parameter("revocationState") String revocationState,
        @CustomType.Parameter("revocationTime") String revocationTime) {
        this.revocationState = revocationState;
        this.revocationTime = revocationTime;
    }

    /**
     * Indicates why a Certificate was revoked.
     * 
    */
    public String getRevocationState() {
        return this.revocationState;
    }
    /**
     * The time at which this Certificate was revoked.
     * 
    */
    public String getRevocationTime() {
        return this.revocationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RevocationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revocationState;
        private String revocationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RevocationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationState = defaults.revocationState;
    	      this.revocationTime = defaults.revocationTime;
        }

        public Builder revocationState(String revocationState) {
            this.revocationState = Objects.requireNonNull(revocationState);
            return this;
        }
        public Builder revocationTime(String revocationTime) {
            this.revocationTime = Objects.requireNonNull(revocationTime);
            return this;
        }        public RevocationDetailsResponse build() {
            return new RevocationDetailsResponse(revocationState, revocationTime);
        }
    }
}
