// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyStrictTransportSecurity extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyStrictTransportSecurity Empty = new ResponseHeadersPolicyStrictTransportSecurity();

    @Import(name="accessControlMaxAgeSec", required=true)
      private final Integer accessControlMaxAgeSec;

    public Integer getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    @Import(name="includeSubdomains")
      private final @Nullable Boolean includeSubdomains;

    public Optional<Boolean> getIncludeSubdomains() {
        return this.includeSubdomains == null ? Optional.empty() : Optional.ofNullable(this.includeSubdomains);
    }

    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    @Import(name="preload")
      private final @Nullable Boolean preload;

    public Optional<Boolean> getPreload() {
        return this.preload == null ? Optional.empty() : Optional.ofNullable(this.preload);
    }

    public ResponseHeadersPolicyStrictTransportSecurity(
        Integer accessControlMaxAgeSec,
        @Nullable Boolean includeSubdomains,
        Boolean override,
        @Nullable Boolean preload) {
        this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec, "expected parameter 'accessControlMaxAgeSec' to be non-null");
        this.includeSubdomains = includeSubdomains;
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.preload = preload;
    }

    private ResponseHeadersPolicyStrictTransportSecurity() {
        this.accessControlMaxAgeSec = null;
        this.includeSubdomains = null;
        this.override = null;
        this.preload = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyStrictTransportSecurity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer accessControlMaxAgeSec;
        private @Nullable Boolean includeSubdomains;
        private Boolean override;
        private @Nullable Boolean preload;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyStrictTransportSecurity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.override = defaults.override;
    	      this.preload = defaults.preload;
        }

        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }
        public Builder includeSubdomains(@Nullable Boolean includeSubdomains) {
            this.includeSubdomains = includeSubdomains;
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder preload(@Nullable Boolean preload) {
            this.preload = preload;
            return this;
        }        public ResponseHeadersPolicyStrictTransportSecurity build() {
            return new ResponseHeadersPolicyStrictTransportSecurity(accessControlMaxAgeSec, includeSubdomains, override, preload);
        }
    }
}
