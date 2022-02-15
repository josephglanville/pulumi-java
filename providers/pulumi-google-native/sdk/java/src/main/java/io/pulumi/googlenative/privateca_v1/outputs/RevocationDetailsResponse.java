// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RevocationDetailsResponse {
    private final String revocationState;
    private final String revocationTime;

    @OutputCustomType.Constructor({"revocationState","revocationTime"})
    private RevocationDetailsResponse(
        String revocationState,
        String revocationTime) {
        this.revocationState = Objects.requireNonNull(revocationState);
        this.revocationTime = Objects.requireNonNull(revocationTime);
    }

    public String getRevocationState() {
        return this.revocationState;
    }
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

        public Builder setRevocationState(String revocationState) {
            this.revocationState = Objects.requireNonNull(revocationState);
            return this;
        }

        public Builder setRevocationTime(String revocationTime) {
            this.revocationTime = Objects.requireNonNull(revocationTime);
            return this;
        }

        public RevocationDetailsResponse build() {
            return new RevocationDetailsResponse(revocationState, revocationTime);
        }
    }
}