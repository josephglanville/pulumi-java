// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCookies extends io.pulumi.resources.InvokeArgs {

    public static final DistributionCookies Empty = new DistributionCookies();

    @InputImport(name="forward", required=true)
      private final String forward;

    public String getForward() {
        return this.forward;
    }

    @InputImport(name="whitelistedNames")
      private final @Nullable List<String> whitelistedNames;

    public List<String> getWhitelistedNames() {
        return this.whitelistedNames == null ? List.of() : this.whitelistedNames;
    }

    public DistributionCookies(
        String forward,
        @Nullable List<String> whitelistedNames) {
        this.forward = Objects.requireNonNull(forward, "expected parameter 'forward' to be non-null");
        this.whitelistedNames = whitelistedNames;
    }

    private DistributionCookies() {
        this.forward = null;
        this.whitelistedNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCookies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forward;
        private @Nullable List<String> whitelistedNames;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCookies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forward = defaults.forward;
    	      this.whitelistedNames = defaults.whitelistedNames;
        }

        public Builder setForward(String forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }

        public Builder setWhitelistedNames(@Nullable List<String> whitelistedNames) {
            this.whitelistedNames = whitelistedNames;
            return this;
        }
        public DistributionCookies build() {
            return new DistributionCookies(forward, whitelistedNames);
        }
    }
}
